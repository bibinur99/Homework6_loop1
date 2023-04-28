public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();
       task9();
       task10();
    }

    public static void task1() {
        System.out.println("Task One");
        for (int i=1; i<11;i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task Two");
        for (int i = 0; i < 10; i++) {
            System.out.print(10 -i+ " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task Three");
        for (int i = 0; i < 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task Four");
        for (int i = 0; i <=20; i++){
            System.out.print(10-i+" ");
        }
        System.out.println();
    }


    public static void task5() {
        System.out.println("Task Five");
        for (int i = 1904; i< 2097; i+=4 ) {
            System.out.println(i+ " "+ "год является високосным");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Task Six");
        for (int i = 1; i <= 14; i++) {
            System.out.print((7 * i) + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Task Seven");
        for (int j = 1; j < 513; j*=2) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Task Eight");
        int sumInitial = 29000;
        int totalSum = 0;
        for (int k = 1; k < 13; k++) {
            totalSum += sumInitial;
            System.out.println("Месяц " + k + ", " + "сумма накоплений равна" +
                    " " + totalSum + " " + "рублей");
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Task Nine");
        int totalSum = 0;
        int sumInitial = 29000;
        for (int k =1; k<13; k++) {
            totalSum = totalSum + (totalSum / 100);
            totalSum = totalSum + sumInitial;
            System.out.println("Месяц " + k+ ", сумма накоплений равна " +
                    totalSum+ " рублей");
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Task Ten");
        System.out.println("Таблица умножения для числа 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }






}