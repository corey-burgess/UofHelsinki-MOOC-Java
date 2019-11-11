package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;

    public WordInspection(File file){
        this.file = file;
    }

    public int wordCount() throws Exception{
        Scanner reader = new Scanner(this.file);
        int i = 0;
        while(reader.hasNext()){
            reader.next();
            i++;
        }
        return i;
    }

    public List<String> wordsContainingZ() throws Exception{
        List<String> zWords = new ArrayList<String>();
        Scanner reader = new Scanner(this.file);

        while(reader.hasNext()){
            String nextLine = reader.next();

            if(nextLine.contains("z")){
                zWords.add(nextLine);

            }
        }
        return zWords;
    }

    public List<String> wordsEndingInL() throws Exception{
        List<String> endingL = new ArrayList<String>();
        Scanner reader = new Scanner(this.file);

        while(reader.hasNext()){
            String nextLine = reader.next();

            if(nextLine.endsWith("l")){
                endingL.add(nextLine);
            }
        }
        return endingL;
    }

    public List<String> palindromes() throws Exception{
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();
            int front = 0;
            int back = word.length() - 1;
            boolean isPalindrome = true;

            while (front < back) {
                if (word.charAt(front) != word.charAt(back)) {
                    isPalindrome = false;
                    break;
                }
                front++;
                back--;
            }

            if (isPalindrome) {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception{
        List<String> vow = new ArrayList<String>();
        Scanner reader = new Scanner(this.file);

        while(reader.hasNext()){
            String nextLine = reader.next();
            if (nextLine.contains("a") && nextLine.contains("e") && nextLine.contains("i") && nextLine.contains("o") && nextLine.contains("u") && nextLine.contains("y") && nextLine.contains("ä") && nextLine.contains("ö")){
                vow.add(nextLine);
            }
        }
        return vow;
    }
}
