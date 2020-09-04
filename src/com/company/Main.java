package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value % 10);
    }
}
/* public class Main {

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


public class Main {

    public static void main(String[] args) {
        int [] numbers = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int max = 0;
        int sum_plus = 0;
        int count_plus = 0;
        int sum_minus = 0;
        int arg = 0;
        int sum_negative = 0;
        int count_minus = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(max< numbers[i])
                max = numbers[i];
            if (numbers[i] >0 ) {
                sum_plus = sum_plus + numbers [i];
                count_plus ++;
            }
            if ((numbers[i] < 0) && (numbers[i] % 2 ==0)){
                sum_minus =sum_minus + numbers[i];
            }
            if (numbers[i] < 0) {
                sum_negative = sum_negative+ numbers [i];
                count_minus ++;
                arg = sum_negative/ count_minus;
           }
        }



        System.out.println("Максимальное значение= " +max);
        System.out.println("Сумма положительных элементов= " +sum_plus);
        System.out.println("Сумма четных отрицательных элементов= " +sum_minus);
        System.out.println("Количество положительных элементов= " +count_plus);
        System.out.println("Cреднее арифметическое отрицательных элементов= " +arg);
    }
}

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        for ( int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }



    }
}


public class Main {

    public static void main(String[] args) {
        int[] numbers = {5,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int j= 0;
        for ( int i = 0; i<numbers.length;  i++) {
            if (numbers[i] != 0) {
                int temp= numbers[j];
                numbers[j]=numbers[i];
                numbers[i]=temp;
                j++;
            }

            System.out.println(numbers[i]);
        }



    }
}
*/
