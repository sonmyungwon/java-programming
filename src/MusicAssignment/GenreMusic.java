package MusicAssignment;

public class GenreMusic extends Music {
	public String genre[];
	public int length;
	public GenreMusic(int size) { 
		name = new String[size]; 
		song = new String[size]; 
		genre = new String[size]; 
		length = size;
	}
	public String getGenre(int index){
		return genre[index];
	}

	public void setGenre(int index1, String index2) { 
		this.genre[index1] = index2;
	}
	public void printdata(int index) {
		System.out.println(song[index]+" of "+name[index]);
		System.out.println(song[index]+" of "+name[index]+"  ** Genre : "+genre[index]);
	}

}
