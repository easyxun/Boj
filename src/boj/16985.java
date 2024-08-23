import java.util.Scanner;

public class Main {
    static int[] order = {0, 1, 2, 3, 4};
    static int[][][] cube = new int[5][5][5];
    static int[][][] temp = new int[5][5][5];
    static int[][][] rotation = {
            {{0, 0, 0}, {0, 0, 1}, {0, 0, 2}, {0, 0, 3}, {0, 0, 4}},
            {{4, 0, 0}, {3, 0, 0}, {2, 0, 0}, {1, 0, 0}, {0, 0, 0}},
            {{4, 0, 4}, {3, 0, 4}, {2, 0, 4}, {1, 0, 4}, {0, 0, 4}},
            {{0, 0, 4}, {0, 0, 3}, {0, 0, 2}, {0, 0, 1}, {0, 0, 0}},
            {{0, 0, 0}, {1, 0, 0}, {2, 0, 0}, {3, 0, 0}, {4, 0, 0}}
    };
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    cube[i][j][k] = sc.nextInt();
                }
            }
        }

        perm(0);

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }

    static void perm(int depth) {
        if (depth == 5) {
            int[][][] copy = new int[5][5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.arraycopy(cube[order[i]], 0, copy[j], 0, 5);
                }
            }

            for (int i = 0; i < 4; i++) {
                rotate(copy, i, 0);
                for (int j = 0; j < 4; j++) {
                    rotate(copy, j, 1);
                    for (int k = 0; k < 4; k++) {
                        rotate(copy, k, 2);
                        if (copy[0][0][0] == 1) {
                            min = Math.min(min, count(copy));
                        }
                    }
                }
            }
            return;
        }

        for (int i = depth; i < 5; i++) {
            int temp = order[depth];
            order[depth] = order[i];
            order[i] = temp;
            perm(depth + 1);
            temp = order[depth];
            order[depth] = order[i];
            order[i] = temp;
        }
    }

    static void rotate(int[][][] arr, int idx, int dim) {
        int[][][] temp = new int[5][5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    temp[i][j][k] = arr[i][j][k];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            int[] pos = rotation[idx][i];
            if (dim == 0) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j][pos[2]] = temp[pos[0]][j][pos[2]];
                }
            } else if (dim == 1) {
                for (int j = 0; j < 5; j++) {
                    arr[i][pos[1]][j] = temp[pos[0]][pos[1]][j];
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    arr[pos[0]][i][j] = temp[pos[0]][i][j];
                }
            }
        }
    }

    static int count(int[][][] arr) {
        int[][][] dist = new int[5][5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    dist[i][j][k] = -1;
                }
            }
        }

        int[] dx = {1, -1, 0, 0, 0, 0};
        int[] dy = {0, 0, 1, -1, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        dist[0][0][0] = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][j][k] == 0) continue;
                    for (int l = 0; l < 6; l++) {
                        int nx = i + dx[l];
                        int ny = j + dy[l];
                        int nz = k + dz[l];
                        if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5 || nz < 0 || nz >= 5) continue;
                        if (arr[nx][ny][nz] == 0 || dist[nx][ny][nz] != -1) continue;
                        dist[nx][ny][nz] = dist[i][j][k] + 1;
                    }
                }
            }
        }

        return dist[4][4][4];
    }
}