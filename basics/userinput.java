// initialization int a = 5;
// declaration of variables int a;

// standard input, output, error

import java.util.Scanner; // 1

class userinput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //2
        System.out.print("Enter a number: ");
        int a = sc.nextInt(); 
        // System.out.println(a);

        if(a > 0){ // 0 < a
            System.out.println("positive");

            if(a%2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }

        } else if (a < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero- neither +ve nor -ve");
        }
    }
}

// positive or negative
// if positive, check it is odd or even.
// 
