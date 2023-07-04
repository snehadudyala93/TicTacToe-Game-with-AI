public class TicTacToe {
    static char[][] board;
    public TicTacToe(){
        board = new char[3][3];
        initBoard();
        dispBoard();
    }
    void initBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }
    static void dispBoard(){
        System.out.println("-------------");
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void placeMark(int row, int col, char mark){
        board[row][col] = mark;
    }

    static boolean checkColWin(){
        for(int i = 0; i < 3; i++){
            if(board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return true;
            }
        }
        return false;
    }

    static boolean checkRowWin(){
        for(int i = 0; i < 3; i++){
            if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            }
        }
        return false;
    }

    static boolean checkDiaWin(){
            if(board[1][1] != ' ' && board[1][1] == board[2][2] && board[2][2] == board[0][0] || board[0][2] != ' ' &&
            board[0][2] == board[1][1] && board[1][1] == board[2][0]){
                return true;
            }
        return false;
    }
}
