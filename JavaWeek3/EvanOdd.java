package com.homework.JavaWeek3;
//This programme to print Odd and Evan numbers between 1 to 20
public class EvanOdd {
    public static void main(String[] args) {

        int R;
        System.out.println("************************************************");
        System.out.println("Below Are Odd And Evan Numbers Between 1 to 20");
        System.out.println("************************************************");
        for (int i = 1; i <= 20; i++)
        {
            R = i % 2;
            if (R != 0)
            {
                System.out.print("Odd numbers  " + i + "   ");
            }
            else
            {
                System.out.println(" Evan numbers  " + i);
            }
        }
        System.out.println("************************************************");
    }
}