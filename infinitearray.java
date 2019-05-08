import java.util.Scanner;
public class infinitearray {
    public static void main(String[] args) {
        int a[]=new int[1],temp;
        Scanner s= new Scanner(System.in);
        a[0] = s.nextInt();
        // Press -1 to exit the loop
        while (true) {            
            int b[]=new int[a.length];
            for(int i=0;i<a.length;i++)
            {
                b[i]=a[i];
            }
            temp=s.nextInt();
            if(temp==-1)
            {
                break;
            }
            a=new int[a.length+1];
            for(int i=0;i<b.length;i++)
            {
                a[i]=b[i];
            }
            a[a.length-1]=temp;
           
            
               }
                     for(int i=0;i<a.length;i++)
                     {
                         System.out.println(a[i]);
                     }
        
            
        }
    }
   