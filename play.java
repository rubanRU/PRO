import java.util.*;
import java.lang.*;
public class play{
      public static void main(String aa[]){
       int n;
       int count=0;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(double i=1;i<=n;i++){
            for(double j=1;j<=n;j++){
                 double p=Math.pow(2, j);
                  if(p==i){
                      count++;
                  }
            }
          
       }
      int l=(n+1)-count;
      System.out.println(l);
      
}
}
