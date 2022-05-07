package com.homework.JavaWeek4;

public class Practice2 {

    void firstOutput()
    {
     for (int i =1; i <=5; i++)
     {
        for (int b =1;b<=i;b++)
        {
            System.out.print("*  ");
        }
         System.out.println(" ");
     }
    }

    void secondOutput()
    {
        int d =5;
        for (int i =1; i <=5; i++)
        {
            for (int c=d;c>=1;c--)
            {
                System.out.print("  ");
            }
            for (int b =1;b<=i;b++)
            {
                    System.out.print("*   ");
            }
            System.out.println("");
            d--;
        }
    }

    void thirdOutput()
    {
        int d = 5;
        for (int i =1; i <=5; i++)
        {
            for (int c =d;c>=1;c--)
            {
                System.out.print("   ");
            }d--;
            for (int b =1;b<=i;b++)
            {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) {
        Practice2 obj = new Practice2();

        obj.firstOutput();
        System.out.println("==============");
        obj.secondOutput();
        System.out.println(" ===================");
        obj.thirdOutput();
        System.out.println("  ==============");


    }

}
