import java.util.Scanner;

public class P1166 {
    public static void main(String[] args) {
        long N; int L; int W; int H;
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            args = sc.nextLine().split(" ");
        }
        N = Long.parseLong(args[0]);
        L = Integer.parseInt(args[1]);
        W = Integer.parseInt(args[2]);
        H = Integer.parseInt(args[3]);
        double left = 0; double right = Math.max(Math.max(L,W),H)+1;
        double maxA = 0; long n; double mid;
        for (int i=0;i<Math.pow(10,4);i++) {
            mid = (left + right) / 2;
            n = (long)(W/mid) * (long)(L/mid) * (long)(H/mid);
            if (n < N) {
                right = mid;
            }
            else {
                maxA = mid; left = mid;
            }
        }
        System.out.println(String.format("%.9f", maxA));
    }
}
