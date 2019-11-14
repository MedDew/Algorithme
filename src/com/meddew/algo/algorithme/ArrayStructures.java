package com.meddew.algo.algorithme;

public class ArrayStructures {
    private int theArray[] = new int [50];
    private int arraySize = 10;
    private final static String ASC = "asc";
    private final static String DESC = "desc";

    public static void main(String[] args){
        ArrayStructures as = new ArrayStructures();
        as.generateRandomArray();
//        as.readTheArray();
//        System.out.println("\nValue at index 2 is "+as.getValueAtIndex(2));
//        System.out.println("\nValue 5 is in the array "+as.doesArrayContainThisValue(5));
//
//        System.out.println("\nDelete value at index 5:");
//        as.deleteValueAtIndex(5);
//        as.readTheArray();
//
//        System.out.println("\nInsert value at the end of the array:");
//        as.insertValue(2);
//        as.readTheArray();
//
//        System.out.println("\nFind value 3 in the array with linear search:");
//        System.out.println("Value 3 is found at index : "+as.linearSearch(3));
//
//        System.out.println("\nFind the highest in the array :");
//        as.highestArrayValue();
//
//        System.out.println("\nSorting the array in ascending order :");
//        as.bubbleSort("asc");
//        as.readTheArray();
//        System.out.println("\nSorting the array in descending order :");
//        as.bubbleSort("desc");
//        as.readTheArray();
//
//        System.out.println("\nBinary search in the array (first the array has to be sorted) :");
//        as.bubbleSort("asc");
//        as.readTheArray();
//        as.binarySearch(10);

//        System.out.println("\nSelection sort the array before:");
//        as.readTheArray();
//        as.selectionSort();
//        System.out.println("\nSelection sort the array after:");
//        as.readTheArray();

        System.out.println("\nInsertion sort the array before:");
        as.readTheArray();
        System.out.println("\nInsertion sort the array after:");
        as.insertionSort();
        as.readTheArray();
    }

    private void generateRandomArray(){
        for(int i = 0; i < arraySize; i++){
            int value = (int) Math.round(Math.random() * 10) + 10;
            theArray[i] = value;
        }
    }

    private void readTheArray(){
        for(int i = 0; i < arraySize ; i++) {
            System.out.print(i);
            System.out.print("___");
        }

        System.out.println();
        for(int i = 0; i < arraySize ; i++){
            System.out.print(theArray[i]+" | ");
        }
        System.out.println();
        for(int i = 0; i < arraySize ; i++)
            System.out.print("----");
    }

    public int getValueAtIndex(int id){
        if(id < arraySize){
            return theArray[id];
        }
        return 0;
    }

    public boolean doesArrayContainThisValue(int val){
        for(int i = 0; i < arraySize ; i++){
            if(theArray[i] == val){
                return true;
            }
        }
        return false;
    }

    public void deleteValueAtIndex(int id){
        if(id < arraySize){
            for(int i = id; i < (arraySize - 1) ; i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }

    public void insertValue(int val){
        if(arraySize < 50){
            theArray[arraySize] = val;
            arraySize++;
        }
    }

    public String linearSearch(int val){
        String str = "";
        boolean valueInArray = false;
        for(int i = 0; i < arraySize; i++){
            if(theArray[i] == val){
                valueInArray = true;
                str += String.valueOf(i)+" <=> ";
            }
        }

        if(!valueInArray){
            System.out.println("The value "+val+" is not in the array");
        }

        return str;
    }

    public void highestArrayValue(){
        int highestValue = 0;
        for(int i = 0; i < arraySize; i++){
            int comparableValue = theArray[i];
            for(int j = i+1; j < arraySize;j++){
                //System.out.println("i"+i+"j"+j);
                if(comparableValue > theArray[j]){
                    highestValue = comparableValue;
                } else if(comparableValue < theArray[j]){
                    highestValue = theArray[j];
                }
                comparableValue = highestValue;
            }
            if(i == 0){
                System.out.println("The highestValue in the array is "+highestValue);
                return;
            }
        }
    }

    public void bubbleSort(String sort){
//        int x = 0;
//        for(int i = 0; i < arraySize; i++){
//            int currentVal = theArray[i];
//            for(int j = i+1; j < arraySize; j++){
//                if(currentVal < theArray[j]){
//                    currentVal = theArray[j];
//                    theArray[x] = currentVal;
//                    x++;
//                }
//            }
//            if(i == 0)
//                return;
//        }
        ArrayStructures ar = new ArrayStructures();
        for(int i = arraySize - 1; i > 1; i--){
//            System.out.println();
            for(int j = 0; j < i; j++){
//                System.out.print("i"+i+"j"+j+" | ");
                if(sort.equals(ASC)){
                    if(theArray[j] > theArray[j+1]){
                        int temp = theArray[j];
                        theArray[j] = theArray[j+1];
                        theArray[j+1] = temp;
                    }
                } else if(sort.equals(DESC)){
                    if(theArray[j] < theArray[j+1]){
                        int temp = theArray[j];
                        theArray[j] = theArray[j+1];
                        theArray[j+1] = temp;
                    }
                }
            }
        }
    }

    public void readModifiedArray(int [] arr){
        //System.out.println();
        for(int i = 0; i < arraySize; i++){
            System.out.print("+");
            System.out.print(i);
            System.out.print("+++");
            if(i == arraySize -1) {
                System.out.println();
            }
        }

        for(int i = 0; i < arraySize; i++){
            System.out.print(arr[i]+" | ");
            if(i == arraySize -1) {
                System.out.println();
            }
        }

        for(int i = 0; i < arraySize; i++){
            System.out.print("+++++");
        }
    }

    public void binarySearch(int value){
        int lowerId = 0;
        int higherId = arraySize - 1;


        while(lowerId <= higherId){
            int middleId = (lowerId + higherId) / 2;

            if(theArray[middleId] < value){
                lowerId = middleId + 1;
            } else if(theArray[middleId] > value){
                higherId = middleId - 1;
            } else {
                System.out.print("\n Found value "+value+" at index "+middleId+" +> "+theArray[middleId]+" | "+lowerId+" <=> "+higherId);
                lowerId = higherId +1;
            }
        }
    }

    public void selectionSort(){
        for(int i = 0; i < arraySize; i++){
            int minimum = i;
            for(int j = i; j < arraySize; j++){
               //System.out.println("i : "+i+" theArray[minimum] : "+theArray[minimum]+" => "+j+" => "+theArray[j]);
                if(theArray[minimum] > theArray[j]){
                    minimum = j;
                }
            }

            int temp = theArray[i];
            theArray[i] = theArray[minimum];
            theArray[minimum] = temp;
        }
    }

    public void insertionSort(){
        for(int i = 1; i < arraySize; i++){
            int  j = i;
            int toInsert = theArray[i];

            while ((j > 0) && (theArray[j-1] > toInsert)){
                theArray[j] = theArray[j-1];
                j--;
            }
            System.out.println(j+" ==> "+toInsert);
            theArray[j] = toInsert;
        }
    }
}
