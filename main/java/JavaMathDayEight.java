import java.time.LocalDate;
import java.util.Scanner;

public class JavaMathDayEight {
//    1. Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer One");
        int a = sc.nextInt();
        System.out.println("Enter Inter Two");
        int b = sc.nextInt();
        System.out.println("Enter Inter Three");
        int c = sc.nextInt();

        minMax(a,b,c);

    }

    public static void minMax(int a, int b, int c){
int calcOne = a+b*c;
int calcTwo = c+a/b;
int calcThree =  a%b+c;
int caclFour = a*b+c;

        System.out.println("Calculation for a+b* is : "+ calcOne);
        System.out.println("Calculation for c+a/b is : "+ calcTwo);
        System.out.println("Calculation for a%b+c is : "+ calcThree);
        System.out.println("Calculation for a*b+c is : "+ caclFour);
    }
}


// 2. Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.

class SpringSeason{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("To check if the date lies between 20-03-2023 and 20-06-2023");

        System.out.println("Enter month M : ");
        int month = sc.nextInt();
        System.out.println("Enter date D : ");
        int day = sc.nextInt();

        getDate(2022,month,day);
    }

    public static void getDate(int year,int month,int date){
        LocalDate startDate = LocalDate.of(2022, 3, 20);
        LocalDate endDate = LocalDate.of(2022, 6, 20);
        //Create the date object to check
        LocalDate dateToValidate = LocalDate.of(year, month, date);
        //Use the isAfter() and isBefore() method to check date
        if(dateToValidate.isAfter(startDate) && dateToValidate.isBefore(endDate))
        {
            System.out.println("The date "+dateToValidate+" lies between the two dates");
        }
        else
        {
            System.out.println(dateToValidate+" does not lie between the two dates");
        }

    }
}


//3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a
// formula delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)


class Quadratic{
    public static void main(String[] args) {

    }
}


//4. Write a program Distance.java that takes two integer command-line arguments x and y and prints
// the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to
// calculate distance = sqrt(x*x + y*y). Use Math.power function


 class Distance{
     public static void main(String[] args) {
         int x1,x2,y1,y2;
         double dis;

         Scanner sc=new Scanner(System.in);
         System.out.println("enter x1 point");
         x1=sc.nextInt();
         System.out.println("enter y1 point");
         y1=sc.nextInt();
         System.out.println("enter x2point");
         x2=sc.nextInt();
         System.out.println("enter y2 point");
         y2=sc.nextInt();
         dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
         System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);

     }
}