import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            Point[] points = new Point[N];

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                points[i] = new Point(x, y);
            }

            Arrays.sort(points);

            long result = 0;
            FenwickTree tree = new FenwickTree(100001);

            for (int i = 0; i < N; i++) {
                result += tree.sum(points[i].y);
                tree.update(points[i].y, 1);
            }

            System.out.println(result);
        }
    }

    static class Point implements Comparable<Point> {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return o.y - this.y;
            }
            return this.x - o.x;
        }
    }

    static class FenwickTree {
        long[] tree;

        FenwickTree(int size) {
            this.tree = new long[size + 1];
        }

        void update(int i, int diff) {
            while (i < tree.length) {
                tree[i] += diff;
                i += (i & -i);
            }
        }

        long sum(int i) {
            long result = 0;
            while (i > 0) {
                result += tree[i];
                i -= (i & -i);
            }
            return result;
        }
    }
}