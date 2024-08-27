package Strings;

public class IndexOfFirstOccurenceInString{

    public static void main(String[] args) {
        System.out.println(indexMethod("butssadad", "sad"));

    }

    public static int indexMethod(String haystack, String needle){
        int len1= haystack.length();
        int len2= needle.length();
        int i=0;

        while(i+len2-1 < len1){
            String s= "";
             s = haystack.substring(i, i+len2);
            if(s.equals(needle)){
                return i;
            }
            else i++;

        }

        return -1;

    }

    public static int insertPosition(int[] arr, int target){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[i] <=target && arr[mid] >=target){
                j=mid-1;
            }
            else if(arr[j] >=target && arr[mid]<target){
                i=mid+1;
            }
        }
        return -1;

    }
}
