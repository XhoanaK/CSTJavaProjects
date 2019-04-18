package project7cls;

import java.util.*;
import java.io.*;

public class CountKeywordswithMap {
  public static void main(String[] args) throws Exception {  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Java source file: ");
    String filename = input.nextLine();

    File file = new File(filename);
    if (file.exists()) {
      System.out.println("The number of keywords in " + filename 
        + " is " + countKeywords(file));
    }
    else {
      System.out.println("File " + filename + " does not exist");
    }    
    input.close();
    
  }

  public static int countKeywords(File file) throws Exception {  
    // Array of all Java keywords + true, false and null
    String[] keywordString = {"abstract", "assert", "boolean", 
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "enum",
        "extends", "for", "final","finally", "float", "goto",
        "if", "implements", "import", "instanceof", "int", 
        "interface", "long", "native", "new", "package", "private",
        "protected", "public", "return", "short", "static", 
        "strictfp", "super", "switch", "synchronized", "this",
        "throw", "throws", "transient", "try", "void", "volatile",
        "while", "true", "false", "null"};

    Set<String> keywordSet = 
      new HashSet<String>(Arrays.asList(keywordString));
    int count = 0;    

    Map<String, Integer> keywordMap = new TreeMap<String, Integer>();
    
    Scanner input = new Scanner(file);
	
    String text = "";
    //Add all lines into one text.
	while (input.hasNext()) {
		String line = input.nextLine();
		text += line + " ";
	}

	String[] tokens = text.split("[ \"\t]");
	for (String token : tokens) {
		if (keywordSet.contains(token))
			if (keywordMap.get(token) == null) {
				keywordMap.put(token, 1);
				count++;
			} else {
				int value = keywordMap.get(token);
				value++;
				keywordMap.put(token, value);
				count++;
			}
	}	
	
	System.out.println(keywordMap);
	System.out.println("Total count:" + count);
    return count;
  }
}