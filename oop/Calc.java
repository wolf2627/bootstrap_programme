import java.util.Scanner;


class Calculator{

    int a;
    int b;

    // Constructor
    Calculator(int a, int b){
        System.out.println("Hey guys, I am constructor");
        this.a = a;
        this.b = b;
    }

    public void Addition(){
        System.out.println(this.a+this.b);
    }

    public void Subtraction(){
        System.out.println(this.a-this.b);
    }

    public void Multiplication(){
        System.out.println(a*b);
    }

    public void Division(){
        System.out.println(a/b);
    }
}

class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Calculator cal = new Calculator(x, y);

        System.out.println("Object 1 Created");

        System.out.println("Addition: ");
        cal.Addition();
        System.out.println("Subtraction: ");
        cal.Subtraction();
        System.out.println("Multiplication: ");
        cal.Multiplication();
        System.out.println("Division: ");
        cal.Division();
    }
}