package Chapter13;
public class ObjectInsertionSort {

    public static void displayArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        String[] stringObjects = {"Apple", "World", "Elephant", "Zebra", "Yip", "Bap", "X-Ray", "Fish", "Nine", "Train"};

        System.out.println("Unsorted: ");
        displayArray(stringObjects);

        Sorts.insertionSort(stringObjects);

        System.out.println("Sorted: ");
        displayArray(stringObjects);

        
    }
}
