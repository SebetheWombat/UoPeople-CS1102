package matrixdiagonal;

public class MatrixDiagonal {

    public static final int NUMBEROFROWS = 3;
    public static final int NUMBEROFCOLUMNS = 3;
    
    public static void main(String[] args) {
        
        int[][] m3 = new int[][]{
            {10, 12, 11},
            {9, 8, 31},
            {2, 16, 24}
        };
        System.out.print("Sending 3X3 matrix to 'calculateDiag' function: ");
        calculateDiag(m3);

        int[][] notSquare = new int[][]{
            {1, 1},
            {2, 2},
            {3, 3}
        };
        System.out.print("Sending 2X3 matrix to 'calculateDiag' function: ");
        calculateDiag(notSquare);
        
        int[][] m4 = new int[][]{
            {0,0,0,1},
            {0,0,1,0},
            {0,1,0,0},
            {1,0,0,0}
        };
        System.out.print("Sending 4X4 matrix to 'calculateDiag' function: ");
        calculateDiag(m4);
        
    }
    
    public static void calculateDiag(int[][] matrix){
        int numberOfRows = matrix.length;
        int numberOfColumns = matrix[0].length;
        int sum = 0;
        if(numberOfRows != numberOfColumns){
            System.out.println("This is not a square matrix.");
        } else{
            for(int i = 0; i < numberOfRows; i++){
                for (int j = numberOfColumns-1; j >=0; j--){
                    if(i+j == numberOfRows - 1){
                        sum += matrix[i][j];
                    }
                }
            }
            System.out.println("The sum of the alternate diagonal is: " + sum);
        }
    }

}
