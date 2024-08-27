package SlidingWindow;

public class Matrix2d {

    public static void main(String[] args) {

        int arr[][] = {{1,2},{3,4},{5,6,7}};
        /*System.out.println(arr.length);
        System.out.println(arr[2].length);
        for(int i=0;i<arr[2].length;i++){
            System.out.println(arr[2][i]);
        }*/


        //System.out.println(bruteForceSearch2dMatrix(arr, 10));
        System.out.println(bestSearch2dMatrix(arr,6));

    }

    private static boolean bruteForceSearch2dMatrix(int arr[][], int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target) return true;
            }
        }
        return false;
    }


    private static boolean bestSearch2dMatrix(int arr[][], int target){

        for(int i=0;i<arr.length;i++){
            int length = arr[i].length;
            if(arr[i][length-1]>=target && arr[i][0]<=target){
                while(length>0){
                    if(arr[i][length-1] == target){
                        return true;
                    }
                    else length--;

                }
            }

            else{
                i++;
            }

        }
        return false;
    }
}
