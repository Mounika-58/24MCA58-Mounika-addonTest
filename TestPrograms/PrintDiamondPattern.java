package TestPrograms;

import java.util.Scanner;

public class PrintDiamondPattern {
	
	public static void main(String[] args) {
	
		    	Scanner sc = new Scanner(System.in);
		    	
		    	System.out.print("n = ");
		        int n = sc.nextInt(); 

		        int mid = (n + 1) / 2; 

		        
		        for (int i = 1; i <= mid; i++) {
		            
		            for (int j = i; j < mid; j++) {
		                System.out.print(" ");
		            }
		            
		            for (int k = 1; k <= i; k++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

		      
		        for (int i = mid - 1; i >= 1; i--) {
		            // Print spaces
		            for (int j = mid; j > i; j--) {
		                System.out.print(" ");
		            }
		            
		            for (int k = 1; k <= i; k++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		}

		       
