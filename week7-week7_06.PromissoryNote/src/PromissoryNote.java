import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> newLoan;

    public PromissoryNote() {
        this.newLoan = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.newLoan.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if(!(this.newLoan.containsKey(whose))) {
            return 0;
        }
        return this.newLoan.get(whose);
    }
}
