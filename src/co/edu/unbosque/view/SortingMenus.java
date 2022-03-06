package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.IntArrays;
import co.edu.unbosque.model.SortingAlgorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingMenus {
    private final Scanner scan = new Scanner(System.in);
    private final Controller c = new Controller();
    public void bubbleSortMenu() {
        int option;
        do {
            try {
                System.out.println("""
                        Select amount of data:
                        1. 4000
                        2. 40000
                        3. 400000
                        4. 4000000
                        5. 40000000
                        6. Return
                        7. Exit
                        """);
                option = scan.nextInt();
                switch (option) {
                    case 1 -> bubbleSortCase(4000);
                    case 2 -> bubbleSortCase(40000);
                    case 3 -> bubbleSortCase(400000);
                    case 4 -> bubbleSortCase(4000000);
                    case 5 -> bubbleSortCase(40000000);
                    case 6 -> c.menu();
                    case 7 -> System.exit(0);
                    default -> System.err.println("Select a correct option");
                }
            } catch (InputMismatchException e) {
                System.err.println("You must enter a number");
                scan.nextLine();
            }
        } while (true);
    }

    public void shellSortMenu() {
        int option;
        do {
            try {
                System.out.println("""
                        Select amount of data:
                        1. 4000
                        2. 40000
                        3. 400000
                        4. 4000000
                        5. 40000000
                        6. Return
                        7. Exit
                        """);
                option = scan.nextInt();
                switch (option) {
                    case 1 -> shellSortCase(4000);
                    case 2 -> shellSortCase(40000);
                    case 3 -> shellSortCase(400000);
                    case 4 -> shellSortCase(4000000);
                    case 5 -> shellSortCase(40000000);
                    case 6 -> c.menu();
                    case 7 -> System.exit(0);
                    default -> System.err.println("Select a correct option");
                }
            } catch (InputMismatchException e) {
                System.err.println("You must enter a number");
                scan.nextLine();
            }
        } while (true);
    }

    public void radixSortMenu() {
        int option;
        do {
            try {
                System.out.println("""
                        Select amount of data:
                        1. 4000
                        2. 40000
                        3. 400000
                        4. 4000000
                        5. 40000000
                        6. Return
                        7. Exit
                        """);
                option = scan.nextInt();
                switch (option) {
                    case 1 -> radixSortCase(4000);
                    case 2 -> radixSortCase(40000);
                    case 3 -> radixSortCase(400000);
                    case 4 -> radixSortCase(4000000);
                    case 5 -> radixSortCase(40000000);
                    case 6 -> c.menu();
                    case 7 -> System.exit(0);
                    default -> System.err.println("Select a correct option");
                }
            } catch (InputMismatchException e) {
                System.err.println("You must enter a number");
                scan.nextLine();
            }
        } while (true);
    }

    public void quickSortMenu() {
        int option;
        do {
            try {
                System.out.println("""
                        Select amount of data:
                        1. 4000
                        2. 40000
                        3. 400000
                        4. 4000000
                        5. 40000000
                        6. Exit
                        """);
                option = scan.nextInt();
                switch (option) {
                    case 1 -> quickSortCase(4000);
                    case 2 -> quickSortCase(40000);
                    case 3 -> quickSortCase(400000);
                    case 4 -> quickSortCase(4000000);
                    case 5 -> quickSortCase(40000000);
                    case 6 -> c.menu();
                    case 7 -> System.exit(0);
                    default -> System.err.println("Select a correct option");
                }
            } catch (InputMismatchException e) {
                System.err.println("You must enter a number");
                scan.nextLine();
            }
        } while (true);
    }

    private void bubbleSortCase(int size) {
        int option;
        do {
            System.out.println("""
                    Select case scenario:
                    1. Best Case
                    2. Average Case
                    3. Worst Case
                    4. Return
                    5. Exit
                    """);
            option = scan.nextInt();
            switch (option) {
                case 1 -> {
                    int[] data = IntArrays.mejorCaso(size);
                    long start = System.nanoTime();
                    SortingAlgorithms.bubbleSort(data);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 2 -> {
                    int[] data = IntArrays.promedio(size);
                    long start = System.nanoTime();
                    SortingAlgorithms.bubbleSort(data);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 3 -> {
                    int [] data = IntArrays.peorCaso(size);
                    long start = System.nanoTime();
                    SortingAlgorithms.bubbleSort(data);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 4 -> bubbleSortMenu();
                case 5 -> System.exit(0);
                default -> System.err.println("Select a correct option");
            }
        } while (true);
    }

    private void shellSortCase(int size) {
        int option;
        do {
            System.out.println("""
                    Select case scenario:
                    1. Best Case
                    2. Average Case
                    3. Worst Case
                    4. Return
                    5. Exit
                    """);
            option = scan.nextInt();
            switch (option) {
                case 1 -> {
                    int[] data = IntArrays.mejorCaso(size);
                    long start = System.nanoTime();
                    SortingAlgorithms.shellSort(data);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 2 -> {
                    int[] data = IntArrays.promedio(size);
                    long start = System.nanoTime();
                    SortingAlgorithms.shellSort(data);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 3 -> {
                    int[] data = IntArrays.peorCaso(size);
                    long start = System.nanoTime();
                    SortingAlgorithms.shellSort(data);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 4 -> shellSortMenu();
                case 5 -> System.exit(0);
                default -> System.err.println("Select a correct option");
            }
        } while (true);
    }

    private void radixSortCase(int size) {
        int option;
        do {
            System.out.println("""
                    Select case scenario:
                    1. Best Case
                    2. Average Case
                    3. Worst Case
                    4. Return
                    5. Exit
                    """);
            option = scan.nextInt();
            switch (option) {
                case 1 -> {
                    int[] data = IntArrays.mejorCaso(size);
                    int length = data.length;
                    long start = System.nanoTime();
                    SortingAlgorithms.radixSort(data, length);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 2 -> {
                    int[] data = IntArrays.promedio(size);
                    int length = data.length;
                    long start = System.nanoTime();
                    SortingAlgorithms.radixSort(data, length);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 3 -> {
                    int[] data = IntArrays.peorCaso(size);
                    int length = data.length;
                    long start = System.nanoTime();
                    SortingAlgorithms.radixSort(data, length);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 4 -> radixSortMenu();
                case 5 -> System.exit(0);
                default -> System.err.println("Select a correct option");
            }
        } while (true);
    }

    private void quickSortCase(int size) {
        int option;
        do {
            System.out.println("""
                    Select case scenario:
                    1. Best Case
                    2. Average Case
                    3. Worst Case
                    4. Return
                    5. Exit
                    """);
            option = scan.nextInt();
            switch (option) {
                case 1 -> {
                    int[] data = IntArrays.mejorCaso(size);
                    int length = data.length;
                    long start = System.nanoTime();
                    SortingAlgorithms.quickSort(data, 0, length-1);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 2 -> {
                    int[] data = IntArrays.promedio(size);
                    int length = data.length;
                    long start = System.nanoTime();
                    SortingAlgorithms.quickSort(data, 0, length-1);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 3 -> {
                    int[] data = IntArrays.peorCaso(size);
                    int length = data.length;
                    long start = System.nanoTime();
                    SortingAlgorithms.quickSort(data, 0, length-1);
                    long end = System.nanoTime();
                    System.out.println("Time of method: " + ((end - start) / 1000000000.0) + " seconds");
                }
                case 4 -> quickSortMenu();
                case 5 -> System.exit(0);
                default -> System.err.println("Select a correct option");
            }
        } while (true);
    }
}
