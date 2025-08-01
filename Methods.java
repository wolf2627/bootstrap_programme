import java.util.Scanner;

class Methods{

    // With Argument and with Return Type
    // Example: Addition

    public static int add(int a, int b){
        System.out.println("I am add Method, I started... performing addition a = "+ a + " b = " + b);
        int result = a+b;
        return result;
    }    

    // With Argument and with Return Type
    // Example : Subtraction

    public static void sub(int a, int b){
        System.out.println("I am sub Method, I started... performing subtration a = "+ a + " b = " + b);
        int result = a - b;
        System.out.println(result);
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("I am Main Method, I started...");

        // int summation = add(10, 6);
        System.out.println(add(10, 6));

        sub(10, 6);

    }
}