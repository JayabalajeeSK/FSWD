package SegmentTree;

class SegmentTree {
    int[] tree;
    int n;

    SegmentTree(int[] arr) {
        n = arr.length;
        tree = new int[4*n]; // safe size
        build(arr, 0, n-1, 1);
    }

    // Build tree
    void build(int[] arr, int start, int end, int node) {
        if(start == end) {
            tree[node] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        build(arr, start, mid, 2*node);
        build(arr, mid+1, end, 2*node+1);
        tree[node] = tree[2*node] + tree[2*node+1]; // sum
    }

    // Query sum in range [l,r]
    int query(int start, int end, int l, int r, int node) {
        if(r < start || l > end) return 0; // no overlap
        if(l <= start && end <= r) return tree[node]; // complete overlap
        int mid = (start + end) / 2;
        int left = query(start, mid, l, r, 2*node);
        int right = query(mid+1, end, l, r, 2*node+1);
        return left + right;
    }

    // Update arr[index] = value
    void update(int start, int end, int index, int value, int node) {
        if(start == end) {
            tree[node] = value;
            return;
        }
        int mid = (start + end) / 2;
        if(index <= mid) update(start, mid, index, value, 2*node);
        else update(mid+1, end, index, value, 2*node+1);
        tree[node] = tree[2*node] + tree[2*node+1];
    }
}

public class SegmentTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree st = new SegmentTree(arr);

        System.out.println("Sum of range 1-4: " + st.query(0, arr.length-1, 1, 4, 1)); // 3+5+7+9=24
        st.update(0, arr.length-1, 3, 10, 1); // arr[3] = 10
        System.out.println("After update, sum of range 1-4: " + st.query(0, arr.length-1, 1, 4, 1)); // 27
    }
}

