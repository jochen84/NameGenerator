package SE.EC.Johan.NameGenerator.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NameService {

    private static List<String> pojkNamn;
    private static List<String> flickNamn;
    private static List<String> efterNamn;

    public NameService() {
        pojkNamn = new ArrayList<>();
        flickNamn = new ArrayList<>();
        efterNamn = new ArrayList<>();
    }


}