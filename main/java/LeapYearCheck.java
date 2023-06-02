import java.util.Scanner;

// Day 7 practice problem
public class LeapYearCheck {
    public static void main(String[] args) {
//        1.1 Write a program to display any message:

        System.out.println("Program to find out leap year");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        checkLeap(year);
    }
//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.
    public static void checkLeap(int year){
        if ((year % 400 == 0)
                || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " : Leap Year");
        }
        else {
            System.out.println(year + " : Non - Leap Year");
        }
    }


}

// 1.2 Write a Java program to display the default value of all primitive data types of Java
class DataTypeValue{
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bl;
    public static void main(String[] args)
    {
        System.out.println("The default values of primitive data types are:");
        System.out.println("Byte :"+b);
        System.out.println("Short :"+s);
        System.out.println("Int :"+i);
        System.out.println("Long :"+l);
        System.out.println("Float :"+f);
        System.out.println("Double :"+d);
        System.out.println("Char :"+c);
        System.out.println("Boolean :"+bl);
    }
}
//    1.3 Write a program to check two strings are equal or not.
class StringCheck{
    public static void main(String[] args) {
        System.out.println("Enter string one");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("Enter string two");
        String s2 = sc.next();

        isStringEqual(s1,s2);
    }

    public static void isStringEqual(String s1, String s2){
        if(s1.equals(s2)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
}
