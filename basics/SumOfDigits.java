import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        int sum =0 , num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = s.nextInt();
        
        // while (num >= 10) {
        //     sum = 0;
        //     while (num > 0) {
        //         sum += num % 10;
        //         num /= 10;
        //     }
        //     num = sum; 
        // }


        while (num !=0){
            int digit = num % 10;
            sum += digit;
            num /= 10;

            if(num == 0 && sum > 9){ // >=10
                num = sum;
                sum = 0; // Reset sum for the next iteration
            }
        }
        
        System.out.println("The sum is: " + sum);
    }
}
