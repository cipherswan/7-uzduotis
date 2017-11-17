import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Calculations calc = new Calculations();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your personal information here");

      /*  System.out.print("Name: ");
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



        System.out.println("Phone number: ");
        System.out.print("+370 ");
        String phNumber = scanner.nextLine();
        System.out.println("+370 " + person.addPhoneNumber(phNumber));

        System.out.print("Age: ");
        int age = scanner.nextInt();
        person.addAge(age);

        */

        System.out.println("Skaiciavimai");
        System.out.println("----------");
        System.out.println("1.Sudetis");
        System.out.println("2.Atimtis");
        System.out.println("3.");
        System.out.println("4.");
        int expression = scanner.nextInt();

        switch(expression) {
            case 1 :
                System.out.print("Per kableli parasykite, kokius skaicius norite sudeti: ");
                String sumInput = scanner.next();
                calc.add(sumInput);
                break;

            case 2 :
                System.out.println("Per kableli parasykite, kokius du skaicius norite atimti: ");
                String diffInput = scanner.next();
                calc.subtract(diffInput);

                break;


            default :

        }
    }
}
