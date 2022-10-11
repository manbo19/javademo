package java005_method;

public class Java058_method {

	public static void main(String[] args) {
		// 조건: data변수에는 소문자만 입력
		char data = 'd';
		char code = process(data);
		System.out.printf("%c의 대문자는 %c입니다. \n", data, code);

	}// end main()

	// data매개변수의 값을 대문자로 변경해서 리턴
	public static char process(char data) {
		// 1. 대문자 A(65), 소문자 a(97)의 유니코드
		// 2. 대문자와 소문자 차이
		// 3. int 이하의 데이터 타입끼리 연산이 되면 결과는 int로 리턴된다.

		return (char) (data - 32); // char로 형변환
	}

}// end class
