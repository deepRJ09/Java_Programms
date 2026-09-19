import java.util.Arrays;


public class String_breaking {
    public static void main(String[] args) {
    String s="abcc0904@";
    String s2=s.replaceAll("[^0-9]","");
        String []stringArray=s2.split("");

        int[] intArray = new int[stringArray.length];

        // 2. Loop through and parse each string value into the int array
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        customSort(intArray);
        System.out.println(Arrays.toString(intArray)); // Output: [5, 12, 75, 100]
        }

    public static void customSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Loop through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place, so look at the rest
            for (int j = 0; j < n - 1 - i; j++) {
                // To sort descending, change '>' to '<'
                if (array[j] >array[j + 1]) {

                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
        }



