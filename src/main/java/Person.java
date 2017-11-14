class Person {


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
            throw new RuntimeException("Too young");
        }
        return age;
    }

    String addLocation(String location) {
        return location;
    }

    String addEmail(String email) {
        return email;
    }
}

