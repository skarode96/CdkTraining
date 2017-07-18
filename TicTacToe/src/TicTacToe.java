import org.junit.Assert;
import org.junit.Test;

/**
 * Created by karodes on 7/18/2017.
 */
public class TicTacToe {

  /*  public static void main(String[] args) {
        char boardStatus[][] = {{'X','X','X'},{'O','X','O'},{'X','O','O'}};
        CheckBoard checkBoard = new CheckBoard(boardStatus,3,3);
        checkBoard.display();
        System.out.println(checkBoard.getValue(0,0));
        TicTacToeTest ticTacToeTest = new TicTacToeTest(checkBoard);
        System.out.println(ticTacToeTest.checkColoumn(1));
        System.out.println(ticTacToeTest.checkRow(1));
        System.out.println(ticTacToeTest.checkDiagonal());
        System.out.println(ticTacToeTest.checkAntiDiagonal());
    }
*/
    @Test
    public void testGrid() {
        char boardStatus[][] = {{'X','X','X'},{'O','X','O'},{'X','O','O'}};
        CheckBoard checkBoard = new CheckBoard(boardStatus,3,3);
        checkBoard.display();
        TicTacToeTest ticTacToeTest = new TicTacToeTest(checkBoard);
        char expected = 'X';
        Assert.assertEquals("Testing 1",expected,ticTacToeTest.winner());

    }


}
