import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        
        System.out.println("<< ArrayList >>"); // ArrayList
        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);

        System.out.println("<< HashSet >>"); // HashSet
        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("123");
        System.out.println(hSet);

        System.out.println("<< TreeSet >>"); // TreeSet
        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        System.out.println(sSet);

        System.out.println("<< Stack >>"); // Stack
        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        stacko.push("d");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);

        System.out.println("<< HashMap >>"); // HashMap
        Map<String, Color> favColorHash = new HashMap<String, Color>();
        favColorHash.put("Bob", Color.blue);
        favColorHash.put("Garry", Color.red);
        favColorHash.put("Jane", Color.blue);
        favColorHash.put("Olivia", Color.green);
        Set<String> keySetHash = favColorHash.keySet();
        for(String key : keySetHash){
            Color value = favColorHash.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("<< TreeMap >>"); // TreeMap
        Map<String, Color> favColorTree = new TreeMap<String, Color>();
        favColorTree.put("Bob", Color.blue);
        favColorTree.put("Garry", Color.red);
        favColorTree.put("Jane", Color.blue);
        favColorTree.put("Olivia", Color.green);
        Set<String> keySetTree = favColorTree.keySet();
        for(String key : keySetTree){
            Color value = favColorTree.get(key);
            System.out.println(key + " : " + value);
        }

        
    }
}
