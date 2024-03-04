public class Main {
    public static double productOfArraysElements(double[] array){       //The method that calculates the product
        double result = 1;
        for (double element : array){
            result *= element;
        }
        return result;
    }
    public static void main(String[] args) {
        double[] array = new double[10];
        System.out.print("Your array: ");
        for (int i = 0; i < array.length; i++){
            array[i]=20*Math.random() - 10;              //number generation from -10 to 10
            System.out.print(array[i]+ " ");
        }
        System.out.println("Result: " + productOfArraysElements(array));
    }
}