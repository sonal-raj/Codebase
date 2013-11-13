package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 11/11/13
 * Time: 02:13
 * To change this template use File | Settings | File Templates.
 */
public class Monitors {
    //use the synchronized keyword to create a monitor
    int    userNumber;
    String userLastName;
    String userFirstName;
    double userBalance;
    public synchronized boolean deposit( double amount ){
        double newBalance;
        if( amount < 0.0 ){
            return false; /* Can’t deposit negative amount */
        } else {
            newBalance = userBalance + amount;
            userBalance = newBalance;
            return true;
        }
    }
    public synchronized boolean withdraw( double amount ){
        double newBalance;
        if( amount < 0.0 || amount > userBalance ){
            return false; /* Negative withdrawal or insufficient funds */
        } else {
            newBalance = userBalance-amount;
            userBalance = newBalance;
            return true;
        }
    }
    //more efficient version
    /*  public boolean deposit( double amount ){
                    double newBalance;
                    if( amount < 0.0 ){
                        return false;
            } else {
            synchronized( this ){
                    newBalance = userBalance + amount;
            userBalance = newBalance;
            }
                    return true;
            }
                    }
            public boolean withdraw( double amount ){
                    double newBalance;
            synchronized( this ){
                    if( amount < 0.0 || amount > userBalance ){
                         return false;
                        }
                    else {
                          newBalance = userBalance – amount;
                          userBalance = newBalance;
                          return true;
                          }
                        }
                      }
                    }
     */
}
