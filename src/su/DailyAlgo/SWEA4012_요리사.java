import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA4012
{
    static int[][] arr;
    static int N,answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {

            answer = Integer.MAX_VALUE;
            N = Integer.parseInt(br.readLine());

            arr= new int[N][N];

            for (int i = 0; i < N; i++) {

                st = new StringTokenizer(br.readLine()," ");

                for (int j = 0 ; j < N ; ++j){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            boolean[] visited = new boolean[N];
            combination(0,0,visited);

            System.out.println("#"+t+" "+answer);
        }
    }

    private static void combination(int start, int cnt, boolean[] visited) {
        if(cnt==N/2){
            int sum1 = 0,sum2=0;

            for (int i = 0; i < N-1; i++) {
                for (int j = i+1; j < N; j++) {
                    if(visited[i]&&visited[j]){
                        sum1+=arr[i][j];
                        sum1+=arr[j][i];
                    }
                    else if(!visited[i]&&!visited[j]){
                        sum2+=arr[i][j];
                        sum2+=arr[j][i];
                    }
                }
            }

            answer = Math.min(answer,Math.abs(sum1-sum2));
            return;
        }

        for (int i = start; i < N; i++) {
            if(visited[i])  continue;
            visited[i] = true;
            combination(i+1,cnt+1,visited);
            visited[i] = false;
        }

    }
}
