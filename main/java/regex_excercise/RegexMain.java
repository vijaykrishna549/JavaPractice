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
        boolean isFirstNameRegexCorrect = Pattern.matches("^[A-z][a-z]{3,}$", "Vijay");
        if(isFirstNameRegexCorrect){
            System.out.println("Regex for first name is : "+ isFirstNameRegexCorrect);
        }
        else {
            System.out.println("Regex for first name is : "+ isFirstNameRegexCorrect);
        }
        System.out.println();
//UC 2 -> As a User need to enter a valid Last Name - Last name starts with Cap and has minimum 3 characters
        boolean isFullNameRegexCorrect =Pattern.matches("^[A-Z][a-z]{3,}\\s[A-Z][a-z]{3,}$","Vijay Krishna");
        if(isFullNameRegexCorrect){
            System.out.println("Regex for full name is : "+ isFullNameRegexCorrect);
        }
        else {
            System.out.println("Regex for full name is : "+ isFullNameRegexCorrect);
        }
        System.out.println();
//UC 3 -> As a User need to enter a valid email- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
        boolean isEmailRegexCorrect = Pattern.matches("^[a-z]{3}[.][xyz]*[@][a-z]{2}[.][co]{2}[.][in]*$","abc.xyz@bl.co.in");
        if(isEmailRegexCorrect){
            System.out.println("Regex for email is : "+ isEmailRegexCorrect);
        }
        else {
            System.out.println("Regex for email is : "+ isEmailRegexCorrect);
        }
        System.out.println();

//UC 4 -> As a User need to follow pre -defined Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
        boolean isMobileNumberRegexCorrect = Pattern.matches("^([1-9]{2}[- ]?[1-9]{1}[0-9]{9})$","91 9834671094");
        if(isMobileNumberRegexCorrect){
            System.out.println("Regex for mobile is : "+ isMobileNumberRegexCorrect);
        }
        else {
            System.out.println("Regex for mobile number is : "+ isMobileNumberRegexCorrect);
        }
        System.out.println();

//UC 5-9 -> Password validation with (a) minimum 8 characters, at least 1 uppercase, at least 1 numeric and exactly one special character
        boolean isPasswordRegexCorrect =Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#]*)[a-zA-Z0-9@!#*]{8,}", "@erttyR34");
        if(isPasswordRegexCorrect){
            System.out.println("Regex for password is : "+ isPasswordRegexCorrect);
        }
        else {
            System.out.println("Regex for password is : "+ isPasswordRegexCorrect);
        }
        System.out.println();

//        Sample Emails to Test
        System.out.println("EMAIL SAMPLES FOR REGEX VALIDATION ");
        System.out.println();
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc@yahoo.com"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc-100@yahoo.com,"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc.100@yahoo.com"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc111@abc,com"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc-100@abc.com.au"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc-100@abc.net"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc@1.com"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc@gmail.com.com"));
        System.out.println(Pattern.matches("^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$", "abc+100@gmail.com"));
    }


}
