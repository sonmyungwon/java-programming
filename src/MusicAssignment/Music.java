package MusicAssignment;

public class Music {

	public String name[];
	public String song[];

	public String getName(int index){
		return name[index];
	}
	public String getSong(int index){
		return song[index];
	}
	public void setName(int index1, String index2) { 
		name[index1] = index2;
	}
	public void setSong(int index1, String index2) { 
		this.song[index1] = index2;
	}
	public void printdata(int index) {
		System.out.println(song[index]+" of "+name[index]);
	}


}
