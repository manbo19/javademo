package java008_static_access.part02;

/*
 * class 클래스명{
 * 	멤버변수;
 *	static{ };
 *	생성자();
 *	메서드();
 *}
 */
public class OrderStatic {
	
	static {
		System.out.println("static");
	}
	
	public OrderStatic(){
		System.out.println("OrderStatic");
	}
	
	public void display(){
		System.out.println("display");
	}

}
