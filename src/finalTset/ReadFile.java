package finalTset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private String fileName;

    public ReadFile(String fileName){
        this.fileName= fileName;
    }

    public ArrayList<String> readLines(){
        try{
            BufferedReader f = new BufferedReader(new FileReader(fileName));
            String line = f.readLine();
            ArrayList<String> arr = new ArrayList<String>();
            while (line != null){
                arr.add(line);
                line = f.readLine();
            }
            return arr;
        }catch(IOException e){
            System.out.println("ERROR");
        }
        return null;
    }

}
