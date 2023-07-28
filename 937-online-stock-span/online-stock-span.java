import java.util.ArrayList;
import java.util.Stack;

class StockSpanner {

    private class Pair {
        int number;
        int index;

        public Pair(int f, int s) {
            this.number = f;
            this.index = s;
        }
    }

    private int[] finalAnswer;

    public StockSpanner() {
        this.finalAnswer = new int[0];
    }

    public int next(int price) {
        int span = 1;
        for (int i = finalAnswer.length - 1; i >= 0; i--) {
            if (finalAnswer[i] <= price) {
                span += 1;
            } else {
                break;
            }
        }

        // Update the finalAnswer array
        int[] updatedFinalAnswer = new int[finalAnswer.length + 1];
        System.arraycopy(finalAnswer, 0, updatedFinalAnswer, 0, finalAnswer.length);
        updatedFinalAnswer[finalAnswer.length] = price;
        finalAnswer = updatedFinalAnswer;

        return span;
    }
}
