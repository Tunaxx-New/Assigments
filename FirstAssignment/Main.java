package com.NIK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Minimum element: ");
        System.out.println(problem1(5, new int[]{10, 1, 32, 3, 45}, 0));

        System.out.print("Average sum: ");
        System.out.println(problem2(4, new int[]{3, 2, 4, 1}));

        System.out.print("Prime or Composite:");
        System.out.println(problem3(11, -1));

        System.out.print("Factorial: ");
        System.out.println(problem4(5));

        System.out.print("Fibonacci: ");
        System.out.println(problem5(17));

        System.out.print("Pow: ");
        System.out.println(problem6(6, 10));

        System.out.print("Reverse: ");
        Scanner scanner = new Scanner(System.in);
        problem7(4, scanner);
        System.out.println();

        System.out.print("Digits in string: ");
        System.out.println(problem8("123a56", 0));

        System.out.print("Binomial coefficient: ");
        System.out.println(problem9(7, 3));

        System.out.print("Euclid: ");
        System.out.println(problem10(10, 7));
    }


    public static int problem1(int n, int[] arr, int min)
    {
        //Changin min value if it start point
        if (n == arr.length)
            min = Integer.MAX_VALUE;

        //End border of recursion
        if (n == 0)
            return min;

        //Check and change if element less than min
        if (arr[n - 1] < min)
        {
            return problem1(n - 1, arr, arr[n - 1]);
        }
        else {
            return problem1(n - 1, arr, min);
        }
    }



    public static float problem2(int n, int[] arr)
    {
        //Last element in sum is 0
        if (n < 0)
            return 0;

        //Sum of all elements
        if (n < arr.length)
            return problem2(n - 1, arr) + arr[n];

        //returns sum / n
        return problem2(n - 1, arr) / n;
    }



    public static boolean problem3(int n, int divider)
    {
        if (divider == -1)
            return problem3(n, 2);

        //Checking if even
        if (divider == 2) {
            if (n % 2 == 0)
                return false;
            divider = 3;
        }

        //Checking if divides on numbers
        if (divider < Math.sqrt(n)) {
            if (n % divider == 0)
                return false;
            System.out.println(divider);
            return problem3(n, divider + 2);
        }
        else {
            return true;
        }
    }



    public static long problem4(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        return problem4(n - 1) * n;
    }



    public static int problem5(int n)
    {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return problem5(n - 1) + problem5(n - 2);
    }



    public static int problem6(int n, int a)
    {
        if (n == 0)
            return 1;
        return problem6(n - 1, a) * a;
    }



    public static void problem7(int n, Scanner scanner)
    {
        if (n == 0)
            return;
        int a = scanner.nextInt();
        problem7(n - 1, scanner);
        System.out.print(a + " ");
    }



    public static String problem8(String src, int i)
    {
        if (i == src.length())
            return "Yes";
        if (47 < src.charAt(i) && src.charAt(i) < 58)
            return problem8(src, i + 1);
        return "No";
    }



    public static int problem9(int n, int k)
    {
        if (k == 0 || k == n)
            return 1;
        return problem9(n - 1, k - 1) + problem9(n - 1, k);
    }



    public static int problem10(int a, int b)
    {
        if (b == 0)
            return a;
        return problem10(b, a % b);
    }
}
