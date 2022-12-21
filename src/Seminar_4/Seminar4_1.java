package Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class Seminar4_1 {
    /**
     * Померить время добавления ArrayList  100_00 элементов
     */
    public static void main(String[] args) {
        System.out.println(time(ArrayList::new));
        System.out.println(time(() -> new LinkedList<>()));
    }

    private static double time(Supplier<List<Integer>> listSupplier) {
        long delay = 0;
        for (int i = 0; i < 10; i++) {
            List<Integer> numbers = listSupplier.get();
            delay += fillArray(numbers);
        }
        return delay / 10.0;
    }

    public static long fillArray(List<Integer> numbers) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        long b = System.currentTimeMillis();
        long delay = b - a;
        return (delay);
    }

}
