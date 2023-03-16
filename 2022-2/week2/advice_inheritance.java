import java.io.IOException;

// 수업을 예로 듬

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
