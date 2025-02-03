package strings;

public class ReverseWordsInAString3 {

	//check if there is space- till then go and
	//there - save that i=k and start = 0
	//then do swap
	//then increase start =current swap position+1;
	//at the end - after last space - do swap outside the loop
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take L c"));
	}
	
	public static String reverseWords(String s) {
        int k=0;
        int start=0;
        char[] st= s.toCharArray();
       for(int i=0; i<st.length;i++){
        if(st[i]==' '){
            k=i-1;
            swap(start, k, st);
            start=i+1;
        }
       }

       swap(start, st.length-1, st);
       return new String(st);
        
    }

    public static void swap(int i,int j,char[] arr){
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
