package tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> strings;
    private int duplicates;

    public PersonalDuplicateRemover(){
        this.strings = new HashSet<String>();
        this.duplicates = 0;
    }

    public void add(String characterString){
        if(this.strings.contains(characterString)){
            this.duplicates++;
        }
        this.strings.add(characterString);
    }

    public int getNumberOfDetectedDuplicates(){
        return this.duplicates;
    }

    public Set<String> getUniqueCharacterStrings(){
        return this.strings;
    }

    public void empty(){
        this.duplicates = 0;
        this.strings.clear();
    }
}
