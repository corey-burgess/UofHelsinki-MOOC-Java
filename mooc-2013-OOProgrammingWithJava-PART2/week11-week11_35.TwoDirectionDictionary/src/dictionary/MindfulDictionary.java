package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> finnishToEnglish;
    private Map<String, String> englishToFinnish;
    private File file;

    public MindfulDictionary() {
        this.finnishToEnglish = new HashMap<String, String>();
        this.englishToFinnish = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws FileNotFoundException {
        this();
        this.file = new File(file);
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] words = line.split(":");
                add(words[0], words[1]);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(file);

            for (String word : finnishToEnglish.keySet()) {
                writer.write(word + ":" + finnishToEnglish.get(word) + "\n");
            }

            writer.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public void add(String word, String translation) {
        if (!finnishToEnglish.containsKey(word)) {
            finnishToEnglish.put(word, translation);
            englishToFinnish.put(translation, word);
        }
    }

    public String translate(String word) {
        if (finnishToEnglish.containsKey(word)) {
            return finnishToEnglish.get(word);
        }

        if (englishToFinnish.containsKey(word)) {
            return englishToFinnish.get(word);
        }

        return null;
    }

    public void remove(String word) {
        if (finnishToEnglish.containsKey(word)) {
            String translation = finnishToEnglish.get(word);
            finnishToEnglish.remove(word);
            englishToFinnish.remove(translation);
        } else if (englishToFinnish.containsKey(word)) {
            String translation = englishToFinnish.get(word);
            englishToFinnish.remove(word);
            finnishToEnglish.remove(translation);
        }
    }
}