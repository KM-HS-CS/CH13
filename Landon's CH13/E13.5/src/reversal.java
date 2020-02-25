
public class reversal {

	
		public static String reverse(String text) {
			if (text.length() == 1) {
				return text;
			} else {
				String result =  reverse(text.substring(1)) + text.charAt(0);
				return result;
			}
		}
		
		
		public static void main(String[] args) {
			System.out.println("hi".length());
			System.out.println(reverse("looc ytterp si namtnuB .rM"));
		}
}
