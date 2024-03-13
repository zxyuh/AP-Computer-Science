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

    public static int binarySearch(String[] items, int start, int end, String goal){
        if(start > end){
            return -1;
        } else {
            int mid = (start + end) / 2;
            System.out.println("Examining " + mid);
            if (items[mid].equalsIgnoreCase(goal)){
                return mid;
            } else if (items[mid].compareToIgnoreCase(goal) > 0){
                return binarySearch(items, start, mid - 1, goal);
            } else {
                return binarySearch(items, mid + 1, end, goal);
            }
        }
    }

    public static int binarySearch2(int[] items, int start, int end, int goal){
        int mid = 0;
        do{
            if (start > end){
                return -1;
            } else {
                mid = (start + end) / 2;
                System.out.println("Examining " + mid);
                if(goal == items[mid]){
                    return mid;
                } else if(goal < items[mid]){
                    end = end - 1;
                } else {
                    start = start + 1;
                }
            }
        } while (goal != items[mid]);

        return mid; 
    }
    
}
