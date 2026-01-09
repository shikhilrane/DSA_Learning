package _02_Array.Problems._14_Sliding_Window;

// Solve the following program using Sliding Window Technique

public class SlidingWindow {
    public static void main(String[] args) {
        int[] array = {100,48,82,157,34,112,65};
        int window = 3;

        int slidingWindowAnswer = slidingWindow(array,window);
        System.out.println(slidingWindowAnswer);
    }

    public static int slidingWindow(int[] a, int windowSize) {
        int maxSum;              // Stores maximum window sum
        int windowSum = 0;       // Stores sum of current window

        // Step 1: Calculate sum of first window
        for (int i = 0; i < windowSize; i++) {
            windowSum = windowSum + a[i]; // Add first k elements
        }

        maxSum = windowSum; // Initialize maxSum with first window sum
        int startIndex = 0; // start index of max window

        // Step 2: Slide the window
        for (int i = windowSize; i < a.length; i++) {
            windowSum = windowSum - a[i - windowSize] + a[i];   // Remove element going out and add new incoming element
            if (windowSum > maxSum) {                           // Update maxSum if current window is bigger
                maxSum = windowSum;
                startIndex = i - windowSize + 1;                // update start
            }
        }

        // Print maximum window
        System.out.print("Maximum window: ");
        for (int i = startIndex; i < startIndex + windowSize; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        return maxSum; // Return maximum window sum
    }
}

/*
    What the Question is Asking (Sliding Window – Fixed Size):

    You are given:
        - An integer array
        - A window size (k)

    Your task:
        - Find the maximum sum of any contiguous subarray
          of size exactly k.

    Important points:
        - Subarray must be contiguous
        - Window size is fixed
        - You must consider all possible windows of size k

    Example:
        Array = {100, 48, 82, 157, 34, 112, 65}
        Window size = 3

        Possible windows and sums:
            {100, 48, 82} → 230
            {48, 82, 157} → 287
            {82, 157, 34} → 273
            {157, 34, 112} → 303  ✅ (maximum)
            {34, 112, 65} → 211

        Answer = 303
*/

/*
    Logic (Sliding Window – Fixed Size):

    Idea:
        Instead of recalculating sum for every window,
        reuse the previous window sum.

    Steps:
        1. Calculate sum of first window (first k elements).
        2. Store it as maxSum.
        3. Slide the window one step at a time:
            - Remove the element going out of window
            - Add the new element coming into window
        4. Update maxSum if current windowSum is bigger.

    Why Sliding Window?
        - Brute force takes O(n * k)
        - Sliding window reduces it to O(n)

    Time Complexity:
        O(n)

    Space Complexity:
        O(1)

    In short:
        Add next element, remove previous element,
        keep track of maximum sum.
*/