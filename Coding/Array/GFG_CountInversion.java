package Array;

public class GFG_CountInversion {

    static int inversionCount(int arr[]) {
        // BEFORE: method was empty
        // NOW: call merge sort and return count

        count = 0;  // reset global count
        mergeSortASC(arr, 0, arr.length - 1);
        return count;
    }

    // ---------------- ADDED ----------------
    static int count = 0;   // stores inversion count

    static void mergeSortASC(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortASC(arr, left, mid);
            mergeSortASC(arr, mid + 1, right);

            mergeASC(arr, left, mid, right);
        }
    }

    static void mergeASC(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            // BEFORE:
            // if (L[i] <= R[j]) { arr[k++] = L[i++]; }
            // else { arr[k++] = R[j++]; }

            // NOW:
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                count += (n1 - i); // inversion added
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }
}
