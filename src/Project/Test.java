package Project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Test {
	static ArrayList<Music> musicList = new ArrayList<Music>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("♬ 수행할 작업을 선택하세요.");
		System.out.println();
		System.out.println("1.노래 추가 2.노래 삭제 3.플레이리스트 4.플레이리스트 검색 5.종료");
		System.out.print("▶ ");

		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			if (num == 1) {
				addMusic(musicList);
				select(musicList);
			} else if (num == 2) {
				deleteMusic(musicList);
				select(musicList);
			} else if (num == 3) {
				playList(musicList);
				select(musicList);
			} else if (num == 4) {
				listSearch(musicList);
				select(musicList);
			} else if (num == 5) {
				System.out.println("종료하겠습니다.");
				System.exit(0);
			}
		}
	}

	public static void select(ArrayList<Music> musicList) {
		System.out.println();
		System.out.println("♬ 선택화면으로 돌아가겠습니다.");
		System.out.println();
		System.out.println("1.노래 추가 2.노래 삭제 3.플레이리스트 4.플레이리스트 검색 5.종료");
		System.out.print("▶ ");
	}

	public static void addMusic(ArrayList<Music> musicList) {
		if (musicList.size() == 0) { // 현재 플레이리스트가 비어있을 때
			System.out.println();
			System.out.println("현재 플레이리스트가 비어있습니다.");
			System.out.println("새로운 노래를 추가해보세요! :)");
			System.out.println();

			// 추가할 노래 정보 기입
			System.out.print("▶ 노래: ");
			String title = sc.nextLine();
			System.out.print("▶ 아티스트: ");
			String artist = sc.nextLine();
			System.out.print("▶ 앨범: ");
			String album = sc.nextLine();

			Music music = new Music("SONG: " + title, " | ARTIST: " + artist, " | ALBUM: " + album);
			musicList.add(music);

			// 플레이리스트
			System.out.println();
			System.out.println("=============== MUSIC PLATLIST ===============");
			System.out.println();
			for (int i = 0; i < musicList.size(); i++) {
				System.out.printf("%d. %4s\n", i + 1, musicList.get(i));
			}
			System.out.println();
			System.out.println("==============================================");
			System.out.println();
			System.out.println("플레이리스트에 노래가 추가되었습니다.");
			System.out.println();

		} else if (musicList.size() >= 1) { // 현재 플레이리스트에 곡이 있을 때
			// 추가할 노래 정보 기입
			System.out.println();
			System.out.print("▶ 노래명: ");
			String title = sc.nextLine();
			System.out.print("▶ 아티스트명: ");
			String artist = sc.nextLine();
			System.out.print("▶ 앨범명: ");
			String album = sc.nextLine();

			Music music = new Music("SONG: " + title, " | ARTIST: " + artist, " | ALBUM: " + album);
			musicList.add(music);

			// 플레이리스트
			System.out.println();
			System.out.println("=============== MUSIC PLATLIST ===============");
			System.out.println();
			for (int i = 0; i < musicList.size(); i++) {
				System.out.printf("%d. %s\n", i + 1, musicList.get(i));
			}
			System.out.println();
			System.out.println("==============================================");
			System.out.println();
			System.out.println("플레이리스트에 노래가 추가되었습니다.");
			System.out.println();

		}

	}// end addMusic()

	public static void deleteMusic(ArrayList<Music> musicList) {
		System.out.println("노래를 삭제하시겠습니까?");
		System.out.println("[1]선택 삭제 [2]전체 삭제 [3]취소");
		System.out.print("▶ ");

		int answer1 = Integer.parseInt(sc.nextLine());
		if (answer1 == 1) { // [1]선택 삭제
			System.out.println();
			// 선택한 노래 삭제할지 한 번 더 물어보기
			System.out.println("삭제할 노래를 선택하시겠습니까? 1.네 2.아니오");
			System.out.print("▶ ");
			System.out.println();

			int answer2 = Integer.parseInt(sc.nextLine());
			if (answer2 == 1) {
				// 플레이리스트
				System.out.println();
				System.out.println("=============== MUSIC PLATLIST ===============");
				System.out.println();
				for (int i = 0; i < musicList.size(); i++) {
					System.out.printf("%d. %s\n", i + 1, musicList.get(i));
				}
				System.out.println();
				System.out.println("==============================================");
				System.out.println();

				System.out.println("삭제할 노래의 번호를 선택해주십시오.");
				System.out.print("▶ ");
				int answer3 = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < musicList.size(); i++) {
					if (answer3 == i + 1)
						musicList.remove(i);
				}
				System.out.println("선택한 노래가 삭제되었습니다.");
				System.out.println();
			} else {
				System.out.println("선택한 노래 삭제를 취소하겠습니다.");
			}

		} else if (answer1 == 2) { // [2]전체 삭제
			System.out.println();
			// 정말 삭제할지 한 번 더 물어보기
			System.out.println("전체 삭제하시겠습니까? 1.네 2.아니오");
			System.out.print("▶ ");
			System.out.println();

			int answer4 = Integer.parseInt(sc.nextLine());

			if (answer4 == 1) {
				System.out.println();
				musicList.removeAll(musicList);
				System.out.println("전체 노래가 삭제되었습니다.");
				System.out.println();
			} else {
				System.out.println("전체 삭제를 취소하겠습니다.");
			}

			System.out.println();

		} else if (answer1 == 3) { // [3]취소
			System.out.println();
			System.out.println("취소되었습니다.");
			System.out.println();

		}

	}// end deleteMusic()

	public static void playList(ArrayList<Music> musicList) {
		System.out.println("=============== MUSIC PLATLIST ===============");
		System.out.println();
		for (int i = 0; i < musicList.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, musicList.get(i));
		}
		System.out.println();
		System.out.println("==============================================");

	}// end playList()

	public static void listSearch(ArrayList<Music> musicList) {
		// 플레이리스트
		System.out.println();
		System.out.println("=============== MUSIC PLATLIST ===============");
		System.out.println();
		for (int i = 0; i < musicList.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, musicList.get(i));
		}
		System.out.println();
		System.out.println("==============================================");
		System.out.println();

		System.out.println("검색할 노래의 번호를 입력하세요.");
		System.out.print("▶ ");

			int number = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < musicList.size(); i++) {
				if (number == i + 1) {
					System.out.println(number + "번을 검색한 결과입니다.");
					System.out.printf("%d. %s\n", i + 1, musicList.get(i));
					System.out.println();							
				

			}
		}
	}// end listSearch()

}// end class
