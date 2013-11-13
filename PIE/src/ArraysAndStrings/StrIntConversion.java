package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 23:44
 * To change this template use File | Settings | File Templates.
 */
public class StrIntConversion {

    public int StrToInt(String str)
    {
        int i=0;int num=0;
        boolean isNeg = false;
        int len = str.length();
        //check if negative
        if(str.charAt(i)=='-')
        {
            isNeg=true;
            i=1;
        }
        //convert string to int
        while(i<len)
        {
            num=num*10;
            num=num+(str.charAt(i++)-'0');
        }
        //change to negative if negative;
        if(isNeg)
            num=-num;

        return num;
    }

    public String IntToStr(int n)
    {
        boolean isNeg = false;
        //check negative
        if(n<0)
        {
            isNeg = true;
            n=-n;
        }
        //insert in string
        String num="";
        if(isNeg)
            num+='-';
        do {
            num+=((n%10)+'0');n=n/10;
        }
        while(n!=0);

        //reverse the digits;
        int len = num.length();
        char[] c = num.toCharArray();
        int start=0, end=len-1;
        if(isNeg)
            start=1;
        while(start++ <= end--)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
        }
      return c.toString();

    }
}
