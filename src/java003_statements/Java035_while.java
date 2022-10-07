package java003_statements;

public class Java035_while {

	public static void main(String[] args) {
		int cnt = 1;
		while (true) { //무한루프 true => https://mingnol2.tistory.com/86
			System.out.println(cnt++);
			if (cnt == 6) {
				break;
			}
		}

	}//end main()

}//end class
