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

## ***6. 클래스***

자바에서 `클래스`란 `객체`를 만들어 내기 위한 틀이다.
클래스를 구현한 것이 객체라고 봐도 된다. 이때 클래스로부터 객체를 생성하는 과정을 `클래스의 인스턴스화`라고 한다. 

`인스턴스`란 메모리에 올라간 `객체`를 의미한다.

`class` 키워드를 통해 클래스를 선언하고 클래스의 구성요소를 `member`라고 한다.
member의 구성요소로는 `field`와 `method`가 있다.
또한 클래스는 객체의 필드를 초기화해주는 `constructor`를 가진다.

객체 내에 값을 저장할 멤버 변수를 필드라고 하며 선언된 위치에 따라 <br/>`static variable`, `instance variable`, `local variable` 로 나뉜다.

![변수종류와 특징](https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fe3a2442b-d93a-4f76-b503-f51f1b63157d%2FUntitled.png&blockId=9d2e4ecd-1690-40c4-896b-656e7f9c175c)
<br/>


객체의 행동을 구현하는 것을 메소드라고 한다.

클래스의 이름과 동일한 이름을 가진 메소드를 생성자라고 한다. 객체가 생성될때 자동으로 호출된다.
<br>

```
// 클래스
public class Student{
    
    // 필드
	String name;		//이름
	int studentNumber;	//학번
	String major;		//전공
	int grade;			//학년

    // 생성자
    public Student(String name) {
        this.name = name;
    }

    // 메소드
    public String getName() {
        return this.name;
    }
}
```

### ***추상 클래스***

하나 이상의 `abstract method`를 포함하고 있는 클래스라면 추상 클래스이다.
추상클래스의 메소드를 사용하려면 상속받아 반드시 추상메소드를 `재정의`해야한다.
추상클래스는 ***인스턴스를 생성할 수 없다.***

`추상메소드`란 자식 클래스에서 반드시 `override`해야 사용할 수 있는 메소드이다.


```
abstract class Animal { abstract void cry(); }

class Cat extends Animal { void cry() { System.out.println("냐옹냐옹!"); } }

class Dog extends Animal { void cry() { System.out.println("멍멍!"); } }
 

public class Polymorphism02 {

    public static void main(String[] args) {

        // Animal a = new Animal(); // 추상 클래스는 인스턴스를 생성할 수 없음.
        Cat c = new Cat();
        Dog d = new Dog(); 

        c.cry();
        d.cry();
    }
}
```

## ***인터페이스***

자식 클래스가 여러 부모클래스를 상속할 수 있다면 부모 클래스에서 선언한 메소드를 모두 사용할 수 있지만 어떤 부모의 메소드인지 모호해지기 때문에 자바에서는 `다중상속`을 지원하지 않는다.

다중상속의 메리트를 유지하기 위해 자바에서는 `인터페이스`를 지원하고 추상메소드와 상수만을 포함할 수 있다. `추상클래스`와 다른점은 생성자를 선언하지는 못한다.

### 규칙
- 인터페이스의 모든 필드는 `public static final `이어야 한다.
- 인터페이스의 모든 메소드는 `public abstract` 여야 한다.

생략되었다면 자바컴파일러가 자동으로 추가한다.

```
interface Animal { public abstract void cry(); }
interface Pet { public abstract void play(); }

class Cat implements Animal, Pet {

    public void cry() {
        System.out.println("냐옹냐옹!");
    }
    public void play() {
        System.out.println("쥐 잡기 놀이하자~!");
    }
}

 

class Dog implements Animal, Pet {
    
    public void cry() {
        System.out.println("멍멍!");
    }

    public void play() {
        System.out.println("산책가자~!");
    }
}

 

public class Polymorphism {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        c.play();

        d.cry();
        d.play();
    }
}
```

예제<br>
```
public class Main {	
	
	public static void main(String[] args) throws IOException {
		
		Animal animal = new Animal();
		animal.getLegs();
		
		Person person = new Person();
		person.getLegs();
		person.personSpeak();		
        
	}
}

class Animal {
	String name;
	int legs;
	
	public Animal() {
		name = null;
		this.legs = 4;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public void getLegs() {
		System.out.println(name + " " + this.legs + "개의 다리를 가지고 있습니다.");
	}	
}

class Person extends Animal {
		
	public Person() {
		super();
		super.name = "사람";
		super.legs = 2;		
	}
	
	public void personSpeak() {
		System.out.println("사람은 말을 할 수 있어요.");
	}	
}
```