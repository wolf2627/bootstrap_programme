import java.util.Scanner;

class vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ui = sc.next().toLowerCase().charAt(0);

        System.out.println(ui);

        // if(ui == 'a' || ui == 'e' || ui == 'i' || ui == 'o' || ui == 'u'){
        //     System.out.println("Vowel");
        // } else {
        //     System.out.println("Consonant");
        // }

        switch(ui){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                 System.out.println("Vowel "+ ui);
                 break;
            default:
                 System.out.println("Constnant " + ui);
        }
    }
}