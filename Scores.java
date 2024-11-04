import java.util.HashMap;

public class Scores {
    private static HashMap<Integer, Integer> scores = new HashMap<>();

    public static void addScore(int score) {
        // Move existing scores down by one rank everytime you add a score
        for (int i = 6; i > 1; i--) {
            scores.put(i, scores.get(i - 1));
        }

        // Add new score at the top (rank 1)
        scores.put(1, score);

    }

    public static Integer returnScoreValue(int attempt) {
        return scores.get(attempt);
    }
}
