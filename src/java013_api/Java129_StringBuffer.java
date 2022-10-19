package java013_api;

/*
 * java.lang.String: immutable(불변, 수정할 수 없음)
 * java.lang.StringBuffer: mutable(가변, 수정할 수 있음), 동기화
 * java.lang.StringBuilder: mutable(가변, 수정할 수 있음), 비동기화
 * 
 * 
 * 
 * <StringBuffer의 특징>
 * 1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
 * 2. 기본 16문자 크기고 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 */
public class Java129_StringBuffer {
	public static void main(String[] args) {
		String sg = new String("java test java"); // String은 한 번 메모리에 저장되면 변경X (immutable)
		String ss = sg.replace("java", "jsp");
		System.out.println("ss: " + ss);
		System.out.println("sg: " + sg);
		System.out.println(ss == sg); // false => 주소값이 다름
		System.out.println(sg.toString()); // java test java

		StringBuffer sb = new StringBuffer("spring test"); // StringBuffer(mutable)
		StringBuffer su = sb.replace(0, 6, "framework");
		System.out.println("sb: " + sb);
		System.out.println("su: " + su);
		System.out.println(sb == su); // true => 주소값이 같음
		System.out.println(sb.equals(su)); // true
		System.out.println(sb.toString()); // framework test
		
		/*
		 * equals()
		 * : 객체끼리 내용을 비교할 수 있도록 하는 메서드
		 *   비교하고자 하는 대상의 내용 자체를 비교
		 * ==
		 * : 비교를 위한 연산자
		 *   비교하고자 하는 대상의 주소값을 비교
		 */

	}// end main()
}// end class
