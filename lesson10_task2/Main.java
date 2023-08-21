package lesson10_task2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mapResult = new HashMap<>();
        mapResult.put("hello", "привет");
        mapResult.put("world", "мир");

        GlossaryAdditions.addWords(mapResult);

        File fileReader = new File("D:\\File\\English.txt");
        File fileWriter = new File("D:\\File\\Ukranian.txt");
        ReadAndWriteFile.readFile(mapResult, fileReader, fileWriter);
    }
}
