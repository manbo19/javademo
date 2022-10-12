package java006_class.part09;

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {
		
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		//this("Dancing Queen", "ABBA", "Arrival", new String[] { "Benny Andersson, bjohn Ulvaeus" }, 1997,2);
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		
	}
	
	

}
