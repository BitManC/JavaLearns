package com.Graph.Basical.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.Scanner;

public class AdjSet {
    private int V; // 顶点
    private int E; // 边
    private TreeSet<Integer>[] adj;

    public AdjSet(String filename){
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file);){
            V = scanner.nextInt();
            if (V < 0) throw new IllegalArgumentException("V must be non-negative");
            adj = new TreeSet[V];

            for(int i = 0;i < V; i++)
                adj[i] = new TreeSet<Integer>();
            E = scanner.nextInt();
            if (E < 0) throw new IllegalArgumentException("E must be non-negative");

            for (int i = 0; i < E; i ++){
                int a = scanner.nextInt();
                validate(a);
                int b = scanner.nextInt();
                validate(b);

                if (a == b) throw new IllegalArgumentException("自环图不予考虑");
                if (adj[a].contains(b))throw new IllegalArgumentException("平行图不考虑"); // 平行边是自己到自己的图

                adj[a].add(b);
                adj[b].add(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void validate(int n){
        if (n < 0) throw new IllegalArgumentException(" E must be non-negtive");
    }

    public int E(){ return E;};

    public int V(){ return V;};

    public boolean hasEdge(int v, int w){
        validate(v);
        validate(w);
        return adj[v].contains(w);
    }

    public Iterable<Integer> Edgs(int v){
        // 返回所有相邻的定点
        validate(v);
        return adj[v];
    }

    public int degree(int v){
        // 定点的度是多少
        validate(v);
        return adj[v].size();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("V = %d, E = %d \n",V,E));
        for (int v = 0; v < V; v ++) {
            sb.append(String.format("%d : ", v));
            for (int w : adj[v])
                sb.append(String.format("%d ", w));
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AdjSet adjSet = new AdjSet("src/com/Graph/Basical/g.txt");
        System.out.println(adjSet);
    }
}
