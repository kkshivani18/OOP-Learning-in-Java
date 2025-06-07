package packages.llibrary.utils;

public class InputValidator {

    public static boolean isValidName(String name){
        return name != null && name.matches("[A-Za-z]");
    }

    public static boolean isValidISBN(long isbn){
        return String.valueOf(isbn).length() == 13;
    }
}
