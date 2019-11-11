import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String,Double> debts;

    public PromissoryNote() {
        debts = new HashMap<String,Double>();
    }

    public void setLoan(String toWhom, double value){
        this.debts.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose){
        if(this.debts.containsKey(whose)){
            return this.debts.get(whose);
        }
        return 0;
    }
}
