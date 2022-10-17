package java010_abstract_interface.part04;

/*
 * <인터페이스(interface)>
 * 
 * http://www.tcpschool.com/java/java_polymorphism_interface
 * 
 * 1. 추상메서드와 상수를 가지고 있는 형태이다.
 * 2. 클래스 작성에 도움을 주기 위한 목적으로 제공되는 표준명세서이다.
 * 3. implements: 클래스에 인터페이스를 구현할 때 사용되는 키워드이다.
 * 4. 인터페이스는 접근제어자로 public만 제공한다.
 * 5. 인터페이스의 추상메서드에 abstract키워드를 명시하지 않아도 된다.
 *    자바가상머신에서 자동으로 처리하기 때문에!
 * 6. 모든 인터페이스의 메서드는 묵시적으로 public abstract이다.
 * 7. 멤버변수는 묵시적으로 public static final이다.
 * 8. 객체 생성은 하지 못하지만, 참조형 타입으로서는 사용 가능하다.
 * 	  int num = 10; 이라고만 작성해도
 *    내부에서는 public static final int num = 10;로 처리됨
 *    void prn(); 이라고만 작성해도
 *    public abstract void prn();로 처리됨
 *    
 * 				  class			interface   
 * 멤버변수			0			상수
 * 메서드			선언부+구현부		선언부(추상메서드)
 * 생성자				O			X
 * 초기화블록			O			X
 * 내부클래스			O			O
 * 
 * extends: 클래스에 클래스 상속(단일 상속),
 * 			인터페이스에 인터페이스 상속(다중 상속)
 * implements: 클래스에 인터페이스 구현(다중 구현)
 */

public class Java005_interface {

	public static void main(String[] args) {
		System.out.println(CarRun.carCount);
		CarRun.Sun s = new CarRun.Sun();

		Truck tk = new Truck();
		tk.prn();

	}

}
