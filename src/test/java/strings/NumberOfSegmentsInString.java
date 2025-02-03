package strings;

public class NumberOfSegmentsInString {

	public static void main(String[] args) {
		System.out.println(numberOfSegments("               "));
	}
	
	public static int numberOfSegments(String s) {
		 if(s.length()==0 || s.equals("")) return 0;
	        
         String[] arr= s.trim().split("\\s+");
         System.out.println(arr.length+ " is length"+arr[0]+ "is he valye");
         if(arr.length==1 && arr[0].equals("")) {
        	 return 0;
         }
         return arr.length;
	}
}
