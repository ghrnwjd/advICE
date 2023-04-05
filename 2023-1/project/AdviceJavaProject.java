import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class AdviceJavaProject {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, String> question = new HashMap<Integer, String>();

		question.put(1, "졸업 학점은 어떻게 되나요?");
		question.put(2, "학과 교수님은 누가 있나요?");
		question.put(3, "전공 필수 과목은 무엇인가요?");
		question.put(4, "전공, 교양 최소 이수학점은 어떻게 되나요?");
		question.put(5, "종료합니다");


		while (true) {
			for(Entry<Integer, String> e : question.entrySet()) {
				System.out.println(e.getKey() + "번, " + e.getValue());
			}
			
			System.out.println("숫자를 입력해주세요.");
			int number = Integer.parseInt(br.readLine());
			
			if(number == 5) {
				System.out.println(question.get(number));
				break;
			}
		}
	}
}
