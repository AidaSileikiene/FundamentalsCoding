package example2;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 0, 5};

        AverageCalculator average = new AverageCalculator();

        System.out.println(average.calculateAverage(numbers));

    }
}
