package java012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//<정규표현식(Regular expression)>

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#sum
//https://en.wikipedia.org/wiki/Regular_expression
//https://www.nextree.co.kr/p4327/
//https://regexper.com/ => 정규표현식 테스트 사이트

/*
 * 아이디를 입력할 때 영문자, 숫자 조합으로 합니다.
 * 최소 5자 이상 10자 이하까지만 가능합니다.
 * (반드시 영문자로 시작한다.)
 * 
 * [출력결과]
 *  로그인이 되었습니다.
 *  회원이 아닙니다.
 */
public class Java128_RegEx {

	public static void main(String[] args) {
		System.out.print("ymy232");
		display(process("y23m1"));

		System.out.print("korea");
		display(process("korea"));

	}// end main()

	public static boolean process(String sn) {
		// 여기를 구현하세요.

		return sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}") && Pattern.compile("\\d").matcher(sn).find();

	}// end process()

	public static void display(boolean res) {
		if (res)
			System.out.println(" 로그인이 되었습니다.");
		else
			System.out.println(" 회원이 아닙니다.");
	}// end display()

}// end class
