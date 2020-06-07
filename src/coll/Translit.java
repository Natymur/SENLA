package coll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Translit {
    private static final Map<String, String> letters = new HashMap<>();
    static {

        letters.put("а", "a");
        letters.put("б", "b");
        letters.put("в", "v");
        letters.put("г", "g");
        letters.put("д", "d");
        letters.put("е", "e");
        letters.put("ё", "e");
        letters.put("ж", "zh");
        letters.put("з", "z");
        letters.put("и", "i");
        letters.put("й", "i");
        letters.put("к", "k");
        letters.put("л", "l");
        letters.put("м", "m");
        letters.put("н", "n");
        letters.put("о", "o");
        letters.put("п", "p");
        letters.put("р", "r");
        letters.put("с", "s");
        letters.put("т", "t");
        letters.put("у", "u");
        letters.put("ф", "f");
        letters.put("х", "h");
        letters.put("ц", "c");
        letters.put("ч", "ch");
        letters.put("ш", "sh");
        letters.put("щ", "sch");
        letters.put("ъ", "'");
        letters.put("ы", "y");
        letters.put("ъ", "'");
        letters.put("э", "e");
        letters.put("ю", "yu");
        letters.put("я", "ya");
    }



    public static ArrayList<String> toLatin(String text) {
        ArrayList<String> list = new ArrayList<>();



            for (int i = 0; i < text.length(); i++) {
                String l = text.substring(i, i + 1);
                if (isUpper(l)) {
                    l = l.toLowerCase();
                    if (letters.containsKey(l)) {
                        list.add(letters.get(l).toUpperCase());
                    } else {
                        list.add(l);
                    }
                } else {
                    if (letters.containsKey(l)) {
                        list.add(letters.get(l));
                    } else {
                        list.add(l);
                    }
                }

            }

        return list;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        for (String s : toLatin(text)) {
            System.out.print(s);
        }

    }

    static boolean isUpper(String ch) {
        char[] c = ch.toCharArray();
            if(Character.isLowerCase(c[0])) {
                return false;
            }
        return true;
        }



}
