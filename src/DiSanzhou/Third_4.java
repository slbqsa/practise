package DiSanzhou;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Third_4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //sc.nextLine();
        char A[][] = new char[m][n];
        for (int i = 0; i < m; ++i) {
            String s = sc.nextLine();
            for (int j = 0; j < n; ++j) {
                A[i][j] = s.charAt(j);
            }
        }
        System.out.println(maze(A));
    }

    /**
      0 2 1 1 1
      0 1 a 0 A
      0 1 0 0 3
      0 1 0 0 1
      0 1 1 1 1
     */
    public static int maze(char A[][]) {
        for (int i = 0; i < A.length; ++i)
            for (int j = 0; j < A[0].length; ++j)
                if (A[i][j] == '2')
                    return bfs(A, i, j);
        return -1;
    }

    public static int bfs(char A[][], int i, int j) {
        int m = A.length, n = A[0].length;
        boolean visit[][][] = new boolean[m][n][1200];

        Queue<node> queue = new LinkedList<>();
        int direction[][] = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};//左右上下

        node p = new node(i, j, 0, 0);
        visit[i][j][0] = true;
        queue.add(p);
        while (!queue.isEmpty()) {
            node q = queue.poll();
            if (A[q.x][q.y] == '3')
                return q.level;
            for (i = 0; i < 4; ++i) {
                p = new node(q.x + direction[i][0], q.y + direction[i][1], q.keys, q.level + 1);

                if (p.x < 0 || p.x >= m || p.y < 0 || p.y >= n || A[p.x][p.y] == '0') {
                    continue;
                }
                //遇见门且没钥匙
                if (A[p.x][p.y] >= 'A' && A[p.x][p.y] <= 'Z' && ((1 << (A[p.x][p.y] - 'A')) & q.keys) == 0) {
                    continue;
                }
                if (A[p.x][p.y] >= 'a' && A[p.x][p.y] <= 'z') {
                    p.keys = q.keys | (1 << (A[p.x][p.y] - 'a'));
                }
                if (!visit[p.x][p.y][p.keys]) {
                    visit[p.x][p.y][p.keys] = true;
                    queue.add(p);
                }
            }
        }
        return -1;
    }

}

class node {
    int x;
    int y;
    int keys;
    int level;

    public node(int i, int j, int k, int l) {
        x = i;
        y = j;
        keys = k;
        level = l;
    }
}