// public class Array {
//     // maximum and minimum value in array

//     public static void main(String[] args) {
//         int [] arr = {1, 2, 3, 4, 5};
//         int max =  arr[0];
//         int min = arr[0];
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] > max) {
//                 max = arr[i];
//             }
//             if(arr[i] < min) {
//                 min = arr[i];
//             }

//         }
//         System.out.println("Maximum value: " + max);
//         System.out.println("Minimum value: " + min);
//     }
// }






// public class Arrayyy {
//          static void main(String[] args) {
//             int [] arr = {12, 23, 43, 25, 76};
//             int target = 23;
//             for(int i=0; i<arr.length; i++) {
//                 if(arr[i] == target) {
//                     System.out.println("Element found at index: " +i);
//                     return;
//                 }
//             }
//             System.out.println("Element not found");
//         }
//     }







// public class Arrayyy {
//     static void main(String[] args) {
//     // reverse of array
//         int [] arr = {12, 23, 45, 56, 67};
//         for(int i=arr.length-1; i>=0; i--) {
//             System.out.println(arr[i]);

//         }
//     }
// }





// public class Arrayyy {
//     static void main(String[] args) {
        // // copy array to another array
        // int [] arr = {12, 23, 45, 54, 67};
//         int [] arr2 = new int[arr.length];
//         for(int i=0; i<arr.length; i++) {
//             arr2[i] = arr[i];
//         }
//         System.out.println("Original array:");
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("\nCopied array:");
//         for(int i=0; i<arr2.length; i++) {
//             System.out.print(arr2[i] + " ");
//         }
//     }
// }





public class Arrayyy {>
        static void main(String[] args) {
                
                // reverse of array with two pointers

                int [] arr = {12, 23, 34, 45, 56};
                int start = 0;
                int end = arr.length - 1;
                while(start < end) {

                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                }

        }
}





