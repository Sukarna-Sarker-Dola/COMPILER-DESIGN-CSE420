import java.util.Scanner;
import java.util.*;
import java.io.File;
public class Task01 {
    public static void main(String[]args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int po = num;
        String baka = sc.nextLine() ;
        String ar  []=new String[po];
        for(int i=0;i<po;i++)
        {
            ar[i]=sc.nextLine();
        }
        for(int i=0;i<po;i++)
        {
            char[] ch = ar[i].toCharArray();
            if(emailcheck(ch)){
                System.out.println("Valid email");
            }
            else if(webcheck(ch)){
                System.out.println("Valid web address");
            }
            
        }
    }
    public static boolean emailcheck(char[] ch1){
        boolean boo=true;
        int c=0;
        for(int j=0;j<ch1.length;j++)
        {
            if(ch1[j]=='@')
            {
                c++;
            }
        }
        if(c==1)
        {
        if(ch1[0]=='@'|| ch1[0]=='-'|| ch1[ch1.length - 1]=='@' || ch1[ch1.length-1]=='.')
        {
            boo=false;
        }
        int count=0;
        for(int j=0;j<ch1.length;j++)//@ 2 er shoman or er beshi or nai amon kina
        {
            if(ch1[j]=='@')
            {
                count++;
                if(count>=2 || count==0) {
                    boo=false;
                }
            }
        }
        int counter=0;
        for(int j=0;j<ch1.length;j++)// . koita ase jodi aktao na thake taile invalid
        {
            if(ch1[j]=='.')
            {
                counter++;
            }
        }
        if(counter==0) {
            boo=false;
        }
        for(int i=0,j=1;i<ch1.length && j<ch1.length;i++,j++)//chechikg wether two dots are por por
        {
            if(ch1[i]==ch1[j])
            {
                if(ch1[i]=='.' && ch1[j]=='.')
                {
                    boo=false;
                    break;
                }
            }
        }
        if((int)ch1[0]>=48 && (int)ch1[0]<=57)//cheching wether the first number is a number
        {
            boo=false;
        }
        for(int i=0;i<ch1.length;i++) //email 64 er theke boro hoi na so @ 64 number position a thakar kotha
        {
            if(ch1[i]=='@')
            {
                if(i>64)
                {
                    boo=false;
                }
            }
        }
        for(int i=0;i<ch1.length;i++)//checking wether . er por - ase kina jodi last er ta . na hoi tokhn
        {
            if(ch1[i]=='.')
            {
                if(ch1[ch1.length-1]!='.')
                {
                    if(ch1[i+1]=='-')
                    {
                        boo=false;
                    }
                }
            }
        }
        for(int i=0;i<ch1.length;i++) //. er por atleast akta character thakte hobe as domain 255 ta word er
        {
            if(ch1[i]=='.')
            {
                if(i>256)
                {
                    boo=false;
                }
            }
        }
        }
        else
        {
          boo=false;
        }
        return boo;
    }
    public static boolean webcheck(char[] ch2) {
        boolean foo=true;
        if(((int)ch2[0]==104 && (int)ch2[1]==116 && (int)ch2[2]==116 &&(int)ch2[3]==112 &&  ch2[4]==':' &&ch2[5]=='/' &&  ch2[6]=='/' && (int)ch2[7]==119 && (int)ch2[8]==119 &&(int)ch2[9]==119 && ch2[10]=='.')
                || ((int)ch2[0]==104 && (int)ch2[1]==116 && (int)ch2[2]==116 &&(int)ch2[3]==112 &&(int)ch2[4]==115 && ch2[5]==':' &&  ch2[6]=='/' &&  ch2[7]=='/' && (int)ch2[8]==119 && (int)ch2[9]==119 &&(int)ch2[10]==119 && ch2[11]=='.') 
             || ((int)ch2[0]==119 && (int)ch2[1]==119 &&(int)ch2[2]==119 && ch2[11]=='.'))
        {
            if(ch2[0]!='-'|| ch2[ch2.length-1]!='-' || ch2[0]!=',' )
            {
                if(ch2[ch2.length-1]=='.')//last a . thakle web address invalid
                {
                    foo=false;
                }
                for(int i=0,j=1;i<ch2.length && j<ch2.length;i++,j++)
                {
                    if(ch2[i]==ch2[j]) //por por . ase kina
                    {
                        if(ch2[i]=='.' && ch2[j]=='.')
                        {
                            foo=false;
                            break;
                        }
                        if(ch2[i]=='#' && ch2[j]=='#') // por por # ase kina
                        {
                            foo=false;
                            break;
                        }
                    }
                }
                for(int i=0;i<ch2.length;i++)// kono space ase kina
                {
                    if((int)ch2[i]==32)
                    {
                        foo=false;
                        break;
                    }
                }

            }

        }
        else
        {
            foo=false;
        }
        return foo;
    }
}