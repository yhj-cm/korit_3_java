package ch09_classes;

public class ScoreCalc {

    public double addScores(double totalscore, double addedScore) {
        return totalscore + addedScore;
    }

    public double calculateAvg(double totalscore, int numberOfsubjects){
        return totalscore / numberOfsubjects;
    }
}
