package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число: ");
        Scanner sc = new Scanner(System.in);


        String c = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != ',')
                sum += Integer.parseInt(Character.toString(c.charAt(i)));

        }

        System.out.println("sum = " + sum);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(numbers[0]);


    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value < 0) {
            if (value % 2 == 0)
                System.out.println("Отрицательное четное число.");
            else
                System.out.println("Отрицательное нечетное число.");
        }

        if (value == 0)
            System.out.println("Ноль");

        if (value > 0) {
            if (value % 2 == 0)
                System.out.println("Положительное четное число.");
            else
                System.out.println("Положительное нечетное число.");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int time = 10;
        switch (value) {
            case 905:
                System.out.println("Москва. Стоимость разговора: " + 4.15 * time);
                break;
            case 194:
                System.out.println("Саратов. Стоимость разговора: " + 1.98 * time);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: " + 2.69 * time);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: " + 5 * 10);
                break;
            default:
                System.out.println("Город не найден");
        }
    }
}


public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int n = numbers.length;
        int temp;

        for (int i = 0; i < n / 2; i++) {

            temp = numbers[n - i - 1];
            numbers[n - i - 1] = numbers[i];
            numbers[i] = temp;

        }

        System.out.println(Arrays.toString(numbers));
    }


}
*/




