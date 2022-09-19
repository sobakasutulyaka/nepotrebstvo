package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер задания: ");
        Scanner z = new Scanner(System.in);
        int zadan = z.nextInt();
        switch (zadan) {
            case 1: {
                z1();
            }
            case 2: {
                z2();
            }
            case 3: {
                z3();
            }
            case 4: {
                z4();
            }
            case 5: {
                z5();
            }
            case 6: {
                z6();
            }
            case 7: {
                z7();
            }
            case 8: {
                z8();
            }
            case 9: {
                z9();
            }
            case 10: {
                z10();
            }
        }

    }

    public static void z1() {
        System.out.println("Введите число: ");
        Scanner a = new Scanner(System.in);
        double b = a.nextDouble();
        if (b % 1 != 0) {
            System.out.println("Число не целое");
        } else {
            System.out.println(b % 10);
        }

    }

    public static void z2() {
        System.out.println("Введите число: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int sum = 0;
        if ((b >= 100) && (b <= 999)) {
            for (int i = 0; i <= 3; i++) {
                sum += b % 10;
                b = b / 10;
            }
            System.out.println("Сумма равна: " + sum);
        } else {
            System.out.println("Число не трёхзначное ");
        }
    }

    public static void z3() {
        System.out.println("Введите число: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b > 0) {
            System.out.println(b += 1);
        } else {
            System.out.println(b);
        }
    }

    public static void z4() {
        System.out.println("Введите число: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b > 0) {
            b += 1;
        } else if (b < 0) {
            b -= 2;
        } else {
            b = 10;
        }
        System.out.println("Итоговое число: " + b);
    }

    public static void z5() {
        System.out.println("Введите 3 числа через Enter: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        if (b <= c) {
            if (b <= d) {
                System.out.println(b);
            } else {
                System.out.println(d);
            }
        } else {
            if (c <= d) {
                System.out.println(c);
            } else {
                System.out.println(d);
            }
        }

    }

    public static void z6() {
        System.out.println("Введите число: ");
        Scanner a = new Scanner(System.in);
        double b = a.nextDouble();
        if (b % 1 != 0) {
            System.out.println("Число не целое");
        } else {
            if (b > 0) {
                if (b % 2 == 0) {
                    System.out.println("Число положительное чётное");
                } else {
                    System.out.println("Число положительное нечётное");
                }
            } else if (b < 0) {
                if (b % 2 == 0) {
                    System.out.println("Число отрицательное чётное");
                } else {
                    System.out.println("Число отрицательное нечётное");
                }
            } else {
                System.out.println("Число оказалось нулём");
            }


        }

    }

    public static void z7() {
        System.out.println("Введите код города: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        switch (b) {
            case 905: {
                System.out.println("Москва, стоимость разговора за 10 минут " + 4.15 * 10);
            }
            case 194: {
                System.out.println("Ростов, стоимость разговора за 10 минут " + 1.98 * 10);
            }
            case 491: {
                System.out.println("Краснодар, стоимость разговора за 10 минут " + 2.69 * 10);
            }
            case 800: {
                System.out.println("Киров, стоимость разговора за 10 минут " + 5 * 10);
            }
        }
    }

    public static void z8() {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите каждый элемент через Enter:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        int[] arrs = array;
        Arrays.sort(arrs);
        System.out.println("Максимальное число " + (arrs[arrs.length - 1]));
        int sum = 0;
        int kolvopol = 0;
        double kolvootr = 0;
        int sumotr = 0;
        int sumotr2 = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                sum += array[i];
                kolvopol += 1;
            } else if (array[i] < 0) {
                kolvootr += 1;
                sumotr += array[i];
                if (array[i] % 2 == 0) {
                    sumotr2 += array[i];
                }
            }
        }
        System.out.println("Сумма положительных элементов " + sum);
        System.out.println("Сумма чётных отрицательных эл-ов " + sumotr2);
        System.out.println("Количество положительных элементов " + kolvopol);
        System.out.println("Среднее арифмитическое отрицательных эл-ов " + sumotr / kolvootr);
    }

    public static void z9() {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите каждый элемент через Enter:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < array.length / 2; i++) {
            int vr = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = vr;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void z10() {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        int vrem[] = new int[size];
        System.out.println("Введите каждый элемент через Enter:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        int kolvo = 0;
        int ind = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                kolvo+=1;
            }
            else {
                vrem[ind] = array[i];
                ind+=1;
            }
        }
        for (int i = 0; i < kolvo; i++){
            vrem[vrem.length-i-1] = 0;
        }
        System.out.println(Arrays.toString(vrem));
    }
}