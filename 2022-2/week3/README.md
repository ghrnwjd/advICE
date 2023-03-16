# ***자바 인터페이스***

`협업`, `유지보수 용이`, `종속성 방지`,`다중 상속` 등의 이유로 인터페이스를 사용합니다.

인터페이스는 자바에서 `클래스`들이 구현해야 하는 `동작`을 지정하는 용도로 사용되는 추상 자료형

class 를 `상속`한다. `extends`
<br/>

interface 를 `구현`한다. implements`

## ***예제***


### 인터페이스 
```
public interface interface_example {
	// 학과를 예로 듬
	
	public abstract void max_person(int applied_student); // 학과 정원
	
	int required_credit(); // 졸업을 위해 필요한 학점
	
	void required_subject(); // 필수 과목
	
	void department_event(); // 학과 행사
	
	void department_professor(); // 학과 교수
	
	void department_session(); // 학과 학회
	
}
```

### 구현

```
public class advice_interface {

	public static void main(String[] args) {
	
		Department_of_information information = new Department_of_information();
		
		Department_of_Computer computer = new Department_of_Computer();
	}

}



class Department_of_information implements interface_example{

	@Override
	public void max_person(int applied_student) {
		// TODO Auto-generated method stub
		int max_department_student = 50;
		if(applied_student > max_department_student) {
			System.out.println(applied_student - max_department_student
					+ "명의 학생을 떨어집니다.");			
		}
		else {
			System.out.println("모두 합격하였습니다.");
		}
	}
	

	@Override
	public int required_credit() {
		// TODO Auto-generated method stub
		int required_credit = 140;
		return required_credit;
	}

	@Override
	public void required_subject() {
		// TODO Auto-generated method stub
		String [] essential_subject = new String []  {
			"자료구조", "신호및시스템", "데이터통신", "컴퓨터네트워크"} ;
		
		for (String subject : essential_subject) {
			System.out.println(" 필수 들어야 할 과목은 " + subject + "입니다.");
		}
	}

	@Override
	public void department_event() {
		// TODO Auto-generated method stub
		String [] department_event = new String []  {
				"해오름식", "과MT" } ;
		for (String event : department_event ) {
			System.out.println(" 우리 과 학회는 " + event + "입니다.");
		}
		
	}

	@Override
	public void department_professor() {
		// TODO Auto-generated method stub
		String [] department_professor = new String []  {
				"홍길동", "김철수", "박영희" } ;
		for (String professor : department_professor ) {
			System.out.println(" 우리 과 학회는 " + professor + "입니다.");
		}
	}

	@Override
	public void department_session() {
		// TODO Auto-generated method stub
		String [] department_session = new String []  {
				"Advice", "FICS" } ;
		for (String session : department_session ) {
			System.out.println(" 우리 과 학회는 " + session + "입니다.");
		}
	}

}

class Department_of_Computer implements interface_example{


	@Override
	public void max_person(int applied_student) {
		// TODO Auto-generated method stub
		int max_department_student = 100;
		if(applied_student > max_department_student) {
			System.out.println(applied_student - max_department_student
					+ "명의 학생을 떨어집니다.");			
		}
		else {
			System.out.println("모두 합격하였습니다.");
		}
	}
	

	@Override
	public int required_credit() {
		// TODO Auto-generated method stub
		int required_credit = 150;
		return required_credit;
	}

	@Override
	public void required_subject() {
		// TODO Auto-generated method stub
		String [] essential_subject = new String []  {
			"자료구조", "컴파일러구성론", "딥러닝", "자연어처리"} ;
		
		for (String subject : essential_subject) {
			System.out.println(" 필수 들어야 할 과목은 " + subject + "입니다.");
		}
	}

	@Override
	public void department_event() {
		// TODO Auto-generated method stub
		String [] department_event = new String []  {
				"해오름식", "과MT" } ;
		for (String event : department_event ) {
			System.out.println(" 우리 과 교수님은 " + event + "입니다.");
		}
		
	}

	@Override
	public void department_professor() {
		// TODO Auto-generated method stub
		String [] department_professor = new String []  {
				"차민철", "이철수", "외국인교수님" } ;
		for (String professor : department_professor ) {
			System.out.println(" 우리 과 교수님은 " + professor + "입니다.");
		}
	}

	@Override
	public void department_session() {
		// TODO Auto-generated method stub
		String [] department_session = new String []  {
				"Advice", "FICS" } ;
		for (String session : department_session ) {
			System.out.println(" 우리 과 학회는 " + session + "입니다.");
		}
	}

}
```