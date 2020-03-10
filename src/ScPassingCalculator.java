public class ScPassingCalculator implements PassingCalculator{
    public boolean calculateKindergartenPassing(Score score) {
        return score.getReadingScore() > 70 && score.getMathScore() > 75;
    }
}
