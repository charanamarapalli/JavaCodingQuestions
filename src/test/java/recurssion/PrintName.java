package recurssion;

public class PrintName {

    //First method executes first
    static void method(int a, int n){
        if(a>n){
            return;
        }
        else{
            System.out.println(n);

            method(a,n-1);
        }
    }

    //Last method executes first
    static void backTracking(int a, int n){
        if(a>n){
            return;
        }
        else{
            backTracking(a,n-1);
            System.out.println(n);
        }

    }

    //Last method executes first
    static void backTrackingToPrintNumbersInReverseOrder(int a, int n){
        if(a<n){
            return;
        }
        else{
            backTrackingToPrintNumbersInReverseOrder(a,n+1);
            System.out.println(n);
        }

    }

    //Sum of first 10 numbers using parameter recursion
    static void parameterRecurssion(int n, int sum){
        if(n==0)  System.out.println(sum);
        else parameterRecurssion(n-1, n+sum );
    }

    //Sum of first 10 numbers using functional recursion
    static int functionalRecurssion(int n){
        if (n==0) return 0;
        else return n + functionalRecurssion(n-1);
    }

    public static void main(String[] args) {
        method(1, 5);
        backTracking(1,5);
        backTrackingToPrintNumbersInReverseOrder(5,1);
        //parameterRecurssion(10,0);  //Set initial sum as zero. Increase the sum gradually. . Sum of first 10 numbers using parameter recurssion
        System.out.println("Sum of first n digits is " + functionalRecurssion(10));
    }
}
