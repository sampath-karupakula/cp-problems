import java.util.Scanner;

class SuperReducedString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		for(int i = 1; i < word.length(); ){
			if(word.charAt(i) == word.charAt(i-1)){
				word = word.substring(0,i-1) + word.substring(i+1);
				i = 1;
			}else{
				i++;
			}
		}

		if(word.length() <= 0)
			word = "Empty String";

		System.out.println(word);

	}
}