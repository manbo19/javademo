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
 */
public class Java049_array_t {

	public static void main(String[] args) {
		char[][] alpa = new char[][] { { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' },
				{ 'a', 'b', 'c', 'd' } };

		for (int i = 0; i < alpa.length; i++) {
			for (int j = 0; j < alpa[i].length; j++) {
				if(i==j) {
					System.out.printf("%4s", "*");
				}
				
				System.out.printf("%4c", alpa[i][j]);

			}
			System.out.printf("\n");
			
			if(i==alpa.length-1) {
				for(int j=0; j<alpa[i].length; j++) {
					System.out.printf("%4c", alpa[i][j]);
				}
				System.out.printf("%4s", "*");
			}
			
			

		}

	}// end main()

}// end class
