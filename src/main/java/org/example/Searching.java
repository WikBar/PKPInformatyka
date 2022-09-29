package org.example;

public class Searching {
    public Searching(int[] numbers, int x) {
        System.out.println(search(numbers,x));
    }

    private boolean search(int[] numbers, int x) {
        int first = 0;
        int last = numbers.length - 1;
        int half = (last + first) / 2;

        while (first <= last) {
            if (numbers[half] > x) {
                first = half + 1;
            } else if (numbers[half] == x) {
                return true;
            } else {
                last = half - 1;
            }
            half = (first + last) / 2;
        }
        System.out.println("nok");

        return false;
    }
}
