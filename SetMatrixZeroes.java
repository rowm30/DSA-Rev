import java.util.Scanner;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] pos = findZerosPos(mat);

        for (int i = 0; i < m; i++) {
            mat[pos[1]][i]=0;
        }
        for (int i = 0; i < m; i++) {
            mat[i][pos[0]]=0;
        }

        priMat(mat, m, n);

    }

    public static void priMat(int[][] mat,int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int[] findZerosPos(int matrix[][]) {
        int ans[] = new int[2]; 
        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                   ans[0] = i; 
                   ans[1] = j; 
                }
            }
        }
        return ans;
    }
}

