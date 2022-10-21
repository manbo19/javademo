package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java174_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("파일 삭제");
		} else {
			System.out.println("파일 없음");
		}
	}// end main()

}// end class


/* java.awt.Frame;
 * java.awt.event.ActionListener;
 * 
 *  import java.awt.* -> java.awt.Frame;만
 *  import java.awt.event.* -> java.awt.event.ActionListener; 불러올 수 있음
 * 
 */
