public class PracticeProblem {

    public static void main(String args[]) {
        // You can test your methods here
        int[][] testArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Total sum: " + sum2D(testArray));
        System.out.println("Row 0 sum: " + sumRow(testArray, 0));
        System.out.println("Column 1 sum: " + sumColumn(testArray, 1));
    }

    // Question 1 method
    public static int sum2D(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    // Question 2 method
    public static int sumRow(int[][] array, int row) {
        int sum = 0;
        for (int j = 0; j < array[row].length; j++) {
            sum += array[row][j];
        }
        return sum;
    }

    // Question 3 method
    public static int sumColumn(int[][] array, int column) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (column < array[i].length) {
                sum += array[i][column];
            }
        }
        return sum;
    }

    public static void q4() {
        //Write question 4 code here
    }

    public static void q5() {
        //Write question 5 code here
    }
}