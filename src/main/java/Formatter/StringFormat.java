package Formatter;

public class StringFormat {
    public String reverse(String input) {
        char[] array = input.toCharArray();
        String reversed = "";
        for (int i = 0; i < array.length; i++) {
            reversed += array[array.length - 1 - i];
        }
        return reversed;
    }


    public String toLowercase(String input) {
        return input.toLowerCase();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }
}
