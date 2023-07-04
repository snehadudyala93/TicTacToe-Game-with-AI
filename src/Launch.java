public class Launch {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Human p1 = new Human("Alex", 'X');
        Human p2 = new Human("Bob", 'O');

        Human nextplayer;
        nextplayer = p1;
        int count = 0;
        while(true){
            count++;
            System.out.println(nextplayer.name + " turn");
            nextplayer.makeMove();
            if(TicTacToe.checkColWin() || TicTacToe.checkDiaWin() || TicTacToe.checkRowWin()){
                System.out.println(nextplayer.name + " has won");
                System.out.println("Game Ended");
                break;
            }else if(count == 9){
                System.out.println("its a draw");
                break;
            }else{
                TicTacToe.dispBoard();
                if(nextplayer == p1) nextplayer = p2;
                else nextplayer = p1;
            }
        }
    }
}
