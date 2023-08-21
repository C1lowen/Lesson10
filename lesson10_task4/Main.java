package lesson10_task4;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CreateASCII ascii = new CreateASCII();

        Map<Character, String> map = ascii.getMap();

        String str= "abcdefghijklmnopqrstuvwxyz";

        for(char ch : str.toCharArray()){
            ch = Character.toLowerCase(ch);
            System.out.println(map.get(ch));
        }
    }
}
