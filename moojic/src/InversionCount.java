import java.util.Scanner;
public class InversionCount {
    static int inf = Integer.MAX_VALUE;
    static int a[] = new int[200009];
    static int L[] = new int[200009];
    static int R[] = new int[200009];
    static int c;

    public static void merge(int p, int q, int r)
    {
        int i,j,k,ind1,ind2;

        for(i = p,ind1 = 1;i <= q;i++){
            L[ind1++] = a[i];
        }
        L[ind1] = inf;

        for(i = q+1,ind2 = 1;i <= r;i++){
            R[ind2++] = a[i];
        }
        R[ind2] = inf;

        i = j = 1;

        for(k = p;k <= r;k++){
            if(L[i] > R[j]){
                c += ind1 - i;
                a[k] = R[j];
                j++;
            }
            else{
                a[k] = L[i];
                i++;
            }
        }
    }

    public static void mergeSort(int p, int r)
    {
        if(p < r){
            int q = (p+r)/2;
            mergeSort(p,q);
            mergeSort(q+1,r);
            merge(p,q,r);
        }
    }
    public static void main(String[] args) throws Exception
    {
        int t, n, i;
        Scanner s = new Scanner(System.in);
        t = Integer.parseInt(s.nextLine());
        while((t--)!=0)
        {
            n = Integer.parseInt(s.nextLine());
            String[] temp = s.nextLine().split(" ");
            for(i=0;i<temp.length;i++)
            {
                a[i] = Integer.parseInt(temp[i]);
            }
            c = 0;
            mergeSort(1,n);
            System.out.println(c);
            c = 0;
        }
    }
}
