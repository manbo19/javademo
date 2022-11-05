package Project;

public class Music {
	String title;
	String artist;
	String album;

	public Music() {
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String artist, String album) {
		this.title = title;
		this.artist = artist;
		this.album = album;
	}

	public String getTitle() {
		
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s", title, artist, album);
	}

}
