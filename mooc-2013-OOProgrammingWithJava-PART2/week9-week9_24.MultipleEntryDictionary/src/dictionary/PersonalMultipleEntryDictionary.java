package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> wordsTranslated;

    public PersonalMultipleEntryDictionary(){
        this.wordsTranslated = new HashMap<String, Set<String>>();
    }

    public void add(String word, String entry){
        if (!this.wordsTranslated.containsKey(word)){
            this.wordsTranslated.put(word, new HashSet<String>());
        }
        Set<String> trans = this.wordsTranslated.get(word);
        trans.add(entry);
    }

    public Set<String> translate(String word){
        return wordsTranslated.get(word);
    }

    public void remove(String word){
        wordsTranslated.remove(word);
    }
}
