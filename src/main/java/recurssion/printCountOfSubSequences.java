package recurssion;

import org.testng.Reporter;

import java.util.ArrayList;

public class printCountOfSubSequences {

    public static void main(String[] args) throws IndexOutOfBoundsException{
        int arr[] = new int[]{3, 1, 2};
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(printSubsequence(0, arr, list));
    }

    static int printSubsequence (int n, int arr[], ArrayList<Integer> list) {
        if (n == arr.length) {
            if(list.size()>0) {        //Empty list wont be printed
                System.out.println(list);
                return 1;
            }
            else return 0;
        }
        list.add(arr[n]);
        int x = printSubsequence(n + 1, arr, list);
        list.remove(list.size()-1);
        int y = printSubsequence(n + 1, arr, list);
        return x+y;
    }
}


class TryCatchExample3 {

    public static void main(String[] args) {
        try
        {
            if(true) {
                int data = 50 / 0; //may throw exception
                // if exception occurs, the remaining statement will not exceute
                System.out.println("rest of the code");
            }
            else {
                throw new Exception("Incorrect");
        }

        }
        // handling the exception
        catch(Exception e)
        {
            Reporter.log(e.getMessage(), true);
        }

        System.out.println("rest of the code i am here");

    }

}

class TryCatchExample1 {

    public static void main(String[] args) {

        int data=50/0; //may throw exception

        System.out.println("rest of the code");

    }

}