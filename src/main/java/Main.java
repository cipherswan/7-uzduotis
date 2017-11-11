public class Main {

    public static void main(String[] args) {
        Person sc = new Person();

        System.out.println("Enter your personal information here");

        System.out.print("Name: ");
        sc.addFirstName();

        System.out.print("Surname: ");
        sc.addLastName();

        System.out.print("Age:  ");
        sc.addAge();

    }
}
