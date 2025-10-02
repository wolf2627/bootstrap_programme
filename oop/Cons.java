import java.util.Scanner;

class kraybin {
    public String name = null;

    // parameterized constructor
    kraybin(String name){
        this.name = name;
        System.out.println("Student Object for " + name + "is created");
    }

    void getName(){
        System.out.println("Student Name is " + this.name);
    }

}


class Cons{
    public static void main(String[] args){
        kraybin st1 = new kraybin("moon");
        kraybin st2 = new kraybin("sun");

        st1.getName();
        st2.getName();

        st2.name = "Venus";

        st1.getName();
        st2.getName();

    }
}