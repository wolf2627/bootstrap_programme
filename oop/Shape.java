import java.util.Scanner;

class FourSides{
    int s1, s2, s3, s4;
    String color = null;

    FourSides(int side1, int side2, int side3, int side4, String color){
        System.out.println("Shape with  " + side1 + " " + side2 + " " + side3 + " " + side4 + " is Created");
        this.s1 = side1;
        this.s2 = side2;
        this.s3 = side3;
        this.s4 = side4;
        this.color = color;
    }

    void Area(){
        System.out.println(s1 * s2 * s3 * s4);
    }

    void getColor(){
        System.out.println(color);
    }

}


class Shape{
    public static void main(String[] args){
        FourSides r1 = new FourSides(10, 20, 30 , 40, "pink");
        r1.Area();
        r1.getColor();
    }
}