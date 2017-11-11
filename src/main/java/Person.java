import java.util.Scanner;

class Person {

    private String firstName;
    private String lastName;
    private int age;

    private Scanner scanner = new Scanner(System.in);

    void addFirstName(){
        firstName = scanner.nextLine();
    }

    void addLastName(){
        lastName = scanner.nextLine();
    }

    void addAge(){
        age = scanner.nextInt();
    }
}
