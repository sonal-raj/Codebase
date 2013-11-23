/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 22/11/13
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 */
public class ModularExponentiation {
    /**
     * Calculate (a^b)%c
     */

    /* This function calculates (ab)%c */
    public long modulo(int a,int b,int c){
        long x=1,y=a; // long long is taken to avoid overflow of intermediate results
        while(b > 0){
            if(b%2 == 1){
                x=(x*y)%c;
            }
            y = (y*y)%c; // squaring the base
            b /= 2;
        }
        return x%c;
    }
}
