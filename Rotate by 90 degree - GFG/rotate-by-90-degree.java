//{ Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG
{
    public static void transpose(int [][] arr)
    {
        for(int i = 0; i<arr.length; i++)    {
            for(int j = i; j <arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
    public static void swapCol(int [][] arr)
    {
        int size = arr[0].length;
        for(int i = 0; i<arr.length; i++)    {
            for(int j = 0; j <size/2; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[size -1 -j][i];
                arr[size -1 - j][i] = temp;
            }
        }  
    }
    static void rotate(int matrix[][]) 
    {
        transpose(matrix);
        swapCol(matrix);
    }
}