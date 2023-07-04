import java.util.Scanner;

public class Human {
    String name;
    char mark;
    public Human(String name, char mark){
        this.name = name;
        this.mark = mark;
    }
    void makeMove(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter row and col");
        int row;
        int col;
        boolean isValidMove = false;
        do{
            row = scan.nextInt();
            col = scan.nextInt();

            if(isValidMove(row, col)) {
                isValidMove = true;
            }
            else {
                System.out.println("Entered position is invalid, please provide another position");
            }
        }while(!isValidMove);

        TicTacToe.placeMark(row,col,mark);
    }
    boolean isValidMove(int row, int col){
        if(row >= 0 && row < 3 && col >= 0 && col < 3){
            if(TicTacToe.board[row][col] == ' '){
                return true;
            }
        }
        return false;
    }
}
