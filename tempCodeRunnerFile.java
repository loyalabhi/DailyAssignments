int thousandsDigit = input1 / 1000;
        int hundredsDigit = (input2 % 1000) / 100;
        int smallestDigit = findSmallestDigit(input3);

        int key = (thousandsDigit * hundredsDigit) + smallestDigit;
        return key;
    }

    public static int findSmallestDigit(int number) {
        int minDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            minDigit = Math.min(minDigit, digit);
            number /= 10;
        }
        return minDigit;
    }