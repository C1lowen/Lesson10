package lesson10_task3;

import java.awt.*;
import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map= new HashMap<>();
        Random rn = new Random();
        addElementsList(list, rn);
        System.out.println(list);
        searchElements(list, map);
        for(Integer key : map.keySet()){
            System.out.println(key +" ==> " + map.get(key));
        }
    }


    private static void addElementsList(List<Integer> list, Random rn){
        for(int i = 0; i < 10; i++){
            list.add(rn.nextInt(5));
        }
    }

    private static void searchElements(List<Integer> list, Map<Integer,Integer> map){
        for(Integer key : list){
            Integer value = map.get(key);
            if(value == null){
                map.put(key, 1);
            }else{
                map.put(key, value+1);
            }
        }
    }
}
