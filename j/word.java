
public class Word {
	public static void main(String[] arg) {
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(3));
	}
	
	
	private String letters;
	
	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	//i번째 글자가 모음인지 아닌지?? i번째 글자가 모음이라면 true ? 자음이라면 false??  
	//a, i ,u, e, o
	public boolean isVowel(int i) {
		return letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("i") || letters.substring(i, i + 1).equals("u") || letters.substring(i, i + 1).equals("e") || letters.substring(i, i + 1).equals("o");	
	}


	public boolean isConsinant(int i) {
		boolean result = true;
		if ("aieou".contains(letters.substring(i, i+1)) == false) {
			result = true;
		}else{
      result = false;
    }
		return result;
	}
	
	


}
