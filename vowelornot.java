import java.util.Scanner;
public class vowelornot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char alpha = reader.next().charAt(0);
		if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u')
			System.out.println("Yes!! It is a Vowel");
		else
			System.out.println("Oh no!! It is a Consonant");
	}

}
