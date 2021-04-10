package com.company;

import java.util.*;

public class Main {

    public static String getPrefix (String[] array){
        //your code here
        return null;
    }

    public static boolean hasRepetition(int[] array){
        //your code here
        return true;
    }
    public static void main(String[] args) {
	int[] array = { 1 , 9 , 6 , 35 , 56 , 7 , 1};
	String [] array2 = {"abc" , "abcd" , "abcde" , "aba" };
        System.out.println(hasRepetition(array));
        System.out.println("______Collections_______");
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1 , 23 , 54 , 765 , 976 , 3424 , 534 , 53 , 5 , 1347)
        );

        System.out.println(list);
        System.out.println(array);
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");

            }
            else {
                System.out.print(array [i]);
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.println(Arrays.toString(array));
        List<String> greetings = new ArrayList<>(
                Arrays.asList("hi" , "hello" , "good morning" , "good evening" , "sup")
        );
        greetings.add("привет");
        greetings.add("здоров");
        greetings.add("buna ziua");
        greetings.add("noroc");
        greetings.add("czesc");
        greetings.add(2 , "shalom");
        greetings.remove(1);
        greetings.remove("sup");
        System.out.println(greetings.get(5));
        greetings.stream().filter(item -> item.contains("good"))
                .forEach(System.out::println);
        System.out.println(greetings);
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("abd");
        set.add("abe");
        System.out.println(set);
        Map<String , Integer> map = new HashMap<>();
        map.put("Artem" , 8);
        map.put("Sasha" , 9);
        map.put("David" , 8);
        map.put("Max" , 3);
        map.put("Denis" , 7);
        map.put("Denis" , 0);
        System.out.println(map);
        System.out.println(map);
    }
}
