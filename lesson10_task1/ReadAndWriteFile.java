package lesson10_task1;

import java.io.*;
import java.util.Map;

public class ReadAndWriteFile {
    public static <K,V>void readFile(Map<K,V> map, File fileRead, File fileWrite){
        try(BufferedReader br = new BufferedReader(new FileReader(fileRead))){
            String[] massiveStr = br.readLine().split("[ ,]");
            String result = translate(massiveStr, map);
            writeFile(result, fileWrite);
        }catch(IOException e){
            e.getStackTrace();
        }
    }

    private static void writeFile(String str, File file){
        try(Writer out = new FileWriter(file)){
           out.write(str);
        }catch(IOException e){
            e.getStackTrace();
        }
    }

    private static <K, V>String translate(String[] massiveStr, Map<K,V> map){
        StringBuilder result = new StringBuilder();
        for(String str : massiveStr){
            V resultStr = map.get(str);
            if(resultStr != null){
                result.append(resultStr + " ");
            }else{
                result.append("Непереводимое(" + str + ") ");
            }
        }
        return result.toString();
    }

}
