//Sorted Matrix
import java.util.Arrays;

public class binary_2Darray_2 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                {5,6,7,8,},
                {9,10,11,12},
                {13,14,15,16}};
        int target=2;
        int[] num=search2D(matrix, target);
        System.out.println(Arrays.toString(num));
    }
    static int[] search2D(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            else if (matrix[r][c]<target) {
                r++;
            }
            else{
                c--;
            }
        }

        return new int[]{-1,-1};
    }
}