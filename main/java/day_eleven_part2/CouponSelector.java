package day_eleven_part2;

import java.util.Random;

public class CouponSelector {
    public static void main(String[] args) throws InterruptedException {
        CouponSelector selector = new CouponSelector();
        selector.couponNumbers();

    }
    //    5. Coupon Numbers
//a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate a distinct coupon number?
// This program simulates this random process.


    public void couponNumbers() throws InterruptedException {
        int originalCouponNumber = 10;
        System.out.println("Original coupon number is : "+ originalCouponNumber);
        Random rd = new Random();
        int couponInput = rd.nextInt(1,11);
        System.out.println("Taking Random Number ....");
        Thread.sleep(2000);
        System.out.println("Your Coupon number is : "+ couponInput);
        if(couponInput == originalCouponNumber){
            System.out.println("YOU WIN !!  Coupon is matched");
        }
        else {
            System.out.println("YOU LOST !! Coupon did not match");
        }

    }
}
