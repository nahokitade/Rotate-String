/*
 * Class that handles rotating a given string k amounts.
 * 
 * Assignment 4 of STEP at Google Tokyo
 * @author Naho Kitade
 */
public class RotateString{
	
	/*
	 * Main function of the class. Rotates a given string input k right.
	 * 
	 * @param rotateString The string to rotate in the function.
	 * @param k The integer to rotate the given string.
	 * @return Returns a string that have been rotated k amounts.
	 */
	public static String rotate(String rotateString, int k){
		// the two variables become the head or the tail substrings of the final rotated
		// string.
		String rotateSubstringHead;
		String rotateSubstrngTail;
		
		// This is case needed if input is empty string
		if(rotateString.equals("")){
			return "";
		}
		
		// if k is negative, make it its negation (positive number) and then mod by the length of 
		// string since if k is > than length of string, we want to rotate the string by the remainder
		// of length of string / k. 
		if(k < 0){
			k = k * -1;
			k = k % rotateString.length();
			
			// The tail of the end rotated string should be the first k characters and the head 
			// should be the remaining characters.
			rotateSubstrngTail = rotateString.substring(0, k);
			rotateSubstringHead = rotateString.substring(k);
		}
		else{
			// No need to negate k but still have to mod with the same reasoning as the previous case
			k = k % rotateString.length();
			
			// Now, the tail of the rotated string should be the first length of string - k since
			// the string rotates in the opposite direction from the opposite case.
			// As before, the head of the rotated string will be the remaining characters. 
			rotateSubstrngTail = rotateString.substring(0, rotateString.length() - k);
			rotateSubstringHead = rotateString.substring(rotateString.length() - k);			
		}
		
		// concatianate the head and tail of the rotated string and return. 
		return rotateSubstringHead + rotateSubstrngTail;
	}
}
