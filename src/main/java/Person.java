class Person {

    boolean at = false;
    boolean ageValid = false;

    String addFirstName(String firstName) {
        checkCharacterLength(firstName);

        return firstName;
    }

    int checkCharacterLength(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            count=count+1;
        }
        System.out.println("Ilgis: " + count);
        return count;
    }


    String addLastName(String lastName) {
        checkCharacterLength(lastName);
        return lastName;
    }

    int addAge(int age) {
        if (age < 21)
        {
            ageValid = false;
            System.out.println("Too young");

        }else if (age >120)
        {
            ageValid = false;
            System.out.println("Too old");
        }else
            ageValid = true;

        return age;
    }

    String addLocation(String location) {
        return location;
    }

    String addEmail(String email) {

        if (email.contains("@") && email.contains(".com"))
        {
            at = true;
            System.out.println("Yra @");
        }
        else System.out.println("Nera @");

        return email;
    }
}

