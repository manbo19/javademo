package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int put = sc.nextInt();
		
		if(put<=5 && put>=2) {	
			System.out.printf("결과값: %d");
		}else {
			System.out.println("입력 값에 오류가 있습니다.");
		}

	}

}
