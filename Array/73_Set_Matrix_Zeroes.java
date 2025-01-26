public void setZeroes(int[][] matrix) {
    boolean firstRowZero = false;
    boolean firstColZero = false;

    // Check if the first row contains any zero
    for (int i = 0; i < matrix[0].length; i++) {
        if (matrix[0][i] == 0) {
            firstRowZero = true;
            break;
        }
    }

    // Check if the first column contains any zero
    for (int i = 0; i < matrix.length; i++) {
        if (matrix[i][0] == 0) {
            firstColZero = true;
            break;
        }
    }

    // Use first row and first column to mark rows and columns that need to be zeroed
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Zero out cells based on the first row and first column marks
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // Zero out the first row if needed
    if (firstRowZero) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = 0;
        }
    }

    // Zero out the first column if needed
    if (firstColZero) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }
    }
}
