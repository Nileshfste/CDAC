package org.example;


import java.util.Scanner;

public class que7{

  
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
       String string = new String(sc.nextLine());
       char[] ch =string.toCharArray();
       for(int i=0;i<ch.length;i++) {
    	   for(int j=i+1;j<ch.length;j++) {
    		   if(ch[i]==ch[j]) {
    			   System.out.print("["+ ch[j]+"]"+"  ");
    		   }
    		   
    	   }
       }

       }
}

/*
 * Time Complexity: O(n²) due to the two nested loops.
   Space Complexity: O(n) due to the character array created from the string
 */





/*Start and Input: The process starts with the user providing input, which is stored as a string.
Convert to Char Array: The string is converted into a character array so that each character can be accessed individually.
Outer Loop: The outer loop (index i) iterates over every character in the array.
Inner Loop: For each character, the inner loop (index j) checks the remaining characters after the current character for duplicates.
Check for Duplicates: If a duplicate is found (i.e., ch[i] == ch[j]), the character is printed.
End: The process repeats until all characters are checked, and then the program ends
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *    [Start]
        |
        v
  [Input the string]
        |
        v
  [Convert string to char array]
        |
        v
[Outer loop: i = 0 to length - 1]
        |
        v
[Inner loop: j = i + 1 to length - 1]
        |
        v
[Check if ch[i] == ch[j]]
       /  \
     yes   no
     |       |
[Print ch[j]]  |
     |       |
  [End inner loop] 
        |
        v
  [End outer loop] 
        |
        v
     [End]

 * 
 * 
 */
