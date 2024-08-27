package Strings;

public class MoveZeroes {
    public static void main(String[] args) {
        String s="";
        while(s.length()!=2)
            s+="a";
        System.out.println(s);

        String mes= "sai,\"sai!\"";
        System.out.println(mes);
        /*int arr[]={0,1,0,3,12};


        for (int i:arr) {
            System.out.println(i);
        }

        moveZeroes(arr);

        for (int i:arr) {
            System.out.println(i);
        }*/

    }

    public static void moveZeroes(int[] arr) {
        int i=0;
        int j;

        while(i<arr.length-1){
            if(arr[i]==0){
                j=i+1;
                while(j<arr.length){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        i++;
                        break;
                    }
                    else {
                        i++;

                    j++;}
                }
            }
            else i++;
        }


    }
}
