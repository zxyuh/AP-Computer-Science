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

    //Ternary Search Method
    public static int ternarySearch(int[] items, int start, int end, int goal){
       if(end >= 1){
        int mid1 = start + (end - start) / 3;
        int mid2 = end - (end - start) / 3;
        System.out.println("Searching: " + mid1 + " & " + mid2);

        if(items[mid1] == goal){
            return mid1;
        }
        if(items[mid2] == goal){
            return mid2;
        }

        if(goal < items[mid1]){
            return ternarySearch(items, start, mid1 - 1, goal);
        } else if (goal > items[mid2]){
            return ternarySearch(items, mid2 - 1, end, goal);
        } else {
            return ternarySearch(items, mid1 + 1 , mid2 - 1, goal);
        }
       }
       return -1;
        
    }

    //Interpolation Search Method
    public static int interpolationSearch(int[] items, int start, int end, int goal){
        int mid = ((goal - items[start]) / (items[end] - items[start])) * (end - start) + start;
        if(goal == items[mid]){
            return mid;
        } else if(goal > items[mid]){
            return interpolationSearch(items, start + 1, end, goal);
        } else {
            return interpolationSearch(items, start - 1, end, goal);
        }

    }
    
}
