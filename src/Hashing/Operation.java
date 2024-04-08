package Hashing;

import java.util.HashSet;

public class Operation {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 2, 3, 9};
        int[] b = {8, 9, 2, 4};

        int intersectionCount = intersect(a, b);
        System.out.println("Intersection Count: " + intersectionCount);
        int mergeArray = merge(a,b);
        System.out.println("mergeArray = " + mergeArray);
    }

    public static int intersect(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int x : a) {
            set.add(x);
        }
        for (int x : b) {
            if (set.contains(x)) {
                count++;
                set.remove(x);
            }
        }
        System.out.println(set);
        return count;
    }
    public static int merge(int[] a,int[] b){
        HashSet<Integer> merge = new HashSet<>();
        for(int x : a){
            merge.add(x);
        }
        for(int x : b){
            merge.add(x);
        }
        System.out.println(merge);
        return merge.size();
    }
}
