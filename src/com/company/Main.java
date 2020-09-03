package com.company;

import java.util.Scanner;

/*public class Main {

    public static void main(String[] args) {
	System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value % 10);
    }
} */
/*public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println((value % 10) + (value / 10 % 10)+ (value/100));
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое  число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value>0)
            ++value;
        System.out.println(value);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое  число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0) {
            ++value;
        } else if (value < 0) {
            value = value - 2;
        } else if (value == 0) {
            value = 10;
        }

        System.out.println(value);
    }
}


public class Main {

    public static void main(String[] args) {
        System.out.println("Введите три целых числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a<=b&&a<=c) {
            System.out.println(a);
        } else if(b<=a&&b<=c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if((value % 2 == 0) && (value < 0)) {
            System.out.println("Отрицательное четное число " + value);
        } else if((value % 2 == 1)&& (value > 0) ){
            System.out.println("Положительное нечетное число "+ value);
        } else if (value == 0){
            System.out.println("Нулевое число "+ value);
        }

    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
         switch (value){
             case 905:
            System.out.println("Москва. Стоимость разговора: " + 4.15*10);
            break;
            case 194:
                System.out.println("Саратов. Стоимость разговора: "+ 1.98*10);
            break;
             case 491:
                 System.out.println("Краснодар. Стоимость разговора: "+ 2.69*10);
                break;
             case 800:
                 System.out.println("Киров. Стоимость разговора: "+ 5*10);
                 break;
             default:
                 System.out.println("Город не найден");
        }
        */

