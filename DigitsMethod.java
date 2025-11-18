//PROJECT 15

public class DigitsMethod {

    
    public static void digits(int c) {
        if (c == 0) {
            System.out.print(0);
            return;
        }

       
        digits(c - 1);

        
        System.out.print(c);

        
        digits(c - 1);
    }

    
    public static void main(String[] args) {
        digits(3); // expected: 010201030102010
    }
}
