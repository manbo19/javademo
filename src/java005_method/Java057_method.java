package java005_method;

/*
 * 자바에서 제공하는 데이터 타입(data type)
 * 1. Primitive data type : byte, short, int, long, float, double, boolean, char
 * 2. Reference data type : array, class, interface, enum
 * 
 *  [argument 전달 방식]
 *  1. call by value: 값에 의한 복사
 *     argument을 전달할 때 primitive data type을 넘겨주는 형식
 *     장점: 복사하여 처리하기 때문에 원래의 값이 그대로 보존되어 안전하다.
 *     단점: 복사를 하기 때문에 메모리 사용량이 늘어난다.
 *  
 *  2. call by reference: 주소에 의한 복사
 *     argument를 전달할 때 reference data type을 넘겨주는 형식
 *     장점: 참조를 하기 때문에 메모리를 절약한다.
 *     단점: 참조를 하기 때문에 원래의 값과 서로 영향을 주고 받는다.
 */
public class Java057_method {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.printf("a=%d, b=%d\n", a, b); // a=10, b=20
		callByValue(a, b);
		System.out.printf("a=%d, b=%d\n", a, b); // c=20, d=10

		int[] num = new int[] { 10, 20 };

		System.out.printf("num[0]=%d, num[1]=%d\n", num[0], num[1]);// num[0]=10, num[1]=20
		callByReference(num);
		System.out.printf("num[0]=%d, num[1]=%d\n", num[0], num[1]);// num[0]=20, num[1]=10
	}// end main()

	public static void callByValue(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
		System.out.printf("c=%d, d=%d\n", c, d); // a=10, b=20

	}// end callByValue()

	public static void callByReference(int[] arr) {
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;

		System.out.printf("arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);// arr[0]=20, arr[1]=10

	}// end callByReference()
}// end class
