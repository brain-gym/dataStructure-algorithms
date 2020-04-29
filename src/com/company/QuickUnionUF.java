package com.company;

public class QuickUnionUF {
    private int[] ids;

    public QuickUnionUF(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    private int root(int id) {
        while (ids[id] != id) {
            id = ids[id];
        }
        return id;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        ids[i] = j;
    }
}
