public class ChapterOne {
    public String stringCompression(String data) {
        String results = "";
        int counter = 0;
        // Goes through the whole array
        for(int i = 0; i < data.length(); i++) {
            // For each value >= the current index i
            for(int j = i; j < data.length(); j++) {
                // Check if the character at index j is the same as index i
                if(data.charAt(j) == data.charAt(i)) {
                    counter++;
                    // if index j has reached the maximum string length
                    if(j == data.length()-1) {
                        results += data.charAt(i) + "" + counter;
                        return results;
                    }
                    // Otherwise
                } else {
                    results += data.charAt(i) + "" + counter;
                    counter = 0;
                    i = j-1;
                    break;
                }
            }
        }

        return results;
    }

    public void rotateMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void zeroMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    // TODO: Figure out a way to fill the rest of the rows and columns with 0's 
                }
            }
        }
    }


    public void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
