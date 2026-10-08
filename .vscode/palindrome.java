import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean palindrome = true;
        for(int i=0; i<n/2; i++) {
            if(arr[i] != arr[n-i-1]) {
                palindrome = false;
                break;
            }
        }
        if(palindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
    
}






// remove target value in place

public class palindrome {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 3, 6};
        int target = 3;
        int newLength = removeTarget(arr, target);

        System.out.println("New length of the array: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static int removeTarget(int[] arr, int target) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}

 

