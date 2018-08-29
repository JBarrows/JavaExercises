package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan;
    private static int min = 100, max = 0, total = 0, count = 0;
    private static double average;
    public static void main(String[] args) {
        scan = new Scanner(System.in);

        do {
            int grade = getGrade();
            if (grade != 999)
            {
                count++;
                total += grade;
                average = (double)total / (double)count;
                min = Math.min(grade, min);
                max = Math.max(grade, max);
            }
            System.out.printf("Grade: %d\t Total: %d\t Count: %d\t Avg: %.1f\t Min: %d\t Max: %d\n",
                    grade,total, count,average,min,max);
        } while (enterNew());

    }

    private static boolean enterNew()
    {
        print("Would you like to enter another? (y/n)");
        do {
            String s = scan.next();
            if (s.toLowerCase().charAt(0) == 'y')
            {
                return true;
            }
            else if (s.toLowerCase().charAt(0) == 'n')
            {
                return false;
            }
            else
            {
                print("Invalid entry. Please enter 'y' or 'n':");
            }
        } while (true);
    }

    private static int getGrade()
    {
        print("Enter a grade (or '999' to quit):");
        do {
            try
            {
                int i = scan.nextInt();
                if ((i >= 0 && i <= 100) || i == 999) //Valid grade or quit
                {
                    return i;
                }
                else
                {
                    print("Grade must be in the range [0-100]. Try again:");
                    continue;
                }
            }
            catch (Exception ex)
            {
                print("Grade must be an integer. Try again:");
                continue;
            }
        } while (true);
    }

    private static void print(String s)
    {
        System.out.println(s);
    }
}
