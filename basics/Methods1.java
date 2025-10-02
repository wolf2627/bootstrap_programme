import java.util.Scanner;

class Methods1 {

    public static int add(int a, int b){
       int sum = a+b;
       return sum;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
       
        // int result =  add(num1, num2);

        System.out.println(add(num1, num2));

        int diff = sub(num1, num2);

        System.out.println(diff);

        System.out.println("Everything is Done");
    }
}