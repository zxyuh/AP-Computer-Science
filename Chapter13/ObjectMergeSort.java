package Chapter13;

public class ObjectMergeSort {
    public static void displayArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        String[] words = {"Apple", "World", "Elephant", "Zebra", "Hello", "Blue", "X-Ray", "Fish", "Nine", "Train"};

        System.out.println("Unsorted: ");
        displayArray(words);

        Sorts.mergesort(words, 0, words.length - 1);
        System.out.println("Sorted: ");
        displayArray(words);
    }
}
