package stack;

public class greatestRightElement {
    public static void main(String[] args) {
        /*int arr[]={17,18,5,4,6,1};
        int[] sol =bruteForce(arr);
        for(int a:sol){
            System.out.println(a);
        }*/
        int arr1[] = {2,0,2,1,1,0};
        sort0(arr1);
    }

    private static int[] bruteForce(int[] arr) {
        int[] sol = new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            /*for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    sol[i]= arr[j];
                    break;
                }
            }*/
            int j=i+1;
            sol[i]=arr[j];
            while(j<arr.length){
                if(arr[j]>arr[i]){
                    sol[i]= arr[j];
                    break;
                }
                else j++;

            }
        }
        sol[arr.length-1]= -1;
        return sol;

    }

    public static void sort0(int nums[]){
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
            }
            else if(nums[i]==1){
                b++;
            }
        }
        System.out.println("before loop start: a"+ a);
        System.out.println("before loop start: b"+ b);


        int i=0;
        while(i<a){
            nums[i]=0;
            ++i;
        }
        System.out.println("after first while loop: i is"+ i);

        while(i<b+a){
            nums[i]=1;
            ++i;
        }
        System.out.println("after second while loop: i is"+ i);

        while(i<nums.length){
            nums[i]=2;
            ++i;
        }



    }
}
