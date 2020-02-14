public class Driver {
    public static void main(String args[]) {
        ChapterOne chapterOne = new ChapterOne();
        System.out.println(chapterOne.stringCompression("matthew nuval"));

        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        System.out.println("Before: ");
        chapterOne.printMatrix(matrix);

        chapterOne.rotateMatrix(matrix);
        System.out.println("After: ");
        chapterOne.printMatrix(matrix);

        int matrix2[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,0,12},
                {13,14,15,16}};
        System.out.println("Before: ");
        chapterOne.printMatrix(matrix2);


    }

}
