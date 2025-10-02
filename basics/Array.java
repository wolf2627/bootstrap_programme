import java.util.Scanner;

class Array{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int no_of_elements = sc.nextInt(); //6

        int[] arr = new int[no_of_elements]; //6

        // arr[0] = 5;
        // arr[1] = 10;
        // arr[2] = 15;

        for(int i=0; i<=no_of_elements - 1; i++){ // i<3
            System.out.print("Enter value for arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        // System.out.println(arr);

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[3]);

        for(int i=0; i<no_of_elements; i++){ // i<3
            System.out.println("arr["+ i +"] = "+arr[i]);
        }

        // char[] abc = {'q', 'w', 'e', 'r', 't', 'y'};

        // System.out.println(abc);

        // System.out.println(abc[0]);
        // System.out.println(abc[1]);
        // System.out.println(abc[2]);
        // System.out.println(abc[3]);
        // System.out.println(abc[4]);
        // System.out.println(abc[5]);

        // for(int i=0; i<6; i++){
        //     System.out.println(abc[i]);
        // }
    }
}
