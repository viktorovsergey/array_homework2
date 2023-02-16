public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------Задача 1----------------------");
        task1();
        System.out.println();
        System.out.println("----------------------Задача 2----------------------");
        task2();
        System.out.println();
        System.out.println("----------------------Задача 3----------------------");
        task3();
        System.out.println();
        System.out.println("----------------------Задача 4----------------------");
        task4();
        System.out.println();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] financeArray = generateRandomArray();
        int paymentsFull = 0;

        for (int i = 0; i < financeArray.length; i++) {
            paymentsFull = paymentsFull + financeArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + paymentsFull + " рублей");

    }

    public static void task2() {
        int[] financeArray = generateRandomArray();
        int paymentsFull = 0;
        int minPayment = financeArray[1];
        int maxPayment = financeArray[1];
        for (int i = 0; i < financeArray.length; i++) {
            if (financeArray[i] < minPayment) {
                minPayment = financeArray[i];
            }
            if (maxPayment < financeArray[i]) {
                maxPayment = financeArray[i];
            }
            // System.out.print(financeArray[i]+" "); тут я вывел для проверки какие числа были в массиве
            //чтоб проверить правильно ли работает все
        }
        //System.out.println();
        System.out.println("Минимальная сумма трат составила " + minPayment + " рублей");
        System.out.println("Максимальная сумма трат составила " + maxPayment + " рублей");
    }

    public static void task3() {
        int[] financeArray = generateRandomArray();
        int paymentsFull = 0;
        double averagePaymet = 0;

        for (int i = 0; i < financeArray.length; i++) {
            paymentsFull = paymentsFull + financeArray[i];
        }
        averagePaymet = paymentsFull / financeArray.length;
        System.out.printf("Средняя сумма трат за месяц составила " + "%.2f", averagePaymet);
        System.out.println(" рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
