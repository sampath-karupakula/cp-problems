import java.util.Scanner;

class SuperReducedString1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		while(true){
			int length = word.length();

			word = word.replaceAll("(.)\\1","");

			if(word.length() == length)
				break;
		}

		System.out.println(word.isEmpty() ? "Empty String": word);
	}
}