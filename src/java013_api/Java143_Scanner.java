package java013_api;

import java.util.Scanner;

/*
 * 단입력: 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * . . .
 * 5 X 9 = 45
 * 계속하시겠습니까? (종료:n, 계속:아무키) n
 * 프로그램 종료 
 */

public class Java143_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("단 입력: ");
			int dan = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);

			}

			System.out.print("계속하시겠습니까? (종료: n, 계속: 아무키) ");
			String chk = sc.next();
			if (chk.equals("n")) {
				// if(chk=="n") { => 얘는 안 돼.... . ..... .. .
				break;
			}

		}
		System.out.print("프로그램 종료");
	}// end main()
}
// end class

//		System.out.print("단 입력: ");
//		String line = sc.nextLine();
//
//		for (int i = 1; i < 10; i++) {
//			int num = 5 * i;
//			System.out.printf("5 X %d = %d\n", i, num);
//
//		}
//
//		System.out.print("계속하시겠습니까? (종료:n, 계속:아무키) ");
//		String asw = sc.next();
//
//		if (sc.next() == "n") {
//			System.out.println("프로그램 종료");
//		}
