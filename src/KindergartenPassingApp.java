import java.util.Arrays;
import java.util.List;

public class KindergartenPassingApp {
    public static void main(String[] args) {

        Score score = new Score();
        score.setMathScore(90);
        score.setReadingScore(80);
        score.setAlphabetScore(50);

        TampaDistrictPassingCalculator tampaDistrictPassingCalculator = new TampaDistrictPassingCalculator();
        tampaDistrictPassingCalculator.isStudentAtRisk(score);
        tampaDistrictPassingCalculator.calculateKindergartenPassing(score);


        List<String> nameList = Arrays.asList("doug", "dorrian", "darian", "alex");
        nameList
                .stream()
                .filter(n -> n.startsWith("d"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
