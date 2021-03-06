class Calculations {

    int add(String input) {
        int sum = 0;

        if (input != null && !input.trim().isEmpty())
        {
            String[] strArray = input.split(",");
            int[] intArray = new int[strArray.length];

            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
                sum = sum + intArray[i];
            }
        }else {
            System.out.println("EMPTY");
            throw new RuntimeException("No numbers to add");
        }
        System.out.println("sum: " + sum);
        return sum;
    }

    int subtract(String input) {
        int diff;
        int count = 0;

        if (input != null && !input.trim().isEmpty()) {

            String[] strArray = input.split(",");
            int[] intArray = new int[strArray.length];

            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
                count = i;
            }
            if (count == 0){
                diff = intArray[0];
            }else {
                diff = intArray[0] - intArray[1];
            }

        } else {
            System.out.println("EMPTY");
            throw new RuntimeException("No numbers to subtract");
        }

        System.out.println("Difference: " + diff);
        return diff;
    }

    int multiply(String input) {
        int answer = 1;

        if (input != null && !input.trim().isEmpty())
        {
            String[] strArray = input.split(",");
            int[] intArray = new int[strArray.length];

            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
                answer = answer * intArray[i];
            }

        }else {
            System.out.println("EMPTY");
            throw new RuntimeException("No numbers to multiply");
        }
        System.out.println("Answer: " + answer);
        return answer;
    }

    int divide(String input) {
        int answer;
        int count = 0;

        if (input != null && !input.trim().isEmpty()) {

            String[] strArray = input.split(",");
            int[] intArray = new int[strArray.length];

            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
                count = i;
            }
            if (count == 0){
                throw new RuntimeException("Vienas skaicius, negalima dalinti");
            }else{
                if (intArray[1] == 0)
                {
                    throw new IllegalArgumentException("Negalima dalinti is nulio");
                }
                answer = intArray[0] / intArray[1];
            }

        } else {
            System.out.println("EMPTY");
            throw new RuntimeException("No numbers to divide");
        }

        System.out.println("Answer: " + answer);
        return answer;
    }
}
