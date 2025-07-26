import java.util.Scanner;

class dowhile{
    public static void main(String[] args){
        int pin_number;
        Scanner sc = new Scanner(System.in);        
        do{
            System.out.print("Enter your Pin: ");
            pin_number = sc.nextInt();
        }while(pin_number != 2659);

        System.out.println("Access Granted");

        // for (int i = 0; i < 10; i++) {
        //     if (i == 4) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
    }
}