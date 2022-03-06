package co.edu.unbosque.controller;

import co.edu.unbosque.view.SortingMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private final Scanner scan = new Scanner(System.in);

    public void menu() {
        int option;
        do {
            try {
                System.out.println("""
                        Select sorting algorithm:
                        1. BubbleSort
                        2. ShellSort
                        3. RadixSort
                        4. QuickSort
                        5. Exit
                        """);
                option = scan.nextInt();
                SortingMenus menus = new SortingMenus();
                switch (option) {
                    case 1 -> menus.bubbleSortMenu();
                    case 2 -> menus.shellSortMenu();
                    case 3 -> menus.radixSortMenu();
                    case 4 -> menus.quickSortMenu();
                    case 5 -> System.exit(0);
                    default -> System.err.println("Select a correct option");
                }
            } catch (InputMismatchException e) {
                System.err.println("You must enter a number");
                scan.nextLine();
            }
        } while (true);
    }
}
