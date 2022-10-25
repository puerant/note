package Acwing.Level1.Graph;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目:
 *  给定一个 n 个点 m 条边的有向图，点的编号是 1 到 n，图中可能存在重边和自环。
 *  请输出任意一个该有向图的拓扑序列，如果拓扑序列不存在，则输出 −1。
 *  若一个由图中所有点构成的序列 A 满足：对于图中的每条边 (x,y)，x 在 A 中都出现在 y 之前，则称 A 是该图的一个拓扑序列。
 * 输入:
 *  第一行包含两个整数 n 和 m。
 *  接下来 m 行，每行包含两个整数 x 和 y，表示存在一条从点 x 到点 y 的有向边 (x,y)。
 * 输出:
 *  共一行，如果存在拓扑序列，则输出任意一个合法的拓扑序列即可。
 *  否则输出 −1。
 * 数据范围:
 *  1≤n,m≤10^5
 */
public class TopologySort {

    static final int N = 100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] h = new int[N];
    static int[] d = new int[N];
    static int[] q= new int[N];
    static int n, m, idx;

    private static void add(int x, int y) {
        e[idx] = y;
        ne[idx] = h[x];
        h[x] = idx ++;
    }

    private static boolean topologySort() {
        int tt = -1, hh = 0;
        for (int i = 1; i <= n; i ++) {
            if (d[i] == 0) q[++ tt] = i;
        }

        while (hh <= tt) {
            int t = q[hh ++];
            for (int i = h[t]; i != -1; i = ne[i]) {
                int j = e[i];
                d[j] --;
                if (d[j] == 0) q[++ tt] = j;
            }
        }

        return tt == n - 1;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        Arrays.fill(h, -1);
       for (int i = 0; i < m; i ++) {
           int x, y;
           x = sc.nextInt();
           y = sc.nextInt();
           add(x, y);
           d[y] ++; // 入度 + 1
       }
       if (topologySort()) {
           for (int i = 0; i < n; i ++) {
               System.out.printf("%d ", q[i]);
           }
       } else {
           System.out.print("-1");
       }
    }
}
