package com.homework.JavaWeek3;
//This programme is to display Odd and Evan numbers between 1to20 using DoWhile loop
public class OddEvanDoWhile {
    public static void main(String[] args) {
        int i =1; int R;
        do {
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
        }while(i<=20);
    }
}
