package Chapter13;

public class Search {
    public static int binarySearch(int[] items, int start, int end, int goal){
        if(start > end){
            return -1;
        } else {
            int mid = (start + end) / 2;
            System.out.println("Examining " + mid);
            if (goal == items[mid]){
                return mid;
            } else if ( goal < items[mid]){
                return binarySearch(items, start, mid - 1, goal);
            } else {
                return binarySearch(items, mid + 1, end, goal);
            }
        }
    }
    
}
