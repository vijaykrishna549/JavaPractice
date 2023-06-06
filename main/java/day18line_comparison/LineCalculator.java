package day18line_comparison;

import java.math.BigDecimal;
import java.util.Scanner;

public class LineCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2: ");
        int y2 = sc.nextInt();

        LineCalculator lineCalculator = new LineCalculator();
        System.out.println("The length of line is : "+  lineCalculator.lineLength(x1,y1,x2,y2));

        double l1 = lineCalculator.line1(2,2,6,8);
        double l2 = lineCalculator.line2(1,1,8,8);
        BigDecimal line1 = new BigDecimal(l1);
        BigDecimal line2 = new BigDecimal(l2);
        System.out.println("Is line1 "+line1+ " equals line2 "+line2+" : " +line1.equals(line2));

//        UC3  As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is
//        equal, greater or less than the other line. - Using Java compareTo method to compare 2 Lengths is preferable.
        System.out.println("Java CompareTo method");
        if (line1.compareTo(line2) == 0) {
            System.out.println(line1 + " and " + line2 + " are equal.");
        }
        else if (line1.compareTo(line2) == 1) {
            System.out.println(line1 + " is greater than " + line2 + ".");
        }
        else {
            System.out.println(line1 + " is lesser than " + line2 + ".");
        }
    }

// UC 1  As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
//using the Cartesian system,So that I can calculate its length.
// - A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)

    public double lineLength(int x1, int y1,int x2, int y2){
        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return distance;
    }

    //UC 2 check equality of two lines based on the end points, Using Java equals method to check equality of 2 Lengths is
// preferable.

    public double line1(int x1,int y1, int x2,  int y2){
        double line1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return line1;
    }
    public double line2(int x1,  int y1,int x2, int y2){
        double line2=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return line2;
    }
}

//UC 4 Use Java Object Oriented Programming Concepts of Line and Point as well as equals and compareTo methods.
// - Using Java compareTo method to compare 2 Lengths is preferable.

//SATISFYIES IN UC2 AND UC3