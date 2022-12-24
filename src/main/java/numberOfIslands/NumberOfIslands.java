package numberOfIslands;

public class NumberOfIslands {

    public int numIslands(char[][] grid){
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void callBFS(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        callBFS(grid, i + 1, j);  //Up
        callBFS(grid, i - 1, j);  //Down
        callBFS(grid, i, j - 1);  //Left
        callBFS(grid, i, j + 1);  //Right
    }

    public static void main(String[] args) {
        char[][] input1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        char[][] input2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };

        NumberOfIslands noi = new NumberOfIslands();
        System.out.println(noi.numIslands(input1));
        System.out.println(noi.numIslands(input2));
    }
}
