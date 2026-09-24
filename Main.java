import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 6, 55, 11, 33, 12, 76, 32};
        System.out.println("Элементы массива" + Arrays.toString(numbers));
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        } System.out.println("Сумма всех четных элементов массива" + ":" + sum);
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                count++;
            }
        } System.out.println("Кол-во нечетных элементов" + ":" + count);
    }
}

