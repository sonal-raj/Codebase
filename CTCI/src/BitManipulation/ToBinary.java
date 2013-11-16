package BitManipulation;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 11:57
 * To change this template use File | Settings | File Templates.
 */
public class ToBinary {
    /*
           Given a (decimal - e g  3 72) number that is passed in as a string, print the binary rep-
            resentation   If the number can not be represented accurately in binary, print “ERROR”
     */

    public String toBinary(String num)
    {
        int intPart = Integer.parseInt(num.substring(0,num.indexOf('.')));
        double decPart = Integer.parseInt(num.substring(num.indexOf('.'),num.length()));

        String intBin = "";
        while(intPart>0)
        {
            int r = intPart%2;
            intPart>>=1;
            intBin = r+intBin;
        }
        StringBuffer decBin = new StringBuffer("");
        while(decPart>0)
        {
            if(decBin.length()>32)
                return "ERROR";
            if(decPart==1)
            {
                decBin.append((int)decPart);
                break;
            }
            double r = decPart*2;
            if(r>=1)
            {
                decBin.append(1);
                decPart = r-1;
            }
            else
            {
                decBin.append(0);
                decPart = r;
            }
        }
        return (intBin+"."+decBin);
    }
}
