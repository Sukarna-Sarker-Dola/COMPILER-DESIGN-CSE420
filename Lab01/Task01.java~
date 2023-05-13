import java.io.File;
import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("E:\\CSE420\\lab\\19301201_Sukarnasarker_SECTION-02_LAB-01\\input.txt"));
            HashSet<String> tokenSet = new HashSet<String>();
            String[] split;
            String line = sc.nextLine();
            while(sc.hasNextLine()) {

                split = line.split(" ");
                tokenSet.addAll(Arrays.asList(split));
                line = sc.nextLine();
            }
            //KEYWORD
            List<String> secondList=new ArrayList<String>(Arrays.asList("int","var", "float", "if", "else","String"));  
            //returns the common elements in both list  
            secondList.retainAll(tokenSet);
            Object[] objects = secondList.toArray();  
            // Printing array of objects
            System.out.print("Keywords: ");
            int c=0;
          for (Object obj : objects) {
              if (c>0){
            System.out.print(","); 
            }
              System.out.print(obj);
              c++;
          }
            System.out.println();
            //IDENTIFIERS
            List<String> thirdList=new ArrayList<String>(Arrays.asList("a","b", "c", "d", "e","f","g","h","i"));  
            //returns the common elements in both list  
            thirdList.retainAll(tokenSet);
            Object[] objec = thirdList.toArray();  
            // Printing array of objects
            System.out.print("Identifiers: ");
            int co=0;
          for (Object obj : objec) {
              if (co>0){
            System.out.print(","); 
            }
              System.out.print(obj);
              co++;
          }
            System.out.println();
            //MATH OPERATORS
            List<String> fourthList=new ArrayList<String>(Arrays.asList("+","-", "*", "/","=",":"));  
            //returns the common elements in both list  
            fourthList.retainAll(tokenSet);
            Object[] obje = fourthList.toArray();  
            // Printing array of objects
            System.out.print("Math Operators: ");
            int cou=0;
          for (Object obj : obje) {
              if (cou>0){
            System.out.print(","); 
            }
              System.out.print(obj);
              cou++;
          } 
            System.out.println();
            //LOGICAL OPERATORS
            List<String> fifthList=new ArrayList<String>(Arrays.asList(">","<"));  
            //returns the common elements in both list  
            fifthList.retainAll(tokenSet);
            Object[] ob = fifthList.toArray();  
            // Printing array of objects
            System.out.print("Logical Operators: ");
            int coun=0;
          for (Object obj : ob) {
              if (coun>0){
            System.out.print(","); 
            }
              System.out.print(obj);
              coun++;
          }
            System.out.println();
             //NUMERICAL VALUES
            List<String> sixthList=new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","0.0","1.0","2.0","3.0","4.0","5.0","6.0","7.0","8.0","9.0"));  
            //returns the common elements in both list  
            sixthList.retainAll(tokenSet);
            Object[] o = sixthList.toArray();  
            // Printing array of objects
            System.out.print("Numerical Values: ");
            int count=0;
          for (Object obj : o) {
            if (count>0){
            System.out.print(","); 
            }
            System.out.print(obj);
            count++;
          }
            System.out.println();
            //OTHERS
            List<String> seventhList=new ArrayList<String>(Arrays.asList(",",";","(",")","{","}","[","]","."));  
            //returns the common elements in both list  
            seventhList.retainAll(tokenSet);
            Object[] oj = seventhList.toArray();  
            // Printing array of objects
            System.out.print("Others: ");
            for (Object obj : oj)
            System.out.print(obj);        
            System.out.println();
            }
        catch(Exception e){
           e.printStackTrace();
        }
         
    }
}
