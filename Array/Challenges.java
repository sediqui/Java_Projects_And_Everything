import java.util.Scanner;

public class Challenges {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Challenges class!");
    // Create a program to find the sum and average of all elements in an array.
    // int arr[] = {33, 52, 98, 24};
    // int sum = 0;
    // int avg = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];
    // }
    // avg = sum / arr.length;
    // System.out.println("sum of the all elements: " + sum);
    // System.out.println("avrage of the all elements: " + avg);

    // Create a program to find number of occurrences of an element in an array.
    // int arr[] = {1, 2, 2, 3, 3, 4, 2};
    // int count = 0;
    // int num = 2;
    // for(int i = 0; i < arr.length; i++){
    // if(num == arr[i]){
    // count++;
    // }
    // }
    // System.out.println(num + " number have " + count + " occurrences");
    // System.out.println("Enter a number to find the occurrences");
    // int num = sc.nextInt();
    // int occ = 0;
    // int[] arr = {1, 2, 2, 3, 3, 4, 2};
    // for(int i = 0; i < arr.length; i++){
    // if(num == arr[i]){
    // occ++;
    // }
    // }
    // System.out.println(num + " number have " + occ + " occurrences");

    // Create a program to find the maximum and minimum element in an array.
    // int arr[] = {1, 2, 3, 4, 5};
    // int max = arr[0];
    // int min = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // if (arr[i] < min) {
    // min = arr[i];
    // }
    // }
    // System.out.println("Maximum element: " + max);
    // System.out.println("Minimum element: " + min);

    // CREATE A PROGRAM TO CHECK IF THE GIVEN ARRAY IS SORTED OR NOT.
    // int arr[] = {1, 3, 2, 4, 5};
    // boolean isSorted = true;
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (arr[i] > arr[i + 1]) {
    // isSorted = false;
    // break;
    // }
    // }
    // if (isSorted) {
    // System.out.println("The array is sorted.");
    // } else {
    // System.out.println("The array is not sorted.");
    // }

    // Create a program to return a new array deleting a specific element from the
    // given array.
    // int[] arr = {2, 4 , 1, 6, 7, 9};
    // int indexCount = 0;
    // for(int i = 0; i < arr.length; i++){
    // System.out.print(arr[i] + " ");
    // indexCount++;
    // }
    // System.out.println();
    // System.out.print("which number do you want to remove: ");
    // int n = sc.nextInt();
    // int[] newArr = new int[indexCount];
    // indexCount = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if(n == arr[i]){
    // // System.out.println(arr[i] + " Number Deleted Successfully");
    // continue;
    // }
    // newArr[indexCount] = arr[i];
    // indexCount++;
    // }
    // for (int i = 0; i < newArr.length - 1; i++) {
    // System.out.print(" " + newArr[i] + " ");
    // }
    // System.out.println();

    // Create a program to reverse an array.
    // int arr[] = {1, 2, 3, 4, 5};
    // int revArr[] = new int[arr.length];
    // int count = 0;
    // for(int i = arr.length; i > 0 ; i--){
    // System.out.print(arr[count] + " ");
    // revArr[count] = arr[i - 1];
    // count++;
    // }
    // System.out.println();
    // for (int i = 0; i < revArr.length; i++) {
    // System.out.print(revArr[i] + " ");
    // }
    // System.out.println();

    // Create a program to check is the array is palindrome or not.
    // int arr[] = {1, 2, 9, 5, 1};
    // int revArr[] = new int[arr.length];
    // int count = 0;
    // boolean isPalindrome = true;
    // for(int i = arr.length; i > 0 ; i--){
    // System.out.print(arr[count] + " ");
    // revArr[count] = arr[i - 1];
    // count++;
    // }
    // System.out.println();
    // for (int i = 0; i < revArr.length; i++) {
    // if (revArr[i] != arr[i]){
    // isPalindrome = false;
    // }
    // System.out.print(revArr[i] + " ");
    // }
    // System.out.println();
    // if (isPalindrome) {
    // System.out.println("arr is palindrome.");
    // }else{
    // System.out.println("not palindrome.");
    // }

    // Create a program to merge two sorted arrays.
    // int[] arr1 = { 1, 3, 5, 7, 9 };
    // int[] arr2 = { 2, 4, 6, 8, 10 };
    // int[] mergedArr = new int[arr1.length + arr2.length];
    // int i = 0, j = 0, k = 0;
    // // while (i <= arr1.length && j < arr2.length) {
    // while (i < arr1.length && j < arr2.length) {
    // if (arr1[i] < arr2[j]) {
    // mergedArr[k++] = arr1[i++];
    // } else {
    // mergedArr[k++] = arr2[j++];
    // }
    // }
    // while (i < arr1.length) {
    // mergedArr[k++] = arr1[i++];
    // }
    // while (j < arr2.length) {
    // mergedArr[k++] = arr2[j++];
    // }
    // for (i = 0; i < mergedArr.length; i++) {
    // System.out.print(mergedArr[i] + " ");
    // }
    // Create a program to merge two sorted arrays.
    // int[] arr1 = { 1, 3, 5, 7, 9 };
    // int[] arr2 = { 2, 4, 6, 8, 10 };
    // int[] mergedArr = new int[arr1.length + arr2.length];
    // int i = 0, j = 0, k = 0;
    // while (i < arr1.length && j < arr2.length) {
    // if (arr1[i] < arr2[j]) {
    // mergedArr[k++] = arr1[i++];
    // } else {
    // mergedArr[k++] = arr2[j++];
    // }
    // }
    // // Copy any remaining elements from arr1
    // while (i < arr1.length) {
    // mergedArr[k++] = arr1[i++];
    // }
    // // Copy any remaining elements from arr2
    // while (j < arr2.length) {
    // mergedArr[k++] = arr2[j++];
    // }
    // System.out.println();
    // for (int l = 0; l < mergedArr.length; l++) {
    // System.out.print(mergedArr[l] + " ");

    // Create a program to search an element in a 2-d array.
    // int[][] arr1 = {{ 1, 3, 5, 7, 9 },{ 2, 4, 6, 8, 10 }};
    // System.out.println("Enter a number to search: ");
    // int num = sc.nextInt();
    // boolean found = false;
    // for (int i = 0; i < arr1.length; i++) {
    // for (int j = 0; j < arr1[i].length; j++) {
    // if (arr1[i][j] == num) {
    // found = true;
    // break;
    // }
    // }
    // if (found) {
    // break;
    // }
    // }
    // if (found) {
    // System.out.println(num + " is found in the array.");
    // } else {
    // System.out.println(num + " is not found in the array.");
    // }

    // Create a program to sum and average of all elements in a 2-d array.
    // int[][] arr1 = { { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8, 10 } };
    // int sum = 0;
    // int avg = 0;
    // int count = 0;
    // for (int i = 0; i < arr1.length; i++) {
    //   for (int j = 0; j < arr1[i].length; j++) {
    //     sum += arr1[i][j];
    //     count++;
    //   }
    // }
    // avg = sum / count;
    // System.out.println("Sum: " + sum);
    // System.out.println("Average: " + avg);
  
    // Create a program to fint the sum of two diagonal elements.
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int sumPrimaryDiagonal = 0;
    int sumSecondaryDiagonal = 0;

    for (int i = 0; i < arr1.length; i++) {
        sumPrimaryDiagonal += arr1[i][i];
        sumSecondaryDiagonal += arr1[i][arr1.length - 1 - i];
    }

    System.out.println("Sum of primary diagonal: " + sumPrimaryDiagonal);
    System.out.println("Sum of secondary diagonal: " + sumSecondaryDiagonal);

  }
}
