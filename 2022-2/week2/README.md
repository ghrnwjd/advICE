## 상속 (Inheritance)

자식 클래스와 부모 클래스가 존재하고 자식 클래스는 상속 받고싶은 부모 클래스를 선택해서 상속한다. 상속받는 클래스를 `자식 클래스`, `하위 클래스`, `서브 클래스`라고 한다.
상속을 해주는 클래스를 `부모 클래스`, `상위 클래스`, `슈퍼 클래스` 라고 한다.

### ***상속 선언***
![상속선언](https://postfiles.pstatic.net/MjAxNzAzMTVfMjg2/MDAxNDg5NTg3Njk3Nzc3.Rk08cHWylj483VWcKRYlrap4XP1m_-FTmR5VhWxmG9Ig.9XRVJRczh7PQehqrfUs1N-usfyhb3MNbY1EW_qZnCsEg.PNG.heartflow89/image.png?type=w773)
<br/>

### 상속을 하게 된다면 ?
자식 클래스가 부모 클래스의 멤버변수, 메서드를 물려받는다. 하지만 접근제어자 `private`으로 설정된 변수나 메소드의 경우 상속이 불가능하다.
<br/>

+++ 클래스의 변수는 `private`으로 설정하고 `getter, setter` 메소드를 이용해 받아오는 것이 일반적임.

자바에서는 자식 클래스가 여러 부모로 부터 상속받는 `다중 상속`이 불가능하다. 오직 한개의 부모를 상속할 수 있다. `단일 상속`만을 허용한다.
<br/>

다중 상속의 장점을 활용하기 위한 것이 `인터페이스 구현`을 통해 해결.

![다중상속](https://postfiles.pstatic.net/MjAxNzAzMTVfMTY4/MDAxNDg5NTg5MTkyMDc1.KNjQkB-hiAzc8hTPE8btwb2c4AI4XUpP48wxZbSLx1Mg.-s95ygWqGmRNymFlNoILfMgt3WleMtAN_8EOzflWo2sg.PNG.heartflow89/image.png?type=w773)

## ***예제 코드***
```
import java.io.IOException;

//수업을 예로 듬
class Parent {

	int count_subject;
	String pencil;
	String[] book;

	public Parent() {
		count_subject = 2;
		pencil = "monami";
		book = new String[count_subject];
		book[0] = "국어";
		book[1] = "수리";
	}

	public void printSubject() {
		for (int i = 0; i < count_subject; i++) {
			System.out.print(book[i] + " ");
		}
		System.out.println();
	}

	public void 공부하는방식() {
		System.out.println("나는 " + pencil + " 로(으로) 공부합니다.");
	}

}

class FirstChild extends Parent {

	public FirstChild() {
		super();
		count_subject = 3;
		pencil = "Sharp";
		book = new String[count_subject];
		book[0] = "국어";
		book[1] = "수리";
		book[2] = "영어";
	}

}

class Me extends Parent {

	public Me() {
		super();
		count_subject = 4;
		pencil = "ZetStream";
		book = new String[count_subject];
		book[0] = "국어";
		book[1] = "수학";
		book[2] = "영어";
		book[3] = "자바";
	}

	String laptop = "gram";
	String Tablet = "IPad";

	@Override
	public void 공부하는방식() {
		System.out.println("국어, 영어는 " + Tablet + " 으로 공부합니다.");
		System.out.println("수학은 " + pencil + " 으로 공부합니다.");
		System.out.println("자바는 " + laptop + " 으로 공부합니다.");
	}

	// Overloading
	public void 공부하는방식(boolean sleep) {
		if(sleep) {
			System.out.println("나는 잠오면 공부하지 않아요");
		}
	}

}

public class advice_inheritance {

	public static void main(String[] args) throws IOException {

		Parent myMother = new Parent();
		myMother.printSubject();
		myMother.공부하는방식();
		System.out.println();

		FirstChild myBrother = new FirstChild();
		myBrother.printSubject();
		myBrother.공부하는방식();
		System.out.println();

		Me hoyoung = new Me();
		hoyoung.printSubject();
		hoyoung.공부하는방식();
		boolean 잠이와요 = true;
		hoyoung.공부하는방식(잠이와요);
		System.out.println();
		

	}
}
```