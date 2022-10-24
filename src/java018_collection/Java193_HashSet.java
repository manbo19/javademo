package java018_collection;
//https://velog.io/@seculoper235/1.-%EC%9E%90%EB%B0%94%EC%9D%98-Collection%EC%97%90-%EB%8C%80%ED%95%B4

import java.util.HashSet;

/*
 * HashSet: 중복허용 안 되고, 순서 유지도 안 된다.
 */
public class Java193_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));

		for (Integer it : set)
			System.out.println(it);
		
		
	}// end main()

}// end class
