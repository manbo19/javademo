package java011_casting.part01;

/*
 * 데이터 타입
 * 1. primitive data type(기본 데이터 타입)
 * 2. reference data type(참조 데이터 타입): array, class, interface
 * 
 * <인자전달방식>
 * 1. call by value
 *  : 값에 의한 복사 => 기본 데이터 타입
 * 
 * 2. call by reference
 *  : 주소에 의한 복사 => 참조 데이터 타입
 *  
 * <형변환(casting)> - 기본 데이터 타입
 * 1. 묵시적 형변환: 작->큰
 * 2. 명시적 형변환: 큰->작
 * 	int num = 3;
 *	double data = num; // 묵시적 형변환
 *	short val = (short)num; // 명시적 형변환
 * 
 * <객체형변환> - 참조 데이터 타입
 * https://velog.io/@smallcherry/Java-UpCastingAndDownCasting
 * 
 * 1. 상속관계일 때 형변환이 가능하다.(is a)
 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 * 
 *  (1) 업캐스팅(up-casting)
 *    : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 *    	자식 클래스의 객체가 부모 클래스 타입으로 형변환되는 것
 *    	하위클래스의 정보를 담을 수 있는 객체에 상위클래스의 자료형을 부여해서,
 *    	상위클래스처럼 사용하게 하는 것
 *    
 *  (2) 다운캐스팅(down-casting)
 *    : 업캐스팅을 원상복귀해주는 형변환하는 기술(다시 원상태로 돌림)
 *    	업캐스팅과 반대로 캐스팅하는 것
 *    	하위클래스로의 다운캐스팅을 할 때는 타입을 명시적으로 지정해줘야함
 *    	업캐스팅되었던 객체의 자료형을 다시 하위클래스의 정보를 담는 기능을 하도록
 *    	자료형을 다시 되돌려 놓는 것
 * 
 * 
 */
public class Java109_casting {

	public static void main(String[] args) {
		// SampleA sa = new SampleB();
		// SampleB sb = new SampleB();
		// sa = (SampleA)sb;

		Parent p = new Parent();
		Child c = new Child();

		// Parent p = new Child();
		p = c; // 업캐스팅(up-casting)
		p.process();
		// p.call();

		// 다운캐스팅(down-casting)
		Child d = (Child) p;

		// 객체생성 및 업캐스팅(up-casting)
		Parent pt = new Child();
		pt.process();
		// pt.call();

		// 다운캐스팅(down-casting)
		Child cn = (Child) pt;
		cn.call();

	}
}
