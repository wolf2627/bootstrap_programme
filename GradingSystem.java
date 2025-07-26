import java.util.Scanner;

class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
            return;
        }

        int gradeCategory = marks / 10;

        System.out.println("Marks: " + marks);
        System.out.println("Grade Category: " + gradeCategory);

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: O");
                break;
            case 8:
                System.out.println("Grade: A+");
                break;
            case 7:
                System.out.println("Grade: A");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }
    }
}