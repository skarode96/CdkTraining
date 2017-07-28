/**
 * Created by karodes on 7/18/2017.
 */
public class TicTacToeTest {

    CheckBoard checkBoard;

    public  TicTacToeTest(CheckBoard checkBoard) {
        this.checkBoard = checkBoard;
    }
    public boolean checkColoumn(int coloumnNo){
            int count = 0;
            for (int j=0; j<checkBoard.rows; j++) {
                if(checkBoard.getValue(j,coloumnNo) == checkBoard.getValue(0,coloumnNo))
                    count++;
                else
                    return false;
            }
            if(count == checkBoard.coloumns)
                return true;
            else
                return false;
    }
    public boolean checkRow(int rowNo) {
        int count = 0;
        for (int j=0; j<checkBoard.coloumns; j++) {
            if(checkBoard.getValue(rowNo,j) == checkBoard.getValue(j,0))
                count++;
            else
                return false;
        }
        if(count == checkBoard.rows)
            return true;
        else
            return false;
    }
    public boolean checkDiagonal() {
        int count = 0;
        for (int j=0; j<checkBoard.rows; j++) {
            if(checkBoard.getValue(j,j) == checkBoard.getValue(0,0))
                count++;
            else
                return false;
        }
        if(count == checkBoard.rows)
            return true;
        else
            return false;

    }
    public boolean checkAntiDiagonal() {
        int count = 0;
        for (int j=checkBoard.rows; j>0; j--) {
            if(checkBoard.getValue(0,checkBoard.coloumns-1) == checkBoard.getValue(Math.abs(j-checkBoard.rows),j-1))
                count++;
            else
                return false;
        }
        if(count == checkBoard.rows)
            return true;
        else
            return false;
    }
    public char winner() {
        char ch;
        if(checkDiagonal()){
            ch = checkBoard.getValue(0,0);
            return ch;
        }
        else if(checkAntiDiagonal()) {
            ch = checkBoard.getValue(0,checkBoard.coloumns-1);
            return ch;
        }
        for (int i = 0; i < checkBoard.rows ; i++) {
            if(checkRow(i)) {
                ch = checkBoard.getValue(i,0);
                return ch;
            }

        }
        for (int i = 0; i < checkBoard.coloumns ; i++) {
            if(checkColoumn(i)) {
                ch = checkBoard.getValue(0,i);
                return ch;
            }

        }
       return 'N';
    }
}
