package general;

/**
 * Created by ashishsowmya on 2/10/19.
 */
public class maxAreaofIsland {

    public int maxAreaOfIsland(int[][] grid)
    {
        if(grid.length == 0)
        {
            return 0;
        }
        int rowLength =grid.length;
        int colLength = grid[0].length;
        int maxArea=0;
        for(int i=0;i<rowLength;i++)
        {
            for(int j=0;j<colLength;j++)
            {
                if(grid[i][j] ==1)
                {
                    int area = maxArea(i,j,rowLength,colLength,grid,0);
                    maxArea = Math.max(maxArea,area);
                }

            }
        }
            return maxArea;
    }



    private int maxArea(int i,int j,int m,int n,int[][] grid,int area)
    {
        if( i < 0 || j <0 || i >= m || j >= n || grid[i][j] ==0)
            return 0;

        grid[i][j] =0;
        area++;

        return 1+ maxArea(i,j+1,m,n,grid,area) + maxArea(i,j-1,m,n,grid,area)+ maxArea(i-1,j,m,n,grid,area)+ maxArea(i+1,j,m,n,grid,area);


    }

    public static void main(String[] args)
    {
        int[][] a= { {1,1,0,0,0},
                     {1,1,0,0,0},
                     {0,0,0,1,1},
                     {0,0,0,1,1}

                   };
        maxAreaofIsland obj = new maxAreaofIsland();
       int result= obj.maxAreaOfIsland(a);
        System.out.println(result);
    }
}
