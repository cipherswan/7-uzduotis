import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your personal information here");

        System.out.print("Name: ");
        String firstName = scanner.nextLine();
        person.addFirstName(firstName);

        System.out.print("Surname: ");
        String lastName = scanner.nextLine();
        person.addLastName(lastName);

        System.out.print("Location: ");
        String location = scanner.nextLine();
        person.addLocation(location);

        System.out.print("Email address: ");
        String email = scanner.nextLine();
        person.addEmail(email);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        person.addAge(age);


    }
}
