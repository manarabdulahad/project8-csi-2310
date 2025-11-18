//PROJECT 16
public class BinaryPrint {

    
    public static void binaryPrint(int n) {
      
        if (n == 0) {
            System.out.print(0);
            return;
        }

        
        if (n > 1) {
            binaryPrint(n / 2);
        }

        
        System.out.print(n % 2);
    }

    
    public static void main(String[] args) {
        binaryPrint(0);  
        System.out.println();
        binaryPrint(4);  
        System.out.println();
        binaryPrint(27); 
    }
}
