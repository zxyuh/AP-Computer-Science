package Chapter13;

import java.util.ArrayList;

import javafx.scene.shape.Circle;
 
 public class Sorts {	


	/**
	 * Sorts an array of data from low to high
	 * pre: none
	 * post: items has been sorted from low to high
	 */
	public static void selectionSort(Circle[] test) {
		
		for (int index = 0; index < test.length; index++) {
			for (int subIndex = index; subIndex < test.length; subIndex++) {
				if (test[subIndex] < test[index]) {
					int temp = test[index];
					test[index] = test[subIndex];
					test[subIndex] = temp;
				}
			}	
		}
	}


	/**
	 * Sorts an array of objects from low to high
	 * pre: none
	 * post: objects have been sorted from low to high
	 */
	public static void selectionSort(Comparable[] items) {
		
		for (int index = 0; index < items.length; index++) {
			for (int subIndex = index; subIndex < items.length; subIndex++) {
				if (items[subIndex].compareTo(items[index]) < 0) {
					Comparable temp = items[index];
					items[index] = items[subIndex];
					items[subIndex] = temp;
				}
			}	
		}
	}



}

