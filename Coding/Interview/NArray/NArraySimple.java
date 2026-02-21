package NArray;

import java.util.*;

public class NArraySimple {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===============================
        // Ask user for N dimensions
        // ===============================
        System.out.print("Enter number of dimensions (N): ");
        int N = sc.nextInt();

        int[] sizes = new int[N];
        for(int i=0; i<N; i++) {
            System.out.print("Enter size of dimension " + (i+1) + ": ");
            sizes[i] = sc.nextInt();
        }

        // ===============================
        // Create N-dimensional array dynamically
        // ===============================
        ArrayList<Object> nArray = createNArray(sizes);

        System.out.println("\nInitial N-D Array:");
        printNArray(nArray, 0);

        // ===============================
        // Example: set some values
        // ===============================
        if(N >= 3) {
            setValue(nArray, new int[]{0,0,0}, 99);
            setValue(nArray, new int[]{sizes[0]-1, sizes[1]-1, sizes[2]-1}, 100);
        } else if(N == 2) {
            setValue(nArray, new int[]{0,0}, 99);
            setValue(nArray, new int[]{sizes[0]-1, sizes[1]-1}, 100);
        } else {
            setValue(nArray, new int[]{0}, 99);
            setValue(nArray, new int[]{sizes[0]-1}, 100);
        }

        System.out.println("\nAfter setting some values:");
        printNArray(nArray, 0);

        sc.close();
    }

    // ===============================
    // CREATE N-D ARRAYLIST
    // ===============================
    public static ArrayList<Object> createNArray(int[] sizes) {
        return createNArrayHelper(sizes, 0);
    }

    private static ArrayList<Object> createNArrayHelper(int[] sizes, int dim) {
        ArrayList<Object> list = new ArrayList<>();
        if(dim == sizes.length - 1) {
            for(int i=0; i<sizes[dim]; i++) list.add(0); // default 0
        } else {
            for(int i=0; i<sizes[dim]; i++) list.add(createNArrayHelper(sizes, dim+1));
        }
        return list;
    }

    // ===============================
    // PRINT N-D ARRAYLIST
    // ===============================
    public static void printNArray(Object arr, int level) {
        if(arr instanceof ArrayList) {
            ArrayList<?> list = (ArrayList<?>) arr;
            System.out.print("[");
            for(int i=0;i<list.size();i++){
                printNArray(list.get(i), level+1);
                if(i != list.size()-1) System.out.print(", ");
            }
            System.out.print("]");
            if(level == 0) System.out.println();
        } else {
            System.out.print(arr);
        }
    }

    // ===============================
    // SET VALUE AT N-D INDICES
    // ===============================
    public static void setValue(Object arr, int[] indices, int value) {
        ArrayList<?> list = (ArrayList<?>) arr;
        for(int i=0; i<indices.length-1; i++) {
            list = (ArrayList<?>) list.get(indices[i]);
        }
        ((ArrayList<Integer>) list).set(indices[indices.length-1], value);
    }
    
}

