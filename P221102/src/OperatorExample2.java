
public class OperatorExample2 {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;

		int iz = x * y;
		long lz1 = (long) x * (long) y;          // 연산자 우선순위 (long) 타입캐스팅이 우선으로 진행됨
		long lz2 = (long) (x * y);   			// 우선순위 (x * y) 먼저 진행되고 값이 깨진상태로 long ** 다시 질문

		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}
}
