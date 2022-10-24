package java017_collection;

/*
 * <Vector>
 * : ArrayList와 LinkedList와 같이 리스트를 구체화한 클래스이다.
 * 
 * 내부에 배열을 가지고 있으며 순서대로 값들이 저장된다.
 * ArrayList와 거의 유사한 형태의 클래스로 크기가 가변적이다.
 * 
 *- ArrayList와의 차이점
 * 동기화를 제공하기 때문에 멀티 스레드 환경에서 안전하다.
 * 동기화로 인해 일반적으로 ArrayList보다 낮은 성능을 보인다.
 * 따라서 동기화가 필요하지 않은 때에는 ArrayList를 사용하는 것이 좋다.
 * 
 * add(): 요소 추가 -> 인덱스를 별도로 지정하지 않으면 리스트의 끝에 값을 추가한다.
 * 					인덱스를 지정하면 해당 위치에 추가되고 해당 인덱스부터의 요소들이 뒤로 한 칸씩 밀린다.
 * set(): 기존에 추가된 값을 변경하는 데 사용
 * remove(): 삭제 -> 인덱스나 실제 값을 입력 값으로 받는다.
 * 				    인덱스를 입력해서 삭제하는 경우 삭제된 값을 리턴받는다.
 * clear(): 모든 값 삭제
 * contains(): 값이 존재하는지 여부를 boolean타입으로 리턴한다.
 * indexOf(): 존재할 경우 인덱스를 리턴하고 존재하지 않으면 -1을 리턴한다.
 * 
 */
import java.util.Vector;

public class Java178_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		// Integer -> Object : up-casting
		v.add(new Integer(10)); // deprecated
		v.add(new Integer(20));

		// int -> Integer -> Object : auto boxing -> up-casting
		v.add(30);
		v.add(40);
		// String -> Object : up-casting
		v.add(new String("java"));

		// Object -> Integer : down-casting
		// get():Returns the element at the specified position in this Vector.
		Integer it1 = (Integer) v.get(0);
		Integer it2 = (Integer) v.get(1);
		Integer it3 = (Integer) v.get(2);
		Integer it4 = (Integer) v.get(3);
		String sn = (String) v.get(4);
		System.out.println(it1.intValue());
		System.out.println(it2.intValue());
		System.out.println(it3.intValue());
		System.out.println(it4.intValue());
		System.out.println(sn.toString());
		
		try {
			System.out.println(v.get(20));
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
	}// end main()

}// end class
