import java.util.HashMap;

public class Scores {
    public static HashMap<Integer, Integer> scores = new HashMap<>();
    public static int attemptNumber = 1;

    public static void addScore(int score) {
        scores.put(attemptNumber, score);
        attemptNumber++;
    }

    public static Integer returnScoreValue(int attempt) {
        return scores.get(attempt); 
    }
}
