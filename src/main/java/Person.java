class Person {

    boolean at = false;
    boolean ageValid = false;
    int max = 30;
    int min = 6;
    boolean passTooShort = false;
    boolean isTooLong = false;
    boolean hasUppercase = false;
    boolean locationValid = false;
    boolean phNumberValid = false;
    boolean phNumberLength = false;


    String addFirstName(String firstName) {
        int length = checkCharacterLength(firstName);

        if (firstName != null && !firstName.trim().isEmpty()) {

            if (length > max) {
                isTooLong = true;
                System.out.println("First name must contain no more than 30 characters.");
            }
        }else
        {
            throw new RuntimeException("No first name");
        }

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
        int length = checkCharacterLength(lastName);

        if (lastName != null && !lastName.trim().isEmpty()) {

            if (length > max) {
                isTooLong = true;
                System.out.println("Last name must contain no more than 30 characters.");
            }

        }else
        {
            throw new RuntimeException("No last name");
        }
        return lastName;
    }

    int addAge(int age) {
        if (age <= 0){
            throw new RuntimeException("Wrong age input");
        }
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
        hasUppercase = !location.equals(location.toLowerCase());

        if (location != null && !location.trim().isEmpty()) {

            if (hasUppercase) {
                locationValid = true;
            } else {
                System.out.println("Reikia is didz. raides");
            }
        }else {
            throw new RuntimeException("No location entered");
        }
        return location;
    }

    String addEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {

            if (email.contains("@") && email.contains(".com")) {
                at = true;
                System.out.println("OK");
            } else System.out.println("Wrong input");
        }else {
            throw new RuntimeException("No email address");
        }

        return email;
    }

    String addPhoneNumber(String phNumber) {
        String[] strArray = phNumber.split("");
        int[] intArray = new int[strArray.length];

        if (phNumber != null && !phNumber.trim().isEmpty()) {

            if (phNumber.length() == 8) {
                phNumberLength = true;

                for (int i = 0; i < strArray.length; i++) {
                    intArray[i] = Integer.parseInt(strArray[i]);
                }
                if (intArray[0] == 6) {
                    phNumberValid = true;
                }
            } else {
                phNumberValid = false;
                System.out.println("Not a valid number.");
            }

        }else {
            throw new RuntimeException("No phone number");
        }
        return phNumber;
    }

    String addPassword(String password) {
        int length = checkCharacterLength(password);

        if (password != null && !password.trim().isEmpty()) {

            if (length < min) {
                passTooShort = true;
                System.out.println("Password length must be 6 characters or more.");
            }
        }else {
            throw new RuntimeException("No password");
        }

        return password;
    }
}

