package MusicAssignment;

public class PlayList {

	public static void main(String[] args) {
		GenreMusic genreMusic = new GenreMusic(3);
		genreMusic.setGenre(0,"Symphony");
		genreMusic.setGenre(1,"Oratorio");
		genreMusic.setGenre(2,"Concerto");
		genreMusic.setName(0, "Beethoven");
		genreMusic.setName(1, "Handel");
		genreMusic.setName(2, "Vivaldi");
		genreMusic.setSong(0, "Destiny");
		genreMusic.setSong(1, "Messiah");
		genreMusic.setSong(2, "Four Seasons");
		for(int i=0; i<genreMusic.length ; i++) {
			genreMusic.printdata(i);
		} 
	}
}

