package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
public class ReplaceCharInStr {

    //Using additional secondary space
    public String replaceChar(String str, String patt)
    {
        StringBuffer s = new StringBuffer();
        int patlen = patt.length();
        int strlen = str.length();
        for(int i=0;i<strlen;i++)
        {
            if(str.charAt(i)==' ')
                System.arraycopy(patt,0,s,i,patlen);
            else
                s.append(str.charAt(i));
        }
        return s.toString();
    }

    //Without using additional secondary space
    public String replaceChar(char[] c, char[] pat)
    {
        int spaceCount =0;
        for(int i=0;i<c.length;i++)
            if(c[i]==' ')
                spaceCount++;

        int length = c.length;
        int newLength = length+spaceCount*2;
        c[newLength]='\0';
        for(int i=length-1;i>=0;i++)
            if(c[i]==' ')
            {
                for(int j=1;j<=pat.length;j++)
                    c[newLength-j]=pat[pat.length-i];
                newLength=newLength-pat.length;
            }
        else
            {
                c[newLength-1]=c[i];
                newLength = newLength-1;
            }
        return c.toString();
    }

}
