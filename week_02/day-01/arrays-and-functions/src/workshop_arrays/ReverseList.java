package workshop_arrays;



public class ReverseList {
    public static void main(String[] args) {
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};
        int lastIndex = numbers.length - 1;

        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[lastIndex - i];
            numbers[lastIndex - i] = temp;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
