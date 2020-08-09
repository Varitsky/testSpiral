import java.lang.reflect.Array;

public class Spiral {
    public static int height = 4;
    public static int width = 4;

    public static void main(String[] args) {

        /**
         * Мы проверяем занята ли ячейка, если пустая - пишем число,
         * если она занята - смещаемся по диагонали на пустую ячейку
         * и переходим к другому циклу
         */
        int[][] array = new int[width][height];


        int i = 0; //Y
        int j = 0; //X
        int number = 1;

        while (number <= (width*height)) {

            while (j < height) { // идём вправо X
                if (array[i][j]==0) {
                    array[i][j] = number;
                    number++;
                    if (j < (height-1)) {
                        j++;
                    } else {
                        i++;
                        break;
                    }
                } else {
                    j--;
                    i++;
                    break;
                }
            }

            while (i < width) { // идём вниз Y
                if (array[i][j]==0) {
                    array[i][j] = number;
                    number++;
                    if (i < (width-1)) {
                        i++;
                    } else {
                        j--;
                        break;
                    }
                } else {
                    i--;
                    j--;
                    break;
                }
            }

            while (j >= 0) { // идём влево X
                if (array[i][j]==0) {
                array[i][j] = number;
                number++;
                    if (j > 0) {
                        j--;
                    } else {
                        i--;
                        break;
                    }
                } else {
                    j++;
                    i--;
                    break;
                }
            }

            while (i >= 0) { // идём вверх Y
                if (array[i][j]==0) {
                    array[i][j] = number;
                    number++;
                    if (i>0) {
                        i--;
                    } else {
                        j++;
                        break;
                    }
                } else {
                    i++;
                    j++;
                    break;
                }
            }
        }
        printArray(array);

    }

    public static void printArray(int[][] array){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
    }
}
