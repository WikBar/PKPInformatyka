package org.example;

public class Searching {
// constriuctor is printing a message if this number is in a list
    public Searching(int[] numbers, int x) {
        System.out.println(search(numbers,x));
    }

    private boolean search(int[] numbers, int x) {
        int first = 0;
        int last = numbers.length - 1;
        int half = (last + first) / 2;
// with this kind of search we are starting at the index in the middle of array

        while (first <= last) {
            //if x is lower than middle index number then we are replacing first index with the middle one +1
            if (numbers[half] > x) {
                first = half + 1;
            } else if (numbers[half] == x) {
                return true;
                //if x is higher than middle index number then we are replacing last index with the middle one -1
            } else {
                last = half - 1;
            }
            // at the end we are calculating again an index number of the middle on a smaller range
            half = (first + last) / 2;
        }
        System.out.println("nok");

        return false;
    }
}
