package SE.EC.Johan.NameGenerator.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NameReader {
    public List<String> pojkNamn() {

        List<String> pojkNamn = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("Pojknamn.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                pojkNamn.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pojkNamn;
    }

    public List<String> flickNamn() {

        List<String> flickNamn = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("Flicknamn.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                flickNamn.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flickNamn;
    }

    public List<String> efterNamn() {

        List<String> efterNamn = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("Efternamn.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                efterNamn.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return efterNamn;
    }
}
