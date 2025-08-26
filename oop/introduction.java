import java.util.Scanner;

class pen{
    String color, name;
    int size;
    boolean cap = true;

    void write(){
        System.out.println(this.name + " is writing");
    }

    void removeCap(){
        if(this.cap){
            System.out.println(this.name + " Cap is Removed");
        } else {
            System.out.println("No Cap");
        }
    }

    void wearCap(){
        if(this.cap){
            System.out.println(this.name + " Cap is wore");
        } else {
            System.out.println("No Cap");
        }
    }
}



public class introduction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Pen for me
        pen as = new pen(); 

        // Pen for sathish
        pen sat = new pen();

        // Pen for subhasri
        pen su = new pen();

        as.color = "red";
        sat.color = "blue";
        su.color = "black";

        System.out.println("Aswin's Pen Color is " + as.color);
        System.out.println("Sathish's Pen Color is " + sat.color);
        System.out.println("Subhasri's Pen Color is " + su.color);


        as.size = 10;

        System.out.println("Aswin's Pen size is " + as.size);
        System.out.println("Sathish's Pen size is " + sat.size);
        System.out.println("Subhasri's Pen size is " + su.size);

        as.name = "Aswin";
        sat.name = "Sathish";
        su.name = "subhasri";

        sat.write();

        su.removeCap();

    }
}