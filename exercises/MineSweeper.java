import java.util.Random;

public class MineSweeper {

    public static void main(String[] args) {
        MineSweeper a = new MineSweeper(20, 20, 100);
        a.printBoard();
    }

    // This is the complete board with all the mines placed.
    private int[][] finishedBoard;
    private int width;
    private int length;
    private int numMines;
    public MineSweeper() {
        width = 8;
        length = 8;
        numMines = 8;
        createBoard();
    }

    public MineSweeper(int _width, int _length, int _numMines) {
        width = _width;
        length = _length;
        numMines = _numMines;
        createBoard();
    }

    public void printBoard() {
        int i = 0;
        while (i < width) {
            int j = 0;
            while (j < length) {
                System.out.print(finishedBoard[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // By making this private, I can only access this method within this Class/file.
    // Fill out this function so that you will generate a complete minesweeper board
    // and store it in finishedBoard.  Details on the implementation will be found later.
    // Afterwards, you can then continue working on this Class and perhaps build a fully
    // functional MineSweeper game as a final Android project!
    //
    // finishedBoard: This is a 2D array that will be the cheatsheet, keeping track of
    // our complete board.  Spaces that don't contain a mine will be filled with zeroes
    // while spaces that contain a mine will be filled with ones.
    // Example:    [[1, 0],
    //              [0, 0]]  Contains 1 mine total at position [0][0].
    // Recommended: Use the determineMines method to determine where the mines will be.
    // Hint: First fill out finishedBoard with zeroes.  Then individually place each mine.
    private void createBoard() {
        int totalSize = width * length;
        int[] mineLocations = determineMines(numMines);
        finishedBoard = new int[width][length];
        int i = 0;
        while (i < width) {
            int j = 0;
            while (j < length) {
                finishedBoard[i][j] = 0;
                j++;
            }
            i++;
        }

        i = 0;
        while (i < mineLocations.length) {
            int location = mineLocations[i];
            finishedBoard[location/width][location%width] = 1;
            i++;
        }

    }

    // This will return an integer array that contains the location of each mine.
    // For example, in an 8x8 array with 3 mines, it may return [1, 10, 20].
    // This means that the mines are at [0, 1], [1, 2], [2, 4].
    private int[] determineMines(int numMines) {
        Random generator = new Random();
        int[] mineTracker = new int[numMines];
        int i = 0;
        while (i < numMines) {
            int mine = generator.nextInt(width * length);
            int j = 0;
            boolean alreadyMined = false;
            while (j < i) {
                if (mineTracker[j] == mine) {
                    alreadyMined = true;
                    break;
                }
                j++;
            }
            if (alreadyMined) {
                continue;
            }
            mineTracker[i] = mine;
            i++;
        }
        return mineTracker;
    }

}
