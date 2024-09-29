package org.example;

public class que02 {

	
	  

	    	    public static int removeDuplicates(int[] nums) {
	    	        if (nums.length == 0) return 0; // Handle empty array

	    	        int uniqueIndex = 0; // Track the index of unique elements

	    	        // Iterate through the array and remove duplicates
	    	        for (int i = 1; i < nums.length; i++) {
	    	            if (nums[i] != nums[uniqueIndex]) { // If current element is different from the last unique one
	    	                uniqueIndex++;  // Move the unique index forward
	    	                nums[uniqueIndex] = nums[i];  // Update the position with the unique element
	    	            }
	    	        }

	    	        return uniqueIndex + 1;  // Return the length of the array with unique elements
	    	    }

	    	    public static void main(String[] args) {
	    	        int[] arr = {1, 1, 2,4,4,5,5};
	    	        int newLength = removeDuplicates(arr);
	    	        System.out.println("New length: " + newLength); // Output: 2
	    	    }
	    	

	}
 


