package java006_class.part09;

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;

	public Song() {
		this("Dancing Queen", "ABBA", "Arrival", new String[] { "Benny Andersson, bjohn Ulvaeus" }, 1997, 2);
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {

		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		// for (int i = 0; i < composer.length; i++) {
		System.out.printf("노래제목:%s\n 가수:%s\n 앨범:%s\n 작곡가:%s\n 연도:%d\n 트랙:%d\n", title, artist, album, composer[0], year,
				track);
		// }
	}

}
