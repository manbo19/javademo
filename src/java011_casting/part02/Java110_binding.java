package java011_casting.part02;

/*
 * <다형성(polymorphism)>
 * 
 * 1. 사전적 의미는 '여러가지 형태를 가질 수 있는 능력'을 의미한다.
 * 2. 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조하는 기술이다.
 * 	  예를 들면, 하나의 타입으로 상속관계에 있는 여러 객체를 다루는 기술이다.
 * 3. 하나의 객체가 여러 가지 타입을 가질 수 있다는 것을 의미한다.
 * 4. 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여
 *	  구현하고 있다.
 *	  이때, 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수와 같거나
 *    적어야 참조할 수 있다.
 * 5. 상속, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나이다.
 * ★ 자식 클래스 타입의 참조 변수로는 부모 클래스 타입의 인스턴스를 참조할 수 없다.
 *   참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 많기 때문이다.
 *   => 클래스는 상속을 통해 확장될 수는 있어도 축소될 수는 없으므로,
 *   	자식 클래스에서 사용할 수 있는 멤버의 개수가 언제나 부모 클래스와 같거나 많다.
 * 
 * <바인딩(binding)>
 * 
 * https://sorjfkrh5078.tistory.com/m/87
 * 
 * : 메서드 호출을 실제 메서드의 몸체와 연결하는 기술이다.
 *   프로그램에 사용된 구성 요소의 실제 값 또는 property를 결정짓는 행위를 의미한다.
 *   즉, 프로그램에서 사용되는 변수나 메서드 들 모든 것들이 결정되도록 연결해주는 것이다.
 * 
 * 1. 정적 바인딩(static binding)
 * 	: 컴파일 단계에서 어떤 클래스의 어떤 메서드가 호출되는지 연결하는 기술
 * 	- 컴파일 시간(Compiletime)에 결정
 *    (메서드의 매개변수 종류와 개수가 다르면 컴파일 과정에서 구분할 수 있음)
 *  - 프로그램이 실행되어도 변하지 않음
 * 	- 오버로딩(overloading)
 *   : 같은 이름의 메서드를 매개변수 타입과 개수를 다르게 정의하여 다양한 메서드를 구현하는 것
 *   (컴파일 과정에서 어떤 메서드를 호출할지 결정되기 때문에 오버로딩은 정적 바인딩이다.)
 *  - private, final, static이 붙은 메서드
 * 
 * 2. 동적 바인딩(dynamic binding)
 * 	: 실행 단계에서 어떤 클래스의 어떤 메서드가 호출되는지 연결하는 기술 
 *  - 실행시간(Runtime)에 결정
 *  - 늦은 바인딩(Late Binding)이라고도 부름
 *  - 오버라이딩(overriding)
 *   : 상속 관계에 있는 클래스 같에 같은 이름을 재정의하는 것
 *   (실행 시간에 어떤 메서드가 호출할지가 정해지기 때문에 오버라이딩은 동적 바인딩이다.)
 *  - Java에서의 다형성, 상속이 가능한 이유
 * 
 */
public class Java110_binding {
	public static void main(String[] args) {

		Employee emp = new Employee("Steven", "code001");
		process(emp);

		Manager mg = new Manager("Neesa", "professor", "second");
		process(mg);
	}

//	public static void process(Employee emp) {
//		System.out.println(emp.toString());
//		System.out.println(emp.pay());
//
//	}
//
//	public static void process(Manager mg) {
//		System.out.println(mg.toString());
//		System.out.println(mg.display());
//
//	}

	public static void process(Object obj) { // 업캐스팅
		System.out.println(obj.toString());
		if (obj instanceof Employee) {
			Employee em = (Employee) obj; // 다운캐스팅
			System.out.println(em.pay());
		} else if (obj instanceof Manager) {
			Manager mg = (Manager) obj; // 다운캐스팅
			System.out.println(mg.display());
		}
	}
}
