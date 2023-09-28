package GCD;
public class gcd {
     public static void main(String[] args) {
        
  }

public static int GCD(int a , int b) {
       if ( b == 0 ) {
        return a;
    }
       else {
        return GCD(b, (a%b));
       }
    }
}