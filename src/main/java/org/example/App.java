package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        int biggest;
        boolean flag = false;

        for(int i = 0; i < num.length; i++)
        {
            System.out.print("Please enter a number: ");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < num.length - 1; i++)
        {
            if(num[i] == num[i + 1])
                flag = true;
        }
        if(!flag)
        {
            biggest = num[1];
            for(int i = 0; i < num.length - 1; i++)
            {
                if(biggest < num[i+1])
                    biggest = num[i+1];
            }

            System.out.println("The largest Number is: " + biggest);
        }
    }
}
