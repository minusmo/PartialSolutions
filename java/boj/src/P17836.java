import java.util.Map;
import java.util.Scanner;

public class P17836 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N; int M; int T; boolean isFailed;
        N = sc.nextInt(); M = sc.nextInt(); T = sc.nextInt();
        int[][] map = new int[N][M];
        Map.Entry<Integer, Integer> gramPos;
        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 2) {gramPos = Map.entry(i,j);}
            }
        }
        if (isPrincessTrapped(N,M,map) && isGramTrapped(map,N,M,gramPos)) {
            // failed
            isFailed = true;
        }
        else if (isPrincessTrapped(N,M,map)) {
            // Then get to gram and take gramX or gramY
        }
        else {
            int time = Math.min(timeWithoutGram(), timeWithGram());
            isFailed = time > T ? true : false;
        }

    }
    static boolean isPrincessTrapped(int N, int M, int[][] map) {
        return (map[N-2][M-1] != 2 || map[N-1][M-2] != 2);
    }
    static boolean isGramTrapped(int[][] map, int N, int M, Map.Entry<Integer,Integer> gramPos) {
        int gramY = gramPos.getKey(); int gramX = gramPos.getValue();
    }
}
