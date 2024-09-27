package com.beginner;

import java.util.Scanner;

public class PascalTriangleChat {
	

	    public static int factorial(int n) {
	        if (n == 0) return 1;
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    public static int binomialCoefficient(int n, int k) {
	        return factorial(n) / (factorial(k) * factorial(n - k));
	    }

	    public static void printPascalTriangle(int rows) {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(binomialCoefficient(i, j) + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int getValueAt(int row, int col) {
	        return binomialCoefficient(row, col);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows for Pascal's Triangle: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter the row number: ");
	        int row = scanner.nextInt();
	        System.out.print("Enter the column number: ");
	        int col = scanner.nextInt();

	        printPascalTriangle(rows);

	        int value = getValueAt(row, col);
	        System.out.println("Value at (" + row + "," + col + ") is: " + value);
	    }
	}



