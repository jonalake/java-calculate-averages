import java.util.Arrays;

public class App {
  public static void main(String args[]) {
    double[] testScores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
    Arrays.sort(testScores);
    double median = (testScores[4] + testScores[5]) / 2;
    System.out.println(median);

    double total = 0;
    for (byte i = 0; i < testScores.length; i++) {
      total = total + testScores[i];
    }
    double mean = total / testScores.length;
    System.out.println(mean);

    double high = testScores[9];
    System.out.println(high);

    double low = testScores[0];
    System.out.println(low);
  }
}
