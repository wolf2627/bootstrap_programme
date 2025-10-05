class Address {
    String city;

    Address(String city){
        this.city = city;
    }
}


class Name{
    String name;

    Name(String name){
        this.name = name;
    }
}


class Student{
    Name name;
    int age;
    Address address;

    // Normal Constructor (parameterized)
    Student(Name name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // shallow copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.address = s.address;
    }

    void display(){
        System.out.println("Name: " + name.name + " Age: " + age + " Address: " + address.city);
    }

}

class ShallowCopy{
    public static void main(String[] args){

        // Address addr = new Address("Madurai");

        // Student st1 = new Student("Murugan", 20, addr);

        Student st1 = new Student(new Name("Murugan") , 20, new Address("Madurai"));
        st1.display();

        // copy
        Student nst = new Student(st1);

        nst.display();

        nst.name.name = "siva";
        nst.address.city = "Dindigul";

        nst.display();
        st1.display();
    }
}