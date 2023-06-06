package day_eleven_part2;

import java.util.Scanner;

public class Day11Part2 {
    public static void main(String[] args) {
        Day11Part2 fibonacci = new Day11Part2();
        fibonacci.fibonacci();
        System.out.println();
        Day11Part2 perfectNumber = new Day11Part2();
        perfectNumber.perfectNumber();
        Day11Part2 primeNumber = new Day11Part2();
        primeNumber.primeNumber();
        Day11Part2 reverseNumber = new Day11Part2();
        reverseNumber.reverseNumber();

        }
//1. Fibonacci Series
//Fibonacci series is a special type of series in which the next term is the sum of the previous two terms.
// For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).

    public void fibonacci(){
        int n1 = 0;
        int n2 = 1,n3,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate fibonacci series");
        int count = sc.nextInt();
        System.out.println(" ");
        System.out.print(n1+" "+n2);
        for (i=2;i<count;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

//    2. Perfect Number
//a. Just like the Armstrong number, the Perfect Number is also a special type of positive number.
// When the number is equal to the sum of its positive divisors excluding the number, it is called a Perfect Number. For example, 28 is the perfect number because when we sum the divisors of 28, it will result in the same number.
//The divisors of 28 are 1, 2, 4, 7, and 14. So,
//b. 28 = 1+2+4+7
//c. 28 = 28

    public void perfectNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer to check perfect number");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=number/2)
        {
            if(number%i == 0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum == number)
            System.out.println(number+" is Perfect Number");
        else System.out.println(number+" is not Perfect Number");
    }

//3. Prime Number
//Just like the Perfect number, the Prime number is also a special type of number.
// When the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime number.
// 0 and 1 are not counted as prime numbers. All the even numbers can be divided by 2,
// so 2 is the only even prime minister.
    public void primeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer to check prime number");
        int number = sc.nextInt();
        boolean flag = false;
        int i=2;
        while (i<=number/2){
           if(number%i ==0){
               flag = true;
               break;
           }
           ++i;
        }
        if(!flag){
            System.out.println(number+ " is a prime number");
        }
        else {
            System.out.println(number+ " is not a prime number");
        }
    }

//    4. Reverse a number
//In Java, we can reverse a number either by using for loop, while loop, or using recursion. The simplest way to reverse a number is by using for loop or while loop. In order to reverse a number, we have to follow the following steps:
//a. We need to calculate the remainder of the number using the modulo
//b. After that, we need to multiply the variable reverse by 10 and add the remainder into it.
//c. We then divide the number by 10 and repeat steps until the number becomes 0.

    public void reverseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to reverse");
        int number = sc.nextInt();
        int reversed = 0;

        System.out.println("Original Number: " + number);

        // run loop until num becomes 0
        while(number != 0) {

            // get last digit from num
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
