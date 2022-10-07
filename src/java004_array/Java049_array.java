package java004_array;

/*
 * a	b	c	d
 * a	b	c	d
 * a	b	c	d
 * a	b	c	d
 * 
 * [출력결과]
 * *	a	b	c	d
 * a	*	b	c	d
 * a	b	*	c	d
 * a	b	c	*	d
 * a	b	c	d	*
 * 
 */
public class Java049_array {

	public static void main(String[] args) {
		char[][] alpa = new char[][] { { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' },
				{ 'a', 'b', 'c', 'd' } };

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				if(alpa[row]==alpa[col]) {
					System.out.printf("%4s", "*");
				}
				
				System.out.printf("%4c", alpa[row][col]);

			}
			System.out.printf("\n");
			
			//한 줄 더 나오게 해야됨 -> a b c d *
			

		}

	}// end main()

}// end class
