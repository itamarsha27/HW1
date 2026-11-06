
public class Assignment01Q05 {

    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        boolean[] visited = new boolean[m[i].length]; // in order to counter cycles inside the graph.
        visited[i] = true;
        int[] neighbors = new int[m[i].length]; // acts as a queue, because we may only using primitive arrays.
        int tail = 0; // who is last of the queue
        int head = 0; // who leads the queue
        int[] dist = new int[m[i].length]; // we will measure the shortest distance from i to every node by using a dist array.
        int current;
        neighbors[tail] = i;
        tail++;
        dist[i] = 0;
        while (head != tail) { // when tail and heads are equal - there are no more nodes to be checked.
            current = neighbors[head];
            head++;
            if (current == j) { // we reached j.
                return dist[current];
            }
            for (int k = 0; k < m[current].length; k++) {
                if (m[current][k] == 1 && !visited[k]) {
                    visited[k] = true;
                    neighbors[tail] = k;
                    tail++;
                    dist[k] = dist[current] + 1; // to reach k took us what it took to reach current, and another one.
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][]{{0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 0, 0, 0}}, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][]{{0, 1, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 1, 0}}, 0, 2)); // 2

    }
}
