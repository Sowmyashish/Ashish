/**
 * Created by ashishsowmya on 7/11/19.
 */
public class divisorgame
{
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N+1];
        for(int i = 2; i <= N; i++){
            for(int x = 1; x < i; x++){
                if(i%x == 0 && dp[i-x]==false){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[N];
    }

    public static void main(String[] args)
    {
        divisorgame obj = new divisorgame();
     boolean result=   obj.divisorGame(5);
        System.out.println(result);
    }
}
