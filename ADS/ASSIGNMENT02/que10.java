package org.example;

public class que10 {
	

	

	    public static int[] rotateLeft(int[] arr, int d) {
	        int n = arr.length;
	        int[] rotated = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            rotated[i] = arr[(i + d) % n];
	        }

	        return rotated;
	    }

	    public static void main(String[] args) {
	        System.out.println(Arrays.toString(rotateLeft(new int[]{1, 2, 3, 4, 5}, 2))); // Output: [3, 4, 5, 1, 2]
	        System.out.println(Arrays.toString(rotateLeft(new int[]{10, 20, 30, 40}, 1))); // Output: [20, 30, 40, 10]
	    




}
}