/**
 * Created by karodes on 7/18/2017.
 */
public class CheckBoard {

    char stateOfBoard[][];
    int coloumns;
    int rows;
    public CheckBoard(int gridSize) {
        stateOfBoard = new char[gridSize][gridSize];
        this.coloumns = gridSize;
        this.rows = gridSize;
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                stateOfBoard[i][j] = ' ';
            }
        }
    }
    public CheckBoard(char[][] stateOfBoard,int rows, int coloumns) {
        this.rows = rows;
        this.coloumns = coloumns;
        this.stateOfBoard = stateOfBoard;
    }
    public char getValue(int rowNo, int coloumnNo) {
        return this.stateOfBoard[rowNo][coloumnNo];
    }

    public void display() {
        System.out.println("=================");
        for (int i = 0; i < this.rows; i++) {
            System.out.println(" ");
            for (int j = 0; j < this.coloumns; j++) {
                System.out.print(this.stateOfBoard[i][j]);
                System.out.print("  |  ");
            }
            System.out.println(" ");
            System.out.println("================");
        }
    }


}
