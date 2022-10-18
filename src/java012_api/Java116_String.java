package java012_api;

public class Java116_String {

	public static void main(String[] args) {

		/*
		 * <String>
		 * 
		 * 참고: https://jackjeong.tistory.com/m/13
		 * 
		 * Immutable Class(불변 클래스) 참조 데이터 타입(Reference Data Type)
		 * 
		 * => Stack Memory 영역이 아닌 Heap Memory영역에 저장이 된다.
		 *    String은 다른 객체들과 달리 Heap Memory영역에 
		 *    String Pool이라는 영역을 따로 두어 그곳에 저장한다. (java 7이상)
		 */

		// String pool에 같은 값이 있는지 확인하고 있으면 그 주소값을 리턴한다.
		// 없다면 새로운 객체를 만들어 String pool에 할당한 뒤 그 주소값을 리턴한다.
		String sn = "java";
		String sg = "java";

		// new로 생성하면 다른 객체들처럼 강제로 Heap영역에 생성되고 그 주소값을 리턴한다.
		// 같은 글자를 갖는 String 개체가 있더라도 새로운 독립된 개체를 생성하게 된다.
		// 따라서 new 키워드 사용 시 갖고 있는 값이 모두 같더라도 주소값은 모두 다르다.
		String st = new String("java");
		String ss = new String("java");

		// 주소비교
		System.out.printf("sn==sg:%b\n", sn == sg); // true
		System.out.printf("st==ss:%b\n", st == ss); // false

		// 메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); // true
		System.out.printf("st.equals(ss):%b\n", st.equals(ss)); // true
		// st.equalsIgnoreCase(st): 대소문자 구분 안 함
		// st.equals(st): 대소문자 구분함

		// 메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);
	}

}
