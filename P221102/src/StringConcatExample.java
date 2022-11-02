
public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "JDK";

		String str3 = str1 + str2;
		String str4 = str1 + "" + str2;

		String str5 = "JDK" + 3 + 3.0; // 문자열은 다른 타입과 +가 되면 문자열로 바뀐다.
		String str6 = 3 + 3.0 + "JDK"; // 문자열 java에서 매우 중요

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);

	}

}
