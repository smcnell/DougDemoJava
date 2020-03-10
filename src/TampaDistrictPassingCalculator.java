public class TampaDistrictPassingCalculator extends FlPassingCalculator{
    public boolean isStudentAtRisk(Score score) {
        return score.getAlphabetScore() < 60;
    }

    public boolean calculateKindergartenPassing(Score score) {
        return super.calculateKindergartenPassing(score) && score.getAlphabetScore() > 75;
    }
}
