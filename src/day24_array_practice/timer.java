package day24_array_practice;

import java.util.Scanner;

public class timer {
	public static void main(String[] args)  {
        
		Scanner scan=new Scanner(System.in);
        System.out.println("please enter the minutes");
        int minutes=scan.nextInt();
        for (int i=minutes; 0<i; --i) {
            if(i<0)break;
            for (int z=59; z>0;--z) {
                System.out.println((i-1)+" minutes and "+z+" seconds left");
                    try {Thread.sleep(1000);}
                     catch (Exception e) {e.printStackTrace();}
                }
            }
        System.out.println(" \n \t \t********************************************* ");
        System.out.println("  \t \t***                                       *** ");
        System.out.println("   \t \t***  Times is Up, Please take your seats! *** ");
        System.out.println("    \t \t***                                       *** ");
        System.out.println("     \t \t********************************************* ");   
        
        }
}
