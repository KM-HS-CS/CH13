
public class findIndex {
	private static int counter;
	private static boolean found;
	
	public static int indexOf(String text, String str) {
		counter++; 
		if (text.substring(0, str.length()).equals(str)) {
			found = true;
			return counter;
		} else {
			if (text.length() > str.length()) {
				indexOf(text.substring(1), str);
			}
		}
		if (found) {
			return counter;
		}
		return -1;
		
	}
	
	
	public static int getIndex(String text, String str) { //use this to get the index
		counter = -1;
		found = false;
		return indexOf(text, str);
	}
	
	public static void main(String[] args) {
		System.out.println(getIndex("my good sir, hello", "hel") );
	}
}
