public class matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int totalSum = 0;
        int largest = arr[0][0];
        int[] rowSum = new int[arr.length];
        int[] colSum = new int[arr[0].length];
        int diagonalSum = 0;

        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                totalSum += arr[i][j];
                largest = Math.max(largest, arr[i][j]);
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];

                if (i == j) {
                    diagonalSum += arr[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nSum of all elements: " + totalSum);
        System.out.println("Largest element: " + largest);

        System.out.println("\nRow-wise sum:");
        for (int i = 0; i < rowSum.length; i++) {
            System.out.println("Row " + i + ": " + rowSum[i]);
        }

        System.out.println("\nColumn-wise sum:");
        for (int j = 0; j < colSum.length; j++) {
            System.out.println("Column " + j + ": " + colSum[j]);
        }

        System.out.println("\nDiagonal sum: " + diagonalSum);
    }
}
