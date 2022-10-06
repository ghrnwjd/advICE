# 첫주차 내용

첫 주차에는 연산자, 조건, 반복문, 배열에 대해 알아보겠습니다.

## ***1. 연산자***

|연산자 이름|연산자|
|------|---|
|산술 연산자|`+`, `-`, `*`, `/`, `%`|
|비교 연산자|`>`, `<`, `>=`, `<=`, `==`, `!=`|
|논리 연산자|`&&`, `||`, `!`|
|삼항 연산자|`?,:`|
|대입 연산자|`=`, `*=`, `/=`, `%=`, `+=`, `-=`|
|증감 연산자| `++`, `--`|

### 우선순위
`증감 >> 산술 >> 비교 >> 논리 >> 삼항 >> 대입` 순으로 우선순위를 가진다.

```
int x = 0;

int y = x++;
-> y = x, x = x + 1; 

int z = ++x;
-> x = x + 1, z = x;
```

## ***2. 조건문***

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

> 간단한 조건문 삼항연산자로 표현하기

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


## ***3. 반복문***
반복문으로는 `for`, `while`, `do-while`이 있다.

### for 문
```
for(초기식; 조건식; 증감식) { 
    // 코드 
}
```

초기식 → 조건식 → 코드 → 증감식 반복
### while 문
```
while(조건식) { 
    // 코드 
}
```

조건식 → 코드 반복
### do-while 문
```
do {
    // 코드
} while(조건식)
```
코드 → 조건식 반복

다음과 같은 코드에서 while, do-while의 차이점을 알 수 있다.

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

## ***4. 배열***

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

