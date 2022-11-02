import java.util.Scanner; // Scanner를 사용하기 위해 추가

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
//		String input = Scanner.next(); // 공백을 만나게 되면 짤려서 출력됨 "자바가 "
//		int input = Scanner.nextint(); // 정수값 입력
//		double input = scanner.nextDouble(); //실수값을 입력 (정수를 입력해도 가능 ex : 56입력 -> 56.0 출력)
//		char input = scanner.next().charAt(0); // char 타입 입력 , 문자열 중 0번을 떼어내어 input에 담아준다.
		
		scanner.close(); // 똑같이 앞자리 대소문자를 확인해야함
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :" + input);
		System.out.printf("num=%d%n", num);

	}

}
