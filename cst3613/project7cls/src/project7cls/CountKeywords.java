package project7cls;

import java.io.File;

import java.util.*;


public class CountKeywords {
  public static void main(String[] args) throws Exception {  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Java source file: ");
    String filename = input.nextLine();

    File file = new File(filename);
    if (!file.isFile()) {
      System.out.println("File " + filename + " does not exist");
    } 
    String [] keywordString  = {"abstract", "assert", "boolean", 
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum",
            "extends", "for", "final","finally", "float", "goto",
            "if", "implements", "import", "instanceof", "int", 
            "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", 
            "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile",
            "while", "true", "false", "null"};

Map <String, Integer> map = new TreeMap<>();
for (String word1 : keywordString) {
    String key = word1.toLowerCase();
    if (key.length() > 0) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            int value = map.get(key);
            value++;
            map.put(key, value);
        }
    }
}
Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

for (Map.Entry<String, Integer> entry: entrySet)
    System.out.println(entry.getKey() + "\t" + entry.getValue());
  }
}