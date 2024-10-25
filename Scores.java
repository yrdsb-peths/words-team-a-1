import java.util.HashMap;

public class Scores{
    public HashMap<Integer, Integer> scores = new HashMap<>();
    private int attemptNumber = 1;

    public void addScore(int score){
        scores.put(attemptNumber, score);
        attemptNumber++;
    }

    public HashMap<Integer, Integer> returnScores(){
        return scores;
    }

}