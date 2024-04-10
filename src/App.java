import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        int[][] correct = new int[answers.length][2];

        for(int i=0; i<answers.length; i++){
            for (int j = 0; j<answers[i].length; j++){
                if (answers[i][j] == keys[j]) {
                    correct[i][0] = i;
                    correct[i][1]++;
                }
            }
            
        }

        Arrays.sort(correct, Comparator.comparingInt(a -> a[1]));
        for(int i = 0; i < correct.length; i++){
            System.out.println("Student " + correct[i][0] + "'s correct count is " + correct[i][1]);
        }
        
    }

    
}
