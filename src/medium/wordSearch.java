package medium;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by ashishsowmya on 2/11/19.
 */
public class wordSearch
{
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int x=0; x<board.length; x++) {
            for (int y=0; y<board[x].length; y++) {
                if (exist(board, x, y, w, 0)) return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int x, int y, char[] word, int i) {
        if (i == word.length) return true;
        if (x<0 ||y<0 || x == board.length || y == board[x].length) return false;
        if (board[x][y] != word[i])
            return false;
        board[x][y] ^= 256;
        boolean exist = exist(board, x, y+1, word, i+1)
                || exist(board, x, y-1, word, i+1)
                || exist(board, x+1, y, word, i+1)
                || exist(board, x-1, y, word, i+1);
        board[x][y] ^= 256;
        return exist;
    }




    public boolean search(char[][] board,String word)
    {
        char[] ch = word.toCharArray();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(search(i,j,board,ch,0))
                    return true;
            }
        }
        return false;
    }

    private boolean search(int x,int y,char[][] board,char[] word,int length)
    {
        if(length == board.length) return true;
        if(x < 0 || y <0 || x> board.length||y > board[0].length)
            return false;

        if(board[x][y] != word[length])  return false;

        boolean result = search(x,y+1,board,word,length+1) ||
                         search(x,y-1,board,word,length+1) ||
                         search(x-1,y,board,word,length+1) ||
                         search(x+1,y,board,word,length+1);


return result;
    }


    public static void main(String args[])
    {
        char[][] board =
            {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
            };
        wordSearch obj = new wordSearch();
        boolean flag = obj.search(board,"ABCCEE");
        System.out.println(flag);
    }
}
