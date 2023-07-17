import java.util.Scanner;
public class MainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findDiagonalSum(arr, n, m));
        sc.close();
    }

    static int findDiagonalSum(int[][] arr,int n,int m) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}