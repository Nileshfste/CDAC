package org.example;

public class que8 {

	

	    public static long arrayManipulation(int n, int[][] queries) {
	        long[] arr = new long[n + 1];
	        
	        for (int[] query : queries) {
	            int start = query[0];
	            int end = query[1];
	            int value = query[2];
	            arr[start - 1] += value;
	            if (end < n) {
	                arr[end] -= value;
	            }
	        }

	        long max = 0, sum = 0;
	        for (long val : arr) {
	            sum += val;
	            max = Math.max(max, sum);
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
	        System.out.println(arrayManipulation(5, queries1)); // Output: 200

	        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
	        System.out.println(arrayManipulation(4, queries2)); // Output: 120
	    }
	}



