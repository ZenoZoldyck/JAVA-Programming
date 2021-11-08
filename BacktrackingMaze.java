public class BacktrackingMaze {
    public static void main(String[] args) {

        boolean[][] maze = {{true, true, true},{true, true, true},{true, true, true}};
        AllPossible("", 0, 0, 2, maze);
    }

    public static void AllPossible(String a, int row, int col, int num, boolean[][] maze) {
        if(!maze[row][col] | row < 0 | col < 0)
            return;
        if(row == num & col == num) {
            System.out.println(a);
            return;
        }
        maze[row][col] = false;
        if(row > 0)
            AllPossible(a + "U", row - 1, col, num, maze);
        if(col > 0)
            AllPossible(a + "L", row, col - 1, num, maze);
        if(row < 2)
            AllPossible(a + "D", row + 1, col, num, maze);
        if(col < 2)
            AllPossible(a + "R", row, col + 1, num, maze);

        maze[row][col] = true;
    }
}