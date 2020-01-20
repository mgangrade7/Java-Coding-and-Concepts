/*
LC 200. Number of Islands
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.
Ex 1:
Input:
11110
11010
11000
00000

Output: 1

Ex 2:
Input:
11000
11000
00100
00011

Output: 3
 */
package com.solution.coding3;

public class solution22 {
    
//    Based in DFS Algorithm
//    Time complexity O(M * N)
    public static void visited(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
        }

        visited(grid, i, j + 1);
        visited(grid, i, j - 1);
        visited(grid, i + 1, j);
        visited(grid, i - 1, j);

    }

    public static int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    visited(grid, i, j);
                }

            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1'}, {'1', '1', '0'}, {'1', '0', '0'},{'0','1','1'}};
        
        System.out.println(numIslands(grid));
    }
}
