import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

//    public static double positionCalc(double gravity, double initialVelocity, double
//            initialPosition, double fallingTime){
//       // x(t) = 0.5 × a*t^2 + v_0*t + x_0
//
//        double x = 0;
//
//        x = 0.5 *  (gravity * Math.pow(fallingTime, 2)) + initialVelocity * fallingTime + initialPosition;
//
//        return x;
//    };

   public static int factorialForLoop(int N){

       if(N == 0){
           return 1;
       }
      int sum1 = 1;
         for(int x = 1; x  < N+1; x++){

            sum1 = sum1 * x;
          }
      return sum1;
   };

    public static double[] generateArray(int N, double lower, double upper) {
        Random rand = new Random();

        if (lower > upper) {
            double[] array = new double[]{};
            return array;
        }

        if (upper > lower) {
            double[] array = new double[N + 1];
            for (int x = 0; x <= N; x++) {
                double randomNumber = rand.nextDouble(upper - lower + 1) + lower;
                array[x] = randomNumber;

            }
            return array;
        }
        return new double[]{1};
    };

    public static double getMean(double[] array){
        double sum = 0;
        for(int x = 0; x < array.length;x++){
            sum = array[x] + sum;
        }
        sum = sum / array.length;

        return sum;
    }

    public static double getMin(double[] array){
        double maz = array[0];
        for(int x = 0; x < array.length; x++){
            if(array[x] < maz){
                maz = array[x];
            }
        }
        return maz;
    };

    public static double getMax(double[] array){
        double maz = array[0];
        for(int x = 0; x < array.length; x++){
            if(array[x] > maz){
                maz = array[x];
            }
        }
        return maz;
    };

    public static double[][] generateMatrix(int N){
        Random rand = new Random();
        double[][] array = new double[N][N];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextDouble(100);
            }
        }
        return array;
    };

    public static double getProduct(double[][] matrix, int row, int col) {
        double product = 1.0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == row && j == col) {
                    product *= matrix[i][j];
                }
            }
        }
        return product;
    }

    public static int[] coinFlip(int N){
        Random rand = new Random();
        int[] array = new int[N];
        int[] array1 = new int[N];
        int sum0 = 0;
        int sum1 = 0;
        for(int x = 0; x < N;x++){
            array[x] = rand.nextInt(2);

            if(array[x] == 0){
                sum0 = 1 + sum0;
            }
            else{
                sum1 = 1 + sum1;
            }
        }

        int summa = 0;
        summa = sum0/ sum1;
        array1[0] = sum0;
        array1[1] = sum1;
        array1[2] = summa;

        return array1;
    };

    public static int[] dice(int N){
        Random rand = new Random();
        int[] array = new int[6];
        int dice = 0;
        for(int x = 0; x < N; x++){
            dice = rand.nextInt(6) + 1;
            switch(dice){
                case 1:
                    array[0] = array[0] + 1;
                    break;
                case 2:
                    array[1] = array[1] + 1;
                    break;
                case 3:
                    array[2] = array[2] + 1;
                    break;
                case 4:
                    array[3] = array[3] + 1;
                    break;
                case 5:
                    array[4] = array[4] + 1;
                    break;
                case 6:
                    array[5] = array[5] + 1;
                    break;
            }

        }
    return array;
    };

    public static String getTextFromBytes(byte[] array){

        return new String(array);
    };

   public static String pascalsTriangle(int level){

       int[] array = new int[level+1];

       for(int i = 1; i < level+1; i++){
           array[i]= factorialForLoop(level)/(factorialForLoop(i)) * (factorialForLoop(level - i));

       }

       return Arrays.toString(array);
    };


    public static void main(String[] args) {

//        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
//                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
//                "Kate" };
//        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
//                299, 343, 317, 265 };
//
//        for(int x = 0; x < names.length; x++){
//            System.out.println("row " + x + " "+ names[x] +  " " + times[x]);
//
//        }


//        double gravity = -9.81; // Earth's gravity in m/s^2
//        double initialVelocity = 0.0;
//        double fallingTime = 10.0;
//        double initialPosition = 0.0;
//        double finalPosition = 0.0;
//        double x = positionCalc(gravity,initialVelocity,initialPosition,fallingTime);
//        System.out.println("Pos in "+fallingTime+"sec :"+ x);

        int x = factorialForLoop(10);
         System.out.println(x);
//
//        double[] array = generateArray(5, 1, 6);
//
//        System.out.println(Arrays.toString(array));
//
//        double x = getMean(array);
//        System.out.println(x);
//
//        double y = getMin(array);
//
//        System.out.println(y);
//
//        double z = getMax(array);
//
//        System.out.println(z);


//
//        double[][] array = generateMatrix(5);
//
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length ;j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//
//        double x = getProduct(array,4,3);
//
//        System.out.println(x);
//
//
//         int[] array = coinFlip(100);
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);


//            int[] array = dice(100);
//
//        System.out.println(Arrays.toString(array));ss
//

        byte[] array = new byte[]{72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
                32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};


        String y = getTextFromBytes(array);
        System.out.println(y);

        String level = pascalsTriangle(6);


        System.out.println(level);

    }
}


