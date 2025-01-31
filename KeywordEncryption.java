import java.util.*;

public class KeywordEncryption {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the No of Keywords: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] keywords = new String[n];
		System.out.println("Enter the keywords: ");
		for(int i=0; i<n; i++) {
			keywords[i] = scanner.nextLine();
		}
		
		System.out.println("Enter the shift value: ");
		int shiftvalue = scanner.nextInt();
		
		String[] encryptedKeywords = encryptKeywords(keywords, shiftvalue);
		
		System.out.println("Encrypted keywords: ");
		for(String encryptedWord : encryptedKeywords) {
			System.out.println(encryptedWord);
		}
		scanner.close();
	}
	
	public static String[] encryptKeywords(String[] keywords,int shiftValue) {
		String[] encryptedKeywords = new String[keywords.length];
		
		for(int i=0; i<keywords.length; i++) {
			StringBuilder encryptedWord = new StringBuilder();
			for(char ch : keywords[i].toCharArray()) {
				if(Character.isLowerCase(ch)) {
					char encryptedChar = (char)((ch - 'a' + shiftValue) % 26 + 'A');
					encryptedWord.append(encryptedChar);
				} else {
					encryptedWord.append(ch);
				}
			}
			encryptedKeywords[i] = encryptedWord.toString();
		}
		return encryptedKeywords;
	}
}
