package Sorting;

public class Sorting{
  //bubble
    static void swap(int a, int b){
        int j=a;
        a=b;
        b=j;
        System.out.println(a+"/"+b);
    }

    public static void main(String[] args) {
        int arr[]={2,1,5,4,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        swap(5,8);

    }

}