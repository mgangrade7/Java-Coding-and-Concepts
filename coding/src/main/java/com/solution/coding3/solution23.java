/*
 Zombie in Matrix
 Given a 2D grid, each cell is either a zombie 1 or a human 0. Zombies can turn adjacent (up/down/left/right) 
 human beings into zombies every hour. Find out how many hours does it take to infect all humans?

Example:
Input:
[[0, 1, 1, 0, 1],
 [0, 1, 0, 1, 0],
 [0, 0, 0, 0, 1],
 [0, 1, 0, 0, 0]]

Output: 2

Explanation:
At the end of the 1st hour, the status of the grid:
[[1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1],
 [0, 1, 0, 1, 1],
 [1, 1, 1, 0, 1]]

At the end of the 2nd hour, the status of the grid:
[[1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1]]
 */
package com.solution.coding3;

import java.util.Queue;

public class solution23 {

//    BFS Algorithm
//    Time complexity O(M * N)
//    Space complexity O(M * N)
    public static int minDays(int[][] grid) {
        Queue<int[]> q = new java.util.LinkedList<>();
        int count = 0;

        int target = grid.length * grid[0].length;
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[]{i, j});
                    count++;
                }
            }
        }

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!q.isEmpty()) {

            int size = q.size();

            if (count == target) {
                return result;
            }

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                for (int[] d : directions) {
                    int ni = curr[0] + d[0];
                    int nj = curr[1] + d[1];

                    if (ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length && grid[ni][nj] == 0) {
                        count++;
                        q.offer(new int[]{ni, nj});
                        grid[ni][nj] = 1;
                    }
                }

            }
            result++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1, 0, 1}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 1}, {0, 1, 0, 0, 0}};
//        int[][] grid = {{0, 1, 0}, {0, 0,1}, {1,0,0}};
        System.out.println(minDays(grid));

    }
}
