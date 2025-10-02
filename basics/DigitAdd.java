import java.util.Scanner;

class DigitAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        num = Math.abs(num);

        if(num > 999 && num < 10000){
            int f = num / 1000;
            int l = num % 10;

            System.out.println(f+l);
        } else {
            System.out.println("Invaild Input");
        }
    }
}