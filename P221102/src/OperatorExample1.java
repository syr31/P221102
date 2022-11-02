
public class OperatorExample1 {

	public static void main(String[] args) {

		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char) (c2 + 1);     //명시적 (char)타입캐스팅 필수적으로 작성해줘야함
									  // (char) 작성하지않으면 산출 타입 : 디폴트 값으로 int로 산출된다.

		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}

}
