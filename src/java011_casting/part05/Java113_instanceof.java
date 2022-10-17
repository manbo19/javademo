package java011_casting.part05;

/*
 * <instanceof(객체 타입 확인)>
 * 
 * https://mine-it-record.tistory.com/m/120
 * 
 * 객체 타입을 확인하는 연산자이다.
 * 형변환 가능 여부를 확인하며 true/false로 결과를 반환한다.
 * true => 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
 * 값이 null인 참조변수에 대해 instanceof 연산을 수행하면 false가 나온다.
 * 주로 상속 관계에서 부모객체인지 자식객체인지 확인하는 데 사용된다.
 * 
 * ★ 형변환이 불가능한 즉, 타입이 상위클래스도 하위클래스도 아닐 경우에는 에러가 난다.
 * 
 * 객체 instanceof 클래스
 * 
 * 
 */

class ExamA {
	void prn() {
	}
}

class ExamB extends ExamA {
	void prn() {
	}
}

class ExamC extends ExamB {
	void prn() {
	}
}

/////////////////////////////////////////////////

public class Java113_instanceof {
	public static void main(String[] args) {
		// 객체 instanceof 비교 데이터 타입과 같거나 조상데이터 타입이면 true
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA); // true

		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB); // false

		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA); // true
		System.out.println(ea instanceof ExamB); // true
		System.out.println(ea instanceof ExamC); // false
	}
}
