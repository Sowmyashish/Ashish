package medium;

/**
 * Created by ashishsowmya on 11/7/18.
 */
public class gameoflife {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0)
            return;
        int rowLength = board.length;
        int columnLength = board[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                int lives = lives(board, rowLength, columnLength, i, j);

                if(board[i][j] ==0 && lives ==3)
                {
                    board[i][j] =2;
                }
                if(board[i][j] ==1 && lives >=2 && lives <=3)
                {
                    board[i][j] =3;
                }
            }
        }
        for(int i=0;i<rowLength;i++)
        {
            for(int j=0;j<columnLength;j++)
            {
                board[i][j] >>=1;
            }
        }


    }

    public int lives(int[][] board,int rowLength,int columnlength,int i,int j)
    {
        int lives1=0;
        for(int x=Math.max(i-1,0);x<=Math.min(i+1,rowLength-1);x++)
        {
            for(int y=Math.max(j-1,0);y<=Math.min(j+1,columnlength-1);y++)
            {
                 lives1+=board[x][y]&1;
            }
        }
        lives1 -= board[i][j]&1;
        return lives1;
    }

    public static void main(String args[])
    {
        int a[][] = { {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
                     };

        gameoflife obj = new gameoflife();
        obj.gameOfLife(a);


    }
}