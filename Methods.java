import java.util.Scanner;

class Methods{

    // Type: With Argument and with Return
    // Example: Addition

    public static int add(int a, int b)
    {
        System.out.println("add method is invoked with a: "+ a + " b: " + b);
        int result = a+b;
        return result;
    }

    // Type: Without Argument and Without Return
    // Example: Greet

    public static void greet(){
        System.out.println("Vanakkam |^|");
    }


    // Type: With Argument and Without Return
    // Example: Subtration

    public static void sub(       ){

    }

    // Type: Without Argument and With Return
    // Example: sendOff
    public static ______ sendOff() {

    }
    

    public static void main(String[] args){
        System.out.println("Main method started..");

        Scanner in = new Scanner(System.in);

        greet();

        int a = in.nextInt();
        int b = in.nextInt();

        
        // int summation = add(10, 70);
        // System.out.println(summation);

        System.out.println(add(b, a)); //add(3, 5)

        System.out.println("Main method ended..");
    }
}