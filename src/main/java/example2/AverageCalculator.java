package example2;

public class AverageCalculator {


    double calculateAverage(int[] numbers) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            }
            sum += numbers[1];
            count++;
        }
        return sum / count;
    }
}
