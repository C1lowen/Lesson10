package lesson10_task4;

import java.util.HashMap;
import java.util.Map;

public class CreateASCII {
    private Map<Character, String> map;

    public CreateASCII() {
        map = new HashMap<>();

        map.put('a', "   __ _ \n" +
                "  / _` |\n" +
                " | (_| |\n" +
                "  \\__,_|");
        map.put('b', "  _     \n" +
                " | |    \n" +
                " | |__  \n" +
                " | '_ \\ \n" +
                " | |_) |\n" +
                " |_.__/ ");
        map.put('c', "   ___ \n" +
                "  / __|\n" +
                " | (__ \n" +
                "  \\___|");
        map.put('d', "     _ \n" +
                "     | |\n" +
                "   __| |\n" +
                "  / _` |\n" +
                " | (_| |\n" +
                "  \\__,_|");
        map.put('e', "   ___ \n" +
                "  / _ \\\n" +
                " |  __/\n" +
                "  \\___|");
        map.put('f', "   __ \n" +
                "  / _|\n" +
                " | |_ \n" +
                " |  _|\n" +
                " | |  \n" +
                " |_|  \n" +
                "      ");
        map.put('g', "   __ _ \n" +
                "  / _` |\n" +
                " | (_| |\n" +
                "  \\__, |\n" +
                "   __/ |\n" +
                "  |___/ ");
        map.put('h', "  _     \n" +
                " | |    \n" +
                " | |__  \n" +
                " | '_ \\ \n" +
                " | | | |\n" +
                " |_| |_|");
        map.put('i', "  _ \n" +
                " (_)\n" +
                "  _ \n" +
                " | |\n" +
                " | |\n" +
                " |_|");
        map.put('j', "    _ \n" +
                "   (_)\n" +
                "    _ \n" +
                "   | |\n" +
                "   | |\n" +
                "   | |\n" +
                "  _/ |\n" +
                " |__/ ");
        map.put('k', "  _    \n" +
                " | |   \n" +
                " | | __\n" +
                " | |/ /\n" +
                " |   < \n" +
                " |_|\\_\\\n" +
                "       ");
        map.put('l', "  _ \n" +
                " | |\n" +
                " | |\n" +
                " | |\n" +
                " | |\n" +
                " |_|\n" +
                "    ");
        map.put('m', "  _ __ ___  \n" +
                " | '_ ` _ \\ \n" +
                " | | | | | |\n" +
                " |_| |_| |_|");
        map.put('n', " _ __  \n" +
                " | '_ \\ \n" +
                " | | | |\n" +
                " |_| |_|");
        map.put('o', "   ___  \n" +
                "  / _ \\ \n" +
                " | (_) |\n" +
                "  \\___/ ");
        map.put('p', "  _ __  \n" +
                " | '_ \\ \n" +
                " | |_) |\n" +
                " | .__/ \n" +
                " | |    \n" +
                " |_|    ");
        map.put('q', "   __ _ \n" +
                "  / _` |\n" +
                " | (_| |\n" +
                "  \\__, |\n" +
                "     | |\n" +
                "     |_|");
        map.put('r', "  _ __ \n" +
                " | '__|\n" +
                " | |   \n" +
                " |_| ");
        map.put('s', "  ___ \n" +
                " / __|\n" +
                " \\__ \\\n" +
                " |___/\n");
        map.put('t', "  _   \n" +
                " | |  \n" +
                " | |_ \n" +
                " | __|\n" +
                " | |_ \n" +
                "  \\__|\n");
        map.put('u', "  _   _ \n" +
                " | | | |\n" +
                " | |_| |\n" +
                "  \\__,_|");
        map.put('v', " __   __\n" +
                " \\ \\ / /\n" +
                "  \\ V / \n" +
                "   \\_/ ");
        map.put('w', " __      __\n" +
                " \\ \\ /\\ / /\n" +
                "  \\ V  V / \n" +
                "   \\_/\\_/  ");
        map.put('x', " __  __\n" +
                " \\ \\/ /\n" +
                "  >  < \n" +
                " /_/\\_\\");
        map.put('y', "  _   _ \n" +
                " | | | |\n" +
                " | |_| |\n" +
                "  \\__, |\n" +
                "   __/ |\n" +
                "  |___/ ");
        map.put('z', "  ____\n" +
                " |_  /\n" +
                "  / / \n" +
                " /___|");
        map.put(' ', "  ");
    }

    public Map<Character, String> getMap() {
        return map;
    }
}
