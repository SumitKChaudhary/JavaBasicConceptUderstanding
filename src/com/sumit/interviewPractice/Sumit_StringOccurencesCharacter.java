/*sumitkumar
* 20-Jun-2019
* 12:13:03 am

 * @author sumitkumar
 *
 */
package com.sumit.interviewPractice;
public class Sumit_StringOccurencesCharacter 
{
	static int countCharacterOccurences(String s, char c)
	{
		
		int res = 0 ;
		
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)==c)
			{
				res++;
			}
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		String str = " Sumit Kumar Chaudhary"; 
		
		char c = 'a';
		
		System.out.println(countCharacterOccurences(str, c));
	}

}
