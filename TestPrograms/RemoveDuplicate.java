package TestPrograms;

public class RemoveDuplicate {

	    public static void main(String[] args) {
	        String s = "programming";
	        String result = removeDuplicates(s);
	        System.out.println("Result = " + result);
	    }

	    public static String removeDuplicates(String str) {
	        StringBuilder result = new StringBuilder();
	        boolean[] seen = new boolean[256]; // For ASCII characters

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!seen[ch]) {
	                seen[ch] = true;
	                result.append(ch);
	            }
	        }
	        return result.toString();
	    }
	}


