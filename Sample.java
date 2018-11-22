import java.util.*;
    import java.lang.*;
    import java.io.*;
    class Sample
    {
        public static void main (String[] args) throws java.lang.Exception
        {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int i,j;
          int count=1;
          for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
              if(j!=i){
                System.out.print(count+"*");
                count++;
              }
              else{
                System.out.print(count);
                count++;
              }
            }
            System.out.println();
          }
        }
    }