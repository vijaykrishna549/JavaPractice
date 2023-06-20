package regex_excercise;

import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        System.out.println("Regex String Check");
        String string = "Vijay12";
        System.out.println(string.replaceAll("([A-Z][a-z]*)","HELLO"));
        String num = "841423";
        System.out.println(num.replaceAll("([1-9]{6})","Correct Pin-code"));

//UC 1 ->    As a User need to enter a valid First Name , First name starts with Cap and has minimum 3 characters
        System.out.println(Pattern.matches("^[A-Z][a-z]{3,}$", "Vijay"));
//UC 2 -> As a User need to enter a valid Last Name - Last name starts with Cap and has minimum 3 characters
        System.out.println(Pattern.matches("^[A-Z][a-z]{3,}\\s[A-Z][a-z]{3,}$","Vijay Krishna"));
//UC 3 -> As a User need to enter a valid email- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
    }
}
