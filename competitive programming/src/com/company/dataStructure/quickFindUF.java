package com.company.dataStructure;

public class quickFindUF {
    private int[] ids;

    public quickFindUF(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return ids[p] == ids[q];
    }

    public void union(int p, int q) {
        int id_p = ids[p];
        int id_q = ids[q];

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == id_p) {
                ids[i] = id_q;
            }
        }

    }
}
