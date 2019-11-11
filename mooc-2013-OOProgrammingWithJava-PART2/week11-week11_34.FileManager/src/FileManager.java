
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private List<String> result;

    public List<String> read(String file) throws FileNotFoundException {
        result = new ArrayList<String>();
        File src = new File(file);
        Scanner reader = new Scanner(src);
        while(reader.hasNextLine()){
            String next = reader.nextLine();
            result.add(next);
        }
        return result;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.flush();
        for(String titties : texts){
            writer.write(titties + "\n");
        }
        writer.close();
    }

}