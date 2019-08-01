package medium;

/**
 * Created by ashishsowmya on 11/17/18.
 */
public class numberOfIslands {

    public int islands(char[][] board)
    {
        int rows = board.length;

        int count=0;
        if(board.length ==0) return 0;
        int columns=board[0].length;
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    if(board[i][j] == '1')
                    {
                        helper(i,j,board);
                        ++count;
                    }
                }
            }
            return count;
        }



    public void helper(int i,int j,char[][] board)
    {
        if(i<0 || j <0 || i>= board.length || j >= board[0].length || board[i][j] != '1') return;
        board[i][j] = '0';
        helper(i,j-1,board);
        helper(i,j+1,board);
        helper(i-1,j,board);
        helper(i+1,j,board);


    }
    public static void main(String args[])
    {
        numberOfIslands obj = new numberOfIslands();
        char[][] board={
                       { '1','1','0','0'},
                        {'0','0','0','0'},
                        {'0','0','1','1'},
                        {'0','0','0','0'}
                         };

     //   char[][] board = {};
        int result=obj.islands(board);
        System.out.println(result);
    }
}
