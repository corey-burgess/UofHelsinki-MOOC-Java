import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String,String> trans;

    public Dictionary(){
        trans = new HashMap<String,String>();
    }

    public void add(String word, String translation){
        trans.put(word,translation);
    }

    public String translate (String word) {
        return trans.get(word);
    }

    public int amountOfWords(){
        return trans.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : trans.keySet()) {
            translationList.add(key + " = " + trans.get(key));
        }
        return translationList;
    }
}
