import java.util.*;

public class advice_test_ans {

	public static void main(String[] args) {
		
		/*
		 * 중간성적 클래스와 기말성적 클래스 총 두개의 클래스를 만들고 필요에 따라 더 만들어도 됩니다.
		 * 이 두개의 클래스는 OneSemesterGrade 클래스를 상속받습니다.
		 * 
		 * 가정 : 이 학생은 이번학기에 3학점 전공을 4개, 2학점 교양을 2개 듣는다고 합니다. 
		 * 		전공, 교수님이름 = { "자료구조" : "홍길동", "컴퓨터프로그래밍" : "김철수", "알고리즘" : "홍길동", "논리회로" : "나영희" }
		 * 		교양, 교수님이름 = { "대학영어" : "James", "기초미적분학" : "탁영수" }
		 *		// Getter, Setter 메소드를 사용해 입력하세요.
		 * 		// 몇점을 받았는지는 그 메소드의 매개변수로 받아올 것 입니다. => 메소드를 구현.
		 * 	 
		 * 
		 * 1. 다음학기에 들을 수 있는 학점을 출력합니다. 
		 *   => 예로 이번학기에 17학점을 들었다고 한다면 40-17인 23학점을 들을 수 있다고 가정합니다.
		 * 2. 성적을 매기는 방식은 절대평가로써 95점이 넘으면 A+, 90점이 넘으면 A, 85점이 넘으면 B+ 80점이 넘으면 B, 그 이하는 F를 줍니다. 여기서 넘는다는 이상(>=)을 말합니다
		 * 	 => score_print() 함수를 사용하여 구현한다고 했을 때, A를 맞으면 상위 30퍼입니다. B를 맞으면 상위 60퍼입니다. F를 맞으면 재수강 하시겠습니까? 를 출력합니다. 
		 * 3. 같은 A라는 등급의 성적이어도 가장 평균이 높은 과목의 해당 교수님이 홍길동 학생의 지도교수가 된다고 할 때 지도교수를 출력하는 메소드를 만들어주세요.
		 * 4. 17학점 이상 들었으며, 학점 평균이 4.3 이 넘는다면 '장학금을 수여합니다' 라는 문구를 출력합니다. 
		 *	 => A+ 4.5, A 4.0, B+ 3.5, B 3.0, F 0 학점이라고 가정합니다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		// 1번
		OneSemesterGrade original = new OneSemesterGrade();
		original.setCredit(16); // 3 * 4 + 2 * 2
		original.scoreGrade = new double [6];
		
		
		System.out.println(original.max_credit - original.getCredit() + "학점을 다음학기에 들을 수 있습니다.");
		
		// 2번
		ArrayList<String []> study = new ArrayList<>();
		study.add(new String [] {"자료구조", "홍길동"});
		study.add(new String [] {"컴퓨터프로그래밍", "김철수"});
		study.add(new String [] {"알고리즘", "홍길동"});
		study.add(new String [] {"논리회로", "나영희"});
		study.add(new String [] {"대학영어", "James"});
		study.add(new String [] {"기초미적분학", "탁영수"});
		original.setSubject_professor(study);
		
		Mid mid = new Mid();
		Final final_ = new Final();
		
		double [] mid_score = new double [6];
		for(int i = 0; i < mid_score.length; i++) {			
			System.out.println(original.getSubject_professor().get(i)[0] + "의 중간고사 성적을 입력하세요");
			mid_score[i] = sc.nextInt();
		}
		
		mid.setScore(mid_score);
		
		double [] final_score = new double [6];
		for(int i = 0; i < final_score.length; i++) {			
			System.out.println(original.getSubject_professor().get(i)[0] + "의 기말고사 성적을 입력하세요");
			final_score[i] = sc.nextInt();
		}
		
		final_.setScore(final_score);
		
		original.sumScore(mid_score, final_score);	
		// 3번
		original.printGrade();
		
		// 4번
		original.장학금여부();
	}

}



class OneSemesterGrade {
	
	final int max_credit = 40; // 일년에 들을 수 있는 학점은 총 40점입니다.
	
	private int credit; // 이번학기에 듣는 학점	
	
	// case 1 
	private ArrayList<String []> subject_professor; // 교과목, 교수님 
	
	// case 2
	// String [] professor_name ; // 교과목 교수님 이름
	// String [] subject; // 교과목 이름
	
	private double [] score ; // 교과목에 대한 점수 // 인덱스를 위와 맞출 것
	
	double [] scoreGrade;
	
	public OneSemesterGrade () {
		credit = 0;
		subject_professor = null;
		score = new double [6];
		scoreGrade= null;
	}

	// Getter, Setter
	
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public ArrayList<String[]> getSubject_professor() {
		return subject_professor;
	}

	public void setSubject_professor(ArrayList<String[]> subject_professor) {
		this.subject_professor = subject_professor;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
	}	
	
	public void sumScore(double [] mid, double [] final_) {
		for(int i = 0; i < 6; i ++) {
			this.score[i] = mid[i] + final_[i] / 2;
		}
	}
	
	public void printGrade() {
		
		for(int i = 0; i < 6 ; i ++) {
			StringBuilder sb = new StringBuilder();
			sb.append(this.getSubject_professor().get(i)[0] + "의 결과는 ");
			if (this.score[i] >= 95) {
				sb.append("A+ 입니다.");
				scoreGrade[i] = 4.5;
			}
			else if (this.score[i] >= 90) {
				sb.append("A 입니다.");
				scoreGrade[i] = 4.0;
			}
			else if (this.score[i] >= 85) {
				sb.append("B+ 입니다.");
				scoreGrade[i] = 3.5;
			}
			else if (this.score[i] >= 80) {
				sb.append("B 입니다.");
				scoreGrade[i] = 3.0;
			}
			else {
				sb.append("F 입니다");
				scoreGrade[i] = 0;
			}
			
			System.out.println(sb.toString());
		}
	}
	
	public void 장학금여부 () {
		if(this.credit >= 17) {
			double sum = 0;
			for(int i = 0; i < 6; i++) {
				sum += this.scoreGrade[i];
			}
			if(sum / 6 >= 4.3 ) {
				System.out.println("장학금 수여 대상입니다.");
			}
			else {
				System.out.println("장학금 수여 대상이 아닙니다.");
			}
		}
		else {
			System.out.println("장학금 수여 대상이 아닙니다.");
		}
	}
}

class Mid extends OneSemesterGrade {	
		
	
}

class Final extends OneSemesterGrade {
	
	
}
