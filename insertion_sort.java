// what happens in insertion sort
// 1. take the first item and immediate after that element compare them and put biggest on right side and smallest on left side
// iterate over the above algorithm until the smallest element is at the zeroth index

public class insertion_sort {
    public static void main(String[] args) {
        int[] numbers = { 3, 2, 5, 1, 6, 3, 7 };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers[j], numbers[j + 1]);
                }
            }
        }
    }

    public static Int[] swap()
}
