import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

enum Status {
    COMPLETED("Congrats, You came over the rock", 1), 
    ONGOING("You are on the rock, Be careful", 2),
    PENDING("You have to go to the rock", 3);

    private String msg;
    private int num;

    // Constructor
    Status(String message, int status_no){
        msg = message;
        num = status_no;
    }

    // getter 
    public String getMessage(){
        return this.msg;
    }
}

class User{
    String name;
    String email;
    Task task; 

    User(String name, String email){
        this.name = name; 
        this.email = email; // TODO: Implement regex
    }

    // Create a task 

    public boolean createTask(String name, String description, ZonedDateTime deadline){

        // TODO: Exception Handling

        Task t = new Task(name, description, deadline);
        this.task = t;
        return true;
    }

    // view a task
    public void showTasks(){
       System.out.println("Your Tasks");
        System.out.println("Task Name: " + this.task.name);
        System.out.println("Description : " + this.task.description);
        System.out.println("Status: " + this.task.status.getMessage());
        System.out.println("Deadline: " + this.task.deadline);
        System.out.println("Created At: " + this.task.createdAt);
        System.out.println("Updated At: " + this.task.updatedAt);
    }


}

class Task{
    String name;
    String description;
    ZonedDateTime deadline;

    // Status
    Status status;

    // CreatedAt
    ZonedDateTime createdAt;
    // UpdatedAt
    ZonedDateTime updatedAt;

    ZoneId zone = ZoneId.of("Asia/Kolkata");

    // Constructor
    Task(String name, String description, ZonedDateTime deadline){
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.status = Status.PENDING;
        this.createdAt = ZonedDateTime.now(zone);
        this.updatedAt = ZonedDateTime.now(zone);
    }

    // TODO write getters


    

}

class ToDOApp{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

       User u = new User("Jerry", "jerry@example.com");

        String taskName = sc.nextLine();
        String taskDescription = sc.nextLine();
        short year = sc.nextShort();
        short month = sc.nextShort();
        short day = sc.nextShort();
        short hour = sc.nextShort();
        short minutes = sc.nextShort();
        short seconds = sc.nextShort();
        short milliseconds = sc.nextShort();

    //    boolean creationStatus = u.createTask(, "Get and Store Cheese for tomorrow's food", ZonedDateTime.of(2025, 12, 5, 13, 0, 0, 0,  ZoneId.of("Asia/Kolkata")));
        boolean creationStatus = u.createTask(taskName, taskDescription, ZonedDateTime.of(year, month, day, hour, minutes, seconds, milliseconds, ZoneId.of("Asia/Kolkata")));

        if(creationStatus){
            System.out.println("Task Created Successfully");


            u.showTasks();

        } else {
            System.out.println("Task Creation Failed");
        }

       
    }
}