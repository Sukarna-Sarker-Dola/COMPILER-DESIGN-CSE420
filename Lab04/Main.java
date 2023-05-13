import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.*;
class Main {
  public static void main(String[]args) {
    try{
      Scanner sc = new Scanner(new File("E:\\CSE420\\lab\\19301201_SukarnaSarker_SECTION-02_LAB-04\\input.txt"));
      List<String> convertedarray = new ArrayList<>() ;
      while (sc.hasNextLine()) {
        convertedarray.add((sc.nextLine())) ;
      }
      Object[] objects = convertedarray.toArray();
      for(int i=0;i<objects.length;i++)
      {     
        String pattern="(public\\s*|private\\s*)?(static\\s*)?(void|int|char|string)\\s*(([a-z]|[A-Z])|([a-z]|[0-9]))+\\s*[(]((int|String|char)\\s*(([a-z]|[A-Z])|([a-z]|[0-9]))+[,]*\\s*)*[)]\\s*[{]*";
        Object li=objects[i];
        String linee =li.toString();
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(linee);  
        if(m.find())
        {
          Object method=objects[i]; 
          String s1 = method.toString();
          
          String p1 = "((([a-z]|[A-Z])|([a-z]|[0-9]))+\\s*[(]((int|String|char)\\s*(([a-z]|[A-Z])|([a-z]|[0-9]))+[,]*\\s*)*[)]\\s*[{]*)";
          Pattern roo = Pattern.compile(p1);
          Matcher m1 = roo.matcher(s1);  
          m1.find();
                  
          String p2 = "((void|int|char|string))";
          Pattern ro = Pattern.compile(p2);
          Matcher m2 = ro.matcher(s1);  
          m2.find();
          
          System.out.println(m1.group()+","+"return type: "+m2.group()); 
        }
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}


