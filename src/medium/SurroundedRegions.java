package medium;

/**
 * Created by ashishsowmya on 10/31/18.
 */
public class SurroundedRegions {

    public void solve(char[][] board)
    {
        if(board.length ==0 || board[0].length==0)
        {
            return;
        }

        if(board.length <2 || board[0].length <2)
        {
            return;
        }

        int row =board.length;
        int column = board[0].length;


        //make first and last column to '*', if the value is '0'
        for(int i=0;i<row;i++)
        {
                if(board[i][0] == '0') // all the values in the column1
                {
                    DFS(board,i,0);
                }

                if(board[i][column-1] == '0')
                {
                    //call method to make last column to *;
                    DFS(board,i,column-1);
                }
        }

        //make first and last row of the matrix to '*' if 0 is found
        for(int i=0;i<row;i++)
        {
            if(board[0][i] == '0')
            {
                DFS(board,0,i);
            }
            if(board[row-1][i] == '0')
            {
                DFS(board,row-1,i);
            }
        }

        for(int i=1;i<row-1;i++)
        {
            for(int j=1;j<column-1;j++)
            {

                if(board[i][j] == '0')
                {
                    if(board[i][j-1] == '*' || board[i][j+1] == '*' || board[i-1][j] == '*' || board[i+1][j] == '*' )
                            //|| board[i-1][j-1] == '*'
                         //   || board[i+1][j+1] =='*' || board[i-1][j+1] == '*' || board[i+1][j-1] == '*')
                    {
                        board[i][j] ='0';
                    }
                    else
                    {
                        board[i][j] = 'X';
                    }
                }
            }
        }


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(board[i][j] == '*')
                {
                    board[i][j] = '0';
                }
            }
        }
    }

    public void DFS(char[][] board,int i,int j)
    {

        if(board[i][j] =='0')
        {
            board[i][j] ='*';
        }
    }



    public static void main(String args[])
    {
        char[][] a = {
                {'X','X','X','X'},
                {'X','0','0','X'},
                {'X','X','0','X'},
                {'X','0','X','X'}

                     };
        SurroundedRegions obj = new SurroundedRegions();
        obj.solve(a);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
    }

}
