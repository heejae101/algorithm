package section8;

import java.util.Scanner;

public class Solution13 {

    static int n,answer=0;
    static int[][] board;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};


    public void DFS(int x, int y){
        for(int i=0; i<8; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny);
            }
        }
    }
    public int solution(){
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    answer++;
                    board[i][j] = 0;
                    DFS(i,j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution13 T = new Solution13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution());
    }
}
