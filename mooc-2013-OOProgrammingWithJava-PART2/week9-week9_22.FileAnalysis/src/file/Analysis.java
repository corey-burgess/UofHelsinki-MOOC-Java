package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File f;

    public Analysis(File file){
        this.f=file;
    }

    public int lines() throws Exception{
        Scanner reader = new Scanner(this.f, "UTF-8");
        int i = 0;
        while (reader.hasNext()){
            i++;
            reader.nextLine();
        }
        return i;
    }

    public int characters() throws Exception{
        Scanner reader = new Scanner(this.f, "UTF-8");
        int i = 0;
        while (reader.hasNext()){
            String line = reader.nextLine();
            i += line.length() + 1;
        }
        return i;
    }

}
