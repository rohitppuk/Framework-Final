package com.homework.JavaWeek3;
//This programme is to print Odd and Evan numbers between 1 to 20 using While Loop
public class OddEvanWhileLoop {
    public static void main(String[] args) {
        int i =1;
        int R;
        while(i <=20)
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
         i++;
        }
    }
}
