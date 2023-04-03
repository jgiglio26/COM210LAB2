
package lab2com210;

import java.util.Arrays;

public class Lab2COM210 {
    

    public static void main(String[] args) {

        int[] Array1 = new int[50];
        
        for (int i = 0; i< 50; i++){
            Array1[i] = i+1;
        }
        
        //Unsorted Fetch
        
        int randomIndex = (int) (Math.random() * 50);
        int value = Array1[randomIndex];
        System.out.println("Value at index " + randomIndex + " is " + value);
        
        // Sorted Fetch
        
        int index = 24; // choose an index
        int value1 = Array1[index];
        System.out.println("Value at index " + index + " is " + value);
        
        //Sorted Insert
        
        int[] Array1InsertArray = Arrays.copyOf(Array1, Array1.length + 1);
        int newValue = 28; // choose a value to insert
        int indexToInsert = Arrays.binarySearch(Array1, newValue);
        if (indexToInsert < 0) {
            indexToInsert = -(indexToInsert + 1);
        }
        System.arraycopy(Array1InsertArray, indexToInsert, Array1InsertArray, indexToInsert + 1, Array1InsertArray.length - indexToInsert - 1);
        Array1InsertArray[indexToInsert] = newValue;
        System.out.println("Sorted array after insertion: " + Arrays.toString(Array1));
        
        //Unsorted Insert
        
        int[] Array1unsortedInsertArray = Arrays.copyOf(Array1, Array1.length + 1);
        int newUnsortedValue = 51; // choose a value to insert
        int indexToUnsortedInsert = 5; // choose an index to insert at
        System.arraycopy(Array1unsortedInsertArray, indexToUnsortedInsert, Array1unsortedInsertArray, indexToUnsortedInsert + 1, Array1unsortedInsertArray.length - indexToUnsortedInsert - 1);
        Array1unsortedInsertArray[indexToUnsortedInsert] = newUnsortedValue;
        System.out.println("Unsorted array after insertion: " + Arrays.toString(Array1unsortedInsertArray));
        
        //Sorted Delete
        
            int[] Array1sortedDeleteArray = Arrays.copyOf(Array1, Array1.length - 1);
        int valueToDelete = 28; // choose a value to delete
        int indexToDelete = Arrays.binarySearch(Array1sortedDeleteArray, valueToDelete);
        if (indexToDelete >= 0) {
            System.arraycopy(Array1sortedDeleteArray, indexToDelete + 1, Array1sortedDeleteArray, indexToDelete, Array1sortedDeleteArray.length - indexToDelete);
            System.out.println("Sorted array after deletion: " + Arrays.toString(Array1sortedDeleteArray));
        } else {
            System.out.println("Value not found in sorted array");
        }
        
        //Unsorted Delete
        
        int[] Array1unsortedDeleteArray = Arrays.copyOf(Array1, Array1.length - 1);
        int valueToUnsortedDelete = 17; // choose a value to delete
        int indexToUnsortedDelete = 8; // choose an index to delete
        if (indexToUnsortedDelete >= 0 && indexToUnsortedDelete < Array1unsortedDeleteArray.length) {
            System.arraycopy(Array1unsortedDeleteArray, indexToUnsortedDelete + 1, Array1unsortedDeleteArray, indexToUnsortedDelete, Array1unsortedDeleteArray.length - indexToUnsortedDelete);
            Array1unsortedDeleteArray[Array1unsortedDeleteArray.length - 1] = 0; // set last element to 0
            System.out.println("Unsorted array after deletion: " + Arrays.toString(Array1unsortedDeleteArray));
        } else {
            System.out.println("Index out of bounds in unsorted array");
        }

        int[] Array2 = new int[100];
        
        for (int i = 0; i< 100; i++){
            Array2[i] = i+1;
        }
        
        //Unsorted Fetch
        
        int randomIndex2 = (int) (Math.random() * 50);
        int value2 = Array2[randomIndex2];
        System.out.println("Value at index " + randomIndex + " is " + value2);
        
        //Sorted Fetch
        
        int index2 = 24; // choose an index
        int valueindex2 = Array2[index2];
        System.out.println("Value at index " + index2 + " is " + valueindex2);
        
        //Sorted Insert
        
        int[] Array2InsertArray = Arrays.copyOf(Array2, Array2.length + 1);
        int newValue2 = 28; // choose a value to insert
        int index2ToInsert = Arrays.binarySearch(Array2, newValue2);
        if (index2ToInsert < 0) {
            index2ToInsert = -(index2ToInsert + 1);
        }
        System.arraycopy(Array2InsertArray, index2ToInsert, Array2InsertArray, index2ToInsert + 1, Array2InsertArray.length - index2ToInsert - 1);
        Array2InsertArray[index2ToInsert] = newValue2;
        System.out.println("Sorted array after insertion: " + Arrays.toString(Array2InsertArray));
        
        //Unsorted Insert
        
        int[] Array2unsortedInsertArray = Arrays.copyOf(Array2, Array2.length + 1);
        int newUnsortedValue2 = 51; // choose a value to insert
        int indexToUnsortedInsert2 = 5; // choose an index to insert at
        System.arraycopy(Array2unsortedInsertArray, indexToUnsortedInsert2, Array2unsortedInsertArray, indexToUnsortedInsert2 + 1, Array2unsortedInsertArray.length - indexToUnsortedInsert2 - 1);
        Array2unsortedInsertArray[indexToUnsortedInsert2] = newUnsortedValue2;
        System.out.println("Unsorted array after insertion: " + Arrays.toString(Array2unsortedInsertArray));
        
        //Sorted Delete
        
            int[] Array2sortedDeleteArray = Arrays.copyOf(Array2, Array2.length - 1);
        int valueToDelete2 = 28; // choose a value to delete
        int indexToDelete2 = Arrays.binarySearch(Array2sortedDeleteArray, valueToDelete2);
        if (indexToDelete2 >= 0) {
            System.arraycopy(Array2sortedDeleteArray, indexToDelete2 + 1, Array2sortedDeleteArray, indexToDelete2, Array2sortedDeleteArray.length - indexToDelete2);
            System.out.println("Sorted array after deletion: " + Arrays.toString(Array2sortedDeleteArray));
        } else {
            System.out.println("Value not found in sorted array");
        }
        
        //Unsorted Delete
        
        int[] Array2unsortedDeleteArray = Arrays.copyOf(Array2, Array2.length - 1);
        int valueToUnsortedDelete2 = 17; // choose a value to delete
        int indexToUnsortedDelete2 = 8; // choose an index to delete
        if (indexToUnsortedDelete >= 0 && indexToUnsortedDelete2 < Array2unsortedDeleteArray.length) {
            System.arraycopy(Array2unsortedDeleteArray, indexToUnsortedDelete2 + 1, Array2unsortedDeleteArray, indexToUnsortedDelete2, Array2unsortedDeleteArray.length - indexToUnsortedDelete2);
            Array2unsortedDeleteArray[Array2unsortedDeleteArray.length - 1] = 0; // set last element to 0
            System.out.println("Unsorted array after deletion: " + Arrays.toString(Array2unsortedDeleteArray));
        } else {
            System.out.println("Index out of bounds in unsorted array");
        }
        
        int[] Array3 = new int[1000];
        
        for (int i = 0; i< 1000; i++){
            Array3[i] = i+1;
        }
        
        //Unsorted Fetch
        
        int randomIndex3 = (int) (Math.random() * 50);
        int value3 = Array3[randomIndex3];
        System.out.println("Value at index " + randomIndex3 + " is " + value3);
        
        //Sorted Fetch
        
        int index3 = 24; // choose an index
        int valueindex3 = Array3[index];
        System.out.println("Value at index " + index3 + " is " + valueindex3);
        
        //Sorted Insert
        
        int[] Array3InsertArray = Arrays.copyOf(Array3, Array3.length + 1);
        int newValue3 = 28; // choose a value to insert
        int indexToInsert3 = Arrays.binarySearch(Array3InsertArray, newValue3);
        if (indexToInsert3 < 0) {
            indexToInsert3 = -(indexToInsert3 + 1);
        }
        System.arraycopy(Array3InsertArray, indexToInsert3, Array3InsertArray, indexToInsert3 + 1, Array3InsertArray.length - indexToInsert3 - 1);
        Array3InsertArray[indexToInsert3] = newValue;
        System.out.println("Sorted array after insertion: " + Arrays.toString(Array3InsertArray));
        
        //Unsorted Insert
        
        int[] Array3unsortedInsertArray = Arrays.copyOf(Array3, Array3.length + 1);
        int newUnsortedValue3 = 51; // choose a value to insert
        int indexToUnsortedInsert3 = 5; // choose an index to insert at
        System.arraycopy(Array3unsortedInsertArray, indexToUnsortedInsert3, Array3unsortedInsertArray, indexToUnsortedInsert3 + 1, Array3unsortedInsertArray.length - indexToUnsortedInsert3 - 1);
        Array3unsortedInsertArray[indexToUnsortedInsert] = newUnsortedValue3;
        System.out.println("Unsorted array after insertion: " + Arrays.toString(Array3unsortedInsertArray));
        
        //Sorted Delete
        
            int[] Array3sortedDeleteArray = Arrays.copyOf(Array3, Array3.length - 1);
        int valueToDelete3 = 28; // choose a value to delete
        int indexToDelete3 = Arrays.binarySearch(Array3sortedDeleteArray, valueToDelete3);
        if (indexToDelete >= 0) {
            System.arraycopy(Array3sortedDeleteArray, indexToDelete3 + 1, Array3sortedDeleteArray, indexToDelete3, Array3sortedDeleteArray.length - indexToDelete3);
            System.out.println("Sorted array after deletion: " + Arrays.toString(Array3sortedDeleteArray));
        } else {
            System.out.println("Value not found in sorted array");
        }
        
        //Unsorted Delete
        
        int[] Array3unsortedDeleteArray = Arrays.copyOf(Array3, Array3.length - 1);
        int valueToUnsortedDelete3 = 17; // choose a value to delete
        int indexToUnsortedDelete3 = 8; // choose an index to delete
        if (indexToUnsortedDelete3 >= 0 && indexToUnsortedDelete3 < Array3unsortedDeleteArray.length) {
            System.arraycopy(Array3unsortedDeleteArray, indexToUnsortedDelete3 + 1, Array3unsortedDeleteArray, indexToUnsortedDelete3, Array3unsortedDeleteArray.length - indexToUnsortedDelete3);
            Array3unsortedDeleteArray[Array3unsortedDeleteArray.length - 1] = 0; // set last element to 0
            System.out.println("Unsorted array after deletion: " + Arrays.toString(Array3unsortedDeleteArray));
        } else {
            System.out.println("Index out of bounds in unsorted array");
        }
        
        }
    }
    

