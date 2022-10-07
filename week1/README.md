# ***변수 타입, 연산자, 조건문, 반복문, 배열***


## ***1. 변수 타입***
<br/>

> **변수 이름 규칙**
> 1. 첫번째 글자는 문자, $, _ 이어야 하며 숫자로 시작할 수 없다.
> 2. 대소문자가 구분된다.
> 3. 첫 문자는 소문자로 시작하되 합성어일 경우 첫문자는 대문자로 한다.
> 4. 문자 길이의 제한이 없다.
> 5. 자바 예약어를 사용할 수 없다.

<br/>

## 자바 예약어
<br/>

![예약어](https://t1.daumcdn.net/cfile/tistory/99BAFA3E5E560B3505)

## 탈출 문자
<br/>

![탈출문자](https://mblogthumb-phinf.pstatic.net/20140601_77/29java_1401551406290LnlVt_PNG/20140601_192550.png?type=w2)

<br>

## 변수의 초기화
<br/>

```
int a;
int b = a + 10; // The local variable a may not have been initialized

int c = 10;
int d = c + 10;
```

## 데이터 타입
<br/>

![데이터타입](https://images.velog.io/images/bsjp400/post/3dbf9472-4934-438e-8f5a-08f84d06c5e0/image.png)

<br/>

```
byte b = -30; 
int i = 1000000; 
// print(i * i) 의 값은?

long l = 1000L;
float f = 10.3F;
double d = 10.3;
		
char c = ' ';
// 공백 문자는 컴파일 에러가 발생.
String s = "";
// 공백 문자열은 빈 문자열로 인식.

boolean booleanVariable = true;
```

<br/>

  
## ***2. 연산자***
<br/>


|연산자 이름|연산자|
|------|---|
|산술 연산자|`+`, `-`, `*`, `/`, `%`|
|비교 연산자|`>`, `<`, `>=`, `<=`, `==`, `!=`|
|논리 연산자|`&&`, `||`, `!`|
|삼항 연산자|`?,:`|
|대입 연산자|`=`, `*=`, `/=`, `%=`, `+=`, `-=`|
|증감 연산자| `++`, `--`|
<br/>


## 우선순위
`증감 >> 산술 >> 비교 >> 논리 >> 삼항 >> 대입` 순으로 우선순위를 가진다.

```
int x = 0;

int y = x++;
-> y = x, x = x + 1; 

int z = ++x;
-> x = x + 1, z = x;
```
<br/>

## ***3. 조건문***

```
if ( 조건 1 ) {
    코드
}
else if ( 조건 2 ) {
    // 조건 1은 이미 아닌 상태
    // 그러므로 else if (조건 1 && 조건 2) 로 쓸 필요 없음.
    코드
}
else {
    // 앞서 나열한 조건이 모두 아닐 시 실행
}
```
<br/>


> ***간단한 조건문 삼항연산자로 표현하기***

<br/>


```
int myAge = 20;
int ans = -1;

if(myAge > 20 ) {
    ans = 1;
}
else {
    ans = 0;
}

// 삼항연산자 사용
// (조건문) ? 참 : 거짓으로 표현
int ans = (myAge > 20) ? 1 : 0;
```

<br/>



## ***4. 반복문***
반복문으로는 `for`, `while`, `do-while`이 있다.

## for 문
```
for(초기식; 조건식; 증감식) { 
    // 코드 
}
```

초기식 → 조건식 → 코드 → 증감식 반복
<br/>

## while 문
```
while(조건식) { 
    // 코드 
}
```

조건식 → 코드 반복
<br/>

## do-while 문
```
do {
    // 코드
} while(조건식)
```
코드 → 조건식 반복

다음과 같은 코드에서 `while`, `do-while`의 `차이점`을 알 수 있다.

```
int myAge = 20;

while(myAge > 30) {
    System.out.println(myAge);
    myAge++;
}

do {
    System.out.println(myAge);
    myAge++;
} while(myAge > 30)
```
<br/>

## ***5. 배열***
<br/>

메모리 사용영역을 크게 `메소드영역`, `스택 영역`, `힙 영역`으로 나뉜다.

- `메소드영역` : 자바 코드`.java`를 컴파일하여 만들어진 실행코드`.class`가 적재된 메모리 영역으로 class 파일을 읽어 메모리에 올린다. 주로 메소드 데이터, 메소드 코드, 생성자 코드 등 실행에 필요한 바이트코드, 상수, 전역변수가 담겨있다.


- `힙 영역` : 프로그래머가 LifeCycle을 제어할 수 있는 메모리를 말한다. 주로 `new` 키워드를 사용하여 생성하는 객체를 담고 객체가 `garbage`가 되면 `garbage Collector`에 의해 메모리에서 제거된다.. `배열`, `문자열`도 객체에 해당된다.


- `스택 영역` : 스레드마다 독립적으로 존재한다. 프로세스당 최소 한개의 스레드가 존재하는데 자바의 경우 `main 메소드`가 기본 스레드이다. 주로 메소드의 인자, 지역변수, 리턴값, 리턴주소가 저장된다.
  
<br/>


객체를 예로 들어 메모리 영역을 살펴보면 다음과 같다.
```
객체 studyObject1 = new 객체();
객체 studyObject2 = new 객체();
객체 studyObject3 = studyObject2;

studyObject1 == studyObject2 // false

studyObject2 == studyObject3 // true

``` 

++ 문자열 예시
```
String myTown = "용인";
String yourTown = "용인";
String universityTown = new String("용인");

System.out.println(myTown == yourTown); // true
System.out.println(myTown == universityTown); // false
System.out.println(myTown.equals(universityTown)); // true
```
  
***배열 선언 방법***
1. 자료형 [] 변수명 = { d1, d2, d3 };
2. 자료형 [] 변수명 = new 자료형[배열크기];

```
// 배열에 1,2,3,4,5 를 담아라 

// 첫번째 방법 풀이
int [] intArr1 = {1, 2, 3, 4, 5};

// 두번째 방법 풀이
int [] intArr2 = new int [5];

for(int i = 1; i <=5 ; i++) {
    intArr2[i-1] = i;
}
```

`두번째 방법` 을 거의 사용한다고 봐도 무방.

위 경우처럼 배열에 데이터가 담겨있다고 가정했을 경우 `for-each` 반복문 사용하기

```
int [] arr = {1,2,3,4,5};

for( int temp : arr ) {
    System.out.print(temp + " ");
    // 1 2 3 4 5
} 
```

```
1. boolean isSunny, isRainy;
2. int a1, a2, a3 = 1;
3. double d1 = 100000;
4. short s1 = 100000;
5. String str1 = new String("새로운 문자열");
```

```
String adviceDay = "20221012";
boolean allAttendance = false;
		
if(adviceDay.equals("20221012")) {
	if(allAttendance) {
		String str = "모두 참석하였습니다.";
	}
	System.out.println(str);
}
```


