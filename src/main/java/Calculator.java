import java.util.regex.*;
public class Calculator {

    // turning a string into integers
    public static int stringToInt(String num) {
        return Integer.parseInt(num);
    }

    public static final String delimiter = (",|;|\n");

    public static int add(String input) throws Exception {
        if (input == "") {
            return 0;
        }
        if (input.startsWith("//")) {
            input = input.replace("4", ",");
            input = input.replace("***", ",");
            int index = input.indexOf("\n");
            input = input.substring(index + 1);
        }
        int number = 0;
        String[] string = input.split(delimiter);
        String negativeNumb = "";

        for (int i = 0; i < string.length; i++) {

            if (stringToInt(string[i]) < 0) {
                negativeNumb += string[i] + " ";
            }
            if (stringToInt(string[i]) >= 1000) {
                i++;
            }
            number += stringToInt(string[i]);
            if (!negativeNumb.isEmpty() && string[i] == string[string.length - 1]) {
                throw new Exception("negatives not allowed: " + negativeNumb);
            }
        }
        return number;
    }
}