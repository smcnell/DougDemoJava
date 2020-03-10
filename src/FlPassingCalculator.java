public class FlPassingCalculator implements PassingCalculator{

    public boolean calculateKindergartenPassing(Score score) {
        System.out.println("Florida");
        return score.getReadingScore() > 75 && score.getMathScore() > 75;
    }
}