import java.util.Scanner;
public class IsPrime
{
    private static int MAX=10009;
    private static int[] sieve = new int[MAX];
        public static void SieveOfEratosthenes()
        {
            //populate the sieve
            for(int i=2;i<MAX;i++)
                sieve[i]=i;
            //sieve the data
            for(int i=2;i<MAX;i++)
                if(sieve[i]!=0)
                {
                    for(int j=i+1;j<(MAX);j++)
                        if(sieve[j]%i==0)
                            sieve[j]=0;
                }
        }
        public static void main(String[] args) throws java.lang.Exception
        {
            SieveOfEratosthenes();
            //System.out.println("Sieve generated");
            Scanner s = new Scanner(System.in);
            int t = Integer.parseInt(s.nextLine());
            while((t--)!=0)
            {
                int n = Integer.parseInt(s.nextLine());
                if(sieve[n]!=0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
}
