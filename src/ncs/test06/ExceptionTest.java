package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		int put = 0;
		Scanner sc = new Scanner(System.in);
		put = sc.nextInt();
		
		if(put<=5 && put>=2) {	
			System.out.printf("결과값: %d", sum);
		}else {
			System.out.println("입력 값에 오류가 있습니다.");
		}

	}

}
