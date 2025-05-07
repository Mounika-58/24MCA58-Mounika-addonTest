package TestPrograms;

public class PrintDiamondPattern {
	
	public static void main(String[] args) {
		        int n = 5; // height of half of the diamond

		        // Upper part of diamond
		        for (int i = 1; i <= n; i++) {
		            // Print leading spaces
		            for (int j = i; j < n; j++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (int j = 1; j <= (2*i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        // Lower part of diamond
		        for (int i = n - 1; i >= 1; i--) {
		            // Print leading spaces
		            for (int j = n; j > i; j--) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (int j = 1; j <= (2*i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    
		}

		
		
	
}
