import java.util.HashSet;
public class settest {
	public static void main(String[] args) {
		String poem ="Hold fast to dreams "
				+ "For if dreams die "
				+ "Life is a broken-winged bird "
				+ "That cannot fly "
				+ "Hold fast to dreams "
				+ "For when dreams go "
				+ "life is a barren field "
				+ "Frozen with snow ";
		String[] words = poem.split(" ");
		HashSet<String> set = new HashSet<String>();
		for (int i=0; i<words.length; i++) {
			set.add(words[i]); 
		}
		System.out.println("number of words : " + set.size());
		String poem2 = poem.toLowerCase();
		String[] words2 = poem2.split(" ");
		HashSet<String> set2 = new HashSet<String>(); 
		for (int i=0; i<words.length; i++) {
			set2.add(words2[i]);
		}
		System.out.println("number of words(lowercase) : " + set2.size()); }
}

