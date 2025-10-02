import java.util.Scanner;

class ifcheck{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        //#1 If Block
        if(num > 0){
            System.out.println("Positive");
            if(){
                if(){
                    if()
                }

            }
        }

        //#2 If Block
        if(num < 0){
            System.out.println("Negative");
        }

        //#3 if Block
        if(num == 0){
            System.out.println("Zero");
        }

        //#4 if Block
        if(num % 2 == 0){
            System.out.println("Even");
        }

        //#5 if Block
        if(num %2 != 0){
            System.out.println("Odd");
        }

    }
}