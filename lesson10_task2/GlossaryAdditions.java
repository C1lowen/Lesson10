package lesson10_task2;

import java.util.Map;
import java.util.Scanner;

public class GlossaryAdditions {

    public static <K, V> void addWords(Map<K,V> map){
        Scanner sc = new Scanner(System.in);
        System.out.println("Если захотите выйти введите 'q' в двух строках!");
        while(true) {
            System.out.print("Введите слово на английском: ");
            K english = (K) sc.nextLine();
            System.out.print("Введите слово на украинском: ");
            V ukranian = (V) sc.nextLine();

            map.put(english, ukranian);
            if(english.equals("q") || ukranian.equals("q")){
                break;
            }
        }
    }

}
