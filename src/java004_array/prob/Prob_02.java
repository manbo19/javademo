package java004_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		// int[][] data = new int[4][4];
		int[][] data = { { 1, 2, 3, 6 }, { 4, 5, 6, 15 }, { 7, 8, 9, 24 }, { 12, 15, 18, 45 } };
		int cnt = 0;

		// 여기를 구현하시오.
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				cnt += data[i][j];

			}
			System.out.printf("%d행의 합계: %d\n", i + 1, cnt);
			cnt = 0;
		}
		System.out.printf("\n");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				cnt += data[j][i];

			}
			System.out.printf("%d열의 합계: %d\n", i+1, cnt);

		}

	}// end main()

}// end class
