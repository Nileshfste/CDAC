package org.example;

import java.util.Iterator;
import java.util.Scanner;

public class que6 {


	    public static String reverseWords(String sentence) {
	        String[] words = sentence.split(" ");
	        String result = "";

	        for (int i = words.length - 1; i >= 0; i--) {
	            result += words[i] + (i != 0 ? " " : "");
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence to reverse its words:");
	        String sentence = sc.nextLine();
	        System.out.println("Reversed sentence: " + reverseWords(sentence));
	        sc.close();
	    }
	}


/*
reverseWords Method:

Input: A sentence as a string (sentence).
Step 1 - Split Sentence: The sentence is split into individual words using split(" "), which divides the string wherever it finds a space character. The result is an array of words (String[] words).
Step 2 - Reverse Words: It then iterates through the words array in reverse order (starting from the last word). The loop starts from words.length - 1 and appends each word to the result string.
Step 3 - Concatenate with Space: Each word is concatenated to the result string with a space if it's not the last word.
Output: Finally, the reversed sentence is returned as a single string.
main Method:

Input Sentence: It takes input from the user using a Scanner.
Call to reverseWords Method: It calls the reverseWords method with the user-provided sentence.
Print Result: The reversed sentence is printed to the console.








Flowchart Steps:

Start:

The flowchart starts with the beginning of the program, where we prompt the user to enter a sentence.
Input Sentence:

The program waits for the user to input a sentence. This is represented by an input box in the flowchart.
Call reverseWords Method:

After receiving the input sentence, the program calls the reverseWords method with the given sentence.

Inside the reverseWords method:
Split Sentence into Words: Split the sentence using spaces, resulting in an array (String[] words).
Loop through Words in Reverse Order: Use a loop to iterate from the last word to the first word.

Concatenate Words: Append each word to the result string, adding spaces between words as necessary.
Return Reversed Sentence:

The method returns the reversed sentence as the output.
Print Reversed Sentence:

The main method receives the reversed sentence and prints it to the console.
End:

The program ends after printing the reversed sentence.

*/