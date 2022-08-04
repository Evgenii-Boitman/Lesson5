import java.util.Random;

public class Main {
//Не удалось сделать массив для символов
    //не удалось сделать каждое третье число double
    //не удалось сделать число длиной в семь знаков


    public static void main(String[] args) {
//Массив для чисел
        String[][] arrNum = new String[10][10];
        //int max, min;
        Random randNum = new Random();
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = 0; j < arrNum[i].length; j++) {
                arrNum[i][j] = String.valueOf(randNum.nextDouble(9));
            }
        }
        for (int i = 0; i < arrNum.length; i++) {
            int j;
            for (j = 0; j < arrNum[i].length; j++) {
                System.out.print(arrNum[i][j] + " ");
            }
            System.out.println();
        }
//Массив для символов не получился
        String[][] arrStr = new String[10][10];
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        //int targetStringLength = 7;
        Random randStr = new Random();
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = String.valueOf((int) (Math.random() * 9));
            }
        }
        for (int i = 0; i < arrStr.length; i++) {
            int j;
            for (j = 0; j < arrStr[i].length; j++) {
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println();
        }
        //Главная диагональ
        for (int i = 0; i < (Math.min(arrNum[0].length, arrNum.length)); i++) {
            System.out.println(Math.round(Float.parseFloat(arrNum[i][i]))+ " ");
        }
        //Побочная диагональ
        System.out.println();
        for (int i = 0; i < (Math.min(arrNum[0].length, arrNum.length)); i++) {
            System.out.println(Math.round(Float.parseFloat(arrNum[i][arrNum[0].length - i - 1])) + " ");
        }
        System.out.println();
        //Главная диагональ
        for (int i = 0; i < (Math.min(arrStr[0].length, arrStr.length)); i++) {
            System.out.println(arrStr[i][i] + " ");
        }
        System.out.println();
        //Побочная диагональ
        for (int i = 0; i < (Math.min(arrStr[0].length, arrStr.length)); i++) {
            System.out.println(arrStr[i][arrStr[0].length - i - 1] + " ");
        }


    }

}
