package arraysAndStrings;

public class ReverseEntireString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = "He is the one".split(" ");
	    String finalStr="";
	    for(int i = str.length-1; i>= 0 ;i--){
	    	finalStr += str[i]+" ";
	    }
	    System.out.println(finalStr);
	}
}
