package ExceptionHandling;

public class Class1 {

    public static void main(String[] args) {
        method();

    }

    public static void method(){
        int value=1;
        try {
            if (value > 1) {
                System.out.println("Working fine");
            }
            else throw new CustomException1("value is not greater than 1");
        }
        catch(CustomException1 e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
