package work01;

public class Utilitor {
    public static String testString(String value) {
        
        if (value == null) {
            throw new NullPointerException();
        }
        if (value.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static double testPositive(double value) {
        if (value >= 0) {
            return value;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static long computeisbn10(long isbn10) {
        
        long result = 0;
        for(int i = 2; isbn10 != 0; i++){
            result += (isbn10%10)*i;
            isbn10 = isbn10/10;
        }
        long lastIndex = 11 - (result%11);
        return lastIndex;
    }


        // 1.4 Create a public method named "computeIsbn10" in "Utilitor" class.
        // This method recieves a parameter of type "long" named "isbn10", which
        // consists of 9 digits from position 10 (leftmost) to position 2
        // (rightmost). This method returns a value of type "long" that is
        // the check-digit for "isbn10". All possible returned values are 0 to 10.
        // See https://en.wikipedia.org/wiki/Check_digit for ISBN-10 calculation.
        // ** You must use loop to calculate the ISBN-10 check-digit.

    }

