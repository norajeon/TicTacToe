package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;

    }

    public Boolean isInFavorOfX() {

       for(int i = 0; i <3; i++){
           if (board[i][0] == 'X' && board[i][1] == 'X' && board [i][2] == 'X'){
               return true;
       } else if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                   return true;
               }
           else if(board[1][1] == 'X' && board[2][2] == 'X' && board[0][0] == 'X'){
               return true;
           }
           else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
               return true;
           }
           }
       return false;

//       (int j = 0; j<3; j++){
//            if (board[0][j] == 'X' || board[]
//        }
    }

    public Boolean isInFavorOfO() {

        for(int i = 0; i <3; i++){
            if (board[i][0] == 'O' && board[i][1] == 'O' && board [i][2] == 'O'){
                return true;
            } else if(board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                return true;
            }
            else if(board[1][1] == 'O' && board[2][2] == 'O' && board[0][0] == 'O'){
                return true;
            }
            else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                return true;
            }
        }
        return false;
    }

    public Boolean isTie() {
     if (isInFavorOfO() == false && isInFavorOfX() == false) {
         return true;
     }
        return false;
    }

    public String getWinner() {
        String answer = "";
        if (isInFavorOfX() == true) {
            answer = "X";
        } else if (isInFavorOfO() == true) {
            answer = "O";

        } else {
            answer = "";
        }

        return answer;
    }

}
