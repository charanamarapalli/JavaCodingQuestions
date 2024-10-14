package Sorting;

public class NonDecreasing {

    public static void main(String[] args) {
        int arr[]= {3,2,4};
        System.out.println( method(arr));
    }

    public static boolean method(int arr[]){
        int count=0;

        for(int i=0;i<arr.length-1;i++){
                if((arr[i+1]-arr[i])<0){
                    count++;
                }

        }

        if(count ==0 || count ==1){
            return true;
        }
        else
        {return false;}
    }
}
