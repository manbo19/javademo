package java013_api;

import java.util.StringTokenizer;

public class Java132_StringTokenizer {

	public static void main(String[] args) {
		/*
		 * <StringTokenizer>
		 * 문자열을 지정한 구분자로 쪼개주는 클래스
		 * 하나의 문자열을 여러 개의 토큰으로 분리하는 클래스
		 * 쪼개어진 문자열을 토큰(token)이라고 부른다.
		 * 
		 * StringTokenizer("문자열", "구분자")
		 * 문자열의 구분자가 공백일 때는 두번째 인자값은 생략할 수 있다.
		 * StringTokenizer st = new String("java,jsp", ",");
		 * 
		 * countTokens(): 남아있는 토큰의 개수를 반환한다.
		 * 				  전체 토큰의 개수가 아닌 현재 남아있는 토큰의 개수를 반환한다.
		 * nextToken(): 메서드 다음의 토큰을 반환한다.
		 * hasMoreTokens(): 남아있는 토큰이 있으면 true를 리턴, 더 이상 토큰이 없으면 false를 리턴
		 * 
		 * 
		 */

		StringTokenizer st = new StringTokenizer("java jsp");
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());

//		int count = st.countTokens();
//		for (int i = 0; i < count; i++) {
//			System.out.println(st.nextToken());
//		}

		// 메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴한다.
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}// end main()

}// end class
