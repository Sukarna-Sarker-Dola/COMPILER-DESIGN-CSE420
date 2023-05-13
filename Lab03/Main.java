import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.*;
class Main {
    public static void main(String[]args) {
        try{
            Scanner sc = new Scanner(new File("E:\\CSE420\\lab\\19301201_SukarnaSarker_Section-02_Lab-03\\input.txt"));
            List<String> convertedarray = new ArrayList<>() ;
            while (sc.hasNextLine()) {
                convertedarray.add((sc.nextLine())) ;
            }
            Object[] objects = convertedarray.toArray();
            Object num=objects[0];
            String s1 = num.toString();
            int renum=Integer.parseInt(s1);

            for(int j=renum+2;j<objects.length;j++)
            {
                Object li=objects[j];
                String linee =li.toString();
                int count=0;
                for(int i=0;i<renum;i++)
                {
                    Object pa=objects[i+1];
                    String pattern = pa.toString();
                    Pattern r = Pattern.compile(pattern);
                    Matcher m = r.matcher(linee);
                    if(m.find())
                    {
                        int k=i+1;
                        System.out.println("YES,"+k);
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
                if(count==renum) {
                    System.out.println("NO,0");
                }
                else {
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}