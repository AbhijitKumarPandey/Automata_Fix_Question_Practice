package Automata_Fix_Question_Practice;

public class Reverse_String {
	public static void main(String[] args) {
		// Reverse String Without Built in reverse
		
	 String str = "LAPTOP";
	 String rev = " ";
	 
	 for(int i=0; i<str.length(); i++) {
		 rev = str.charAt(i)+rev;
		 
	 }
	 System.out.println("Revesed " + rev);
	}
}