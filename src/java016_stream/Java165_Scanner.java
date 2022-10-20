package java016_stream;
/*
 *  [순번  이름  평균]입력
 *  순번: 10
 *  이름: 홍길동
 *  평균 9.5
 */

import java.util.Scanner;

public class Java165_Scanner {

	public static void main(String[] args) {
		System.out.print("[순번  이름  평균]입력 \n");
		Scanner sc = new Scanner(System.in);
		int num; // 순번
		String name; // 이름
		double avg; // 평균

		System.out.print("순번: ");
		num = sc.nextInt();
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("평균: ");
		avg = sc.nextDouble();

		System.out.printf("순번: %d\n", num);
		System.out.printf("이름: %d\n", name);
		System.out.printf("평균: %d\n", avg);

	}// end main()

}// end class
