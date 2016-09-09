import java.util.Scanner;

class SuperReducedString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		/*
			logic: check each character from index 0 to n-1.//kind of bruteforce.	
		*/
		for(int i = 1; i < word.length(); ){//itereate over the word
			if(word.charAt(i) == word.charAt(i-1)){//check i-1 letter with i position letter in the word, 
				word = word.substring(0,i-1) + word.substring(i+1);//if equal remove those from word and reset the index to 1.
				i = 1;
			}else{ 	//otherwise increment the index.
				i++;
			}
		}

		if(word.length() <= 0)//if word length is empty update it with "Empty String"
			word = "Empty String";

		System.out.println(word);

	}
}