import java.util.*;
    import java.lang.*;
    import java.io.*;
    class Sample1
    {
        public static void main (String[] args) throws java.lang.Exception
        {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          s=s.trim();
          int len=s.length();
          String t="";
          for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'|c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
              t=t+"+"+c;
            }
            else{
              t=t+c;
            }
          }
          System.out.print(t);
    // write your code here
        }
    }