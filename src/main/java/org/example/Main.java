package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first list
        System.out.print("Enter number of elements for first list: ");
        int size1 = scanner.nextInt();
        int[] list1 = new int[size1];
        System.out.println("Enter elements for first list:");
        for (int i = 0; i < size1; i++) {
            list1[i] = scanner.nextInt();
        }

        // Read second list
        System.out.print("Enter number of elements for second list: ");
        int size2 = scanner.nextInt();
        int[] list2 = new int[size2];
        System.out.println("Enter elements for second list:");
        for (int i = 0; i < size2; i++) {
            list2[i] = scanner.nextInt();
        }

        // Check if lists are identical
        if (equals(list1, list2)) {
            System.out.println("The lists are identical.");
        } else {
            System.out.println("The lists are not identical.");
        }
    }

    // Method to check if two arrays are identical
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}