package com.Graph.Basical.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// 只处理简单图
public class AdjMatrix {
    private int V; // 顶点
    private int E; // 边
    private int [][] adj;

    public AdjMatrix(String filename){
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file);){
            V = scanner.nextInt();
            if (V < 0) throw new IllegalArgumentException("V must be non-negative");
            adj = new int[V][V];
            E = scanner.nextInt();
            for (int i = 0; i < E; i ++){
                int a = scanner.nextInt();
                validate(a);
                int b = scanner.nextInt();
                validate(b);
                adj[a][b] = 1;
                adj[b][a] = 1;
                if (a == b) throw new IllegalArgumentException("自环图不予考虑");
                if (adj[a][b] == 1)throw new IllegalArgumentException("平行图不考虑");
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
        return adj[v][w] == 1;
    }

    public ArrayList<Integer> Edgs(int v){
        validate(v);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < V; i ++)
            if(adj[v][i] == 1)
                al.add(i);
        return al;
    }

    public int degree(int v){
        return Edgs(v).size();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("V = %d, E = %d \n",V,E));
        for (int i = 0; i < V; i ++){
            for (int j = 0;j < V; j ++)
                sb.append(String.format("%d ", adj[i][j]));
            sb.append('\n');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        AdjMatrix adjmatrix = new AdjMatrix("src/com/Graph/Basical/g.txt");
        System.out.println(adjmatrix);
    }
}
