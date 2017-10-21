package math_problems;

public class palindrome {
	
	public boolean isPalindrome(String word) {
		
		boolean status =false;
		String reverse ="";
		if(word !=null && word.length()>0) {
			for(int i= word.length()-1; i>=0; i--) {
				reverse = reverse +word.charAt(i);
			}
			if (reverse.equals(word)) {
				status =true;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean temp = new palindrome().isPalindrome("kavi");
		System.out.println(temp);
	}

}
