public class HanoiSolution {

  
    public static void Hanoi(Towers t, int n, int start, int target, int spare) {
        if (n == 0) {
            return; 
        }

        
        Hanoi(t, n - 1, start, spare, target);

        
        t.move(start, target);

        
        Hanoi(t, n - 1, spare, target, start);
    }

    
    static class Towers {
        public void move(int from, int to) {
            System.out.println("Move from " + from + " to " + to);
        }
    }

    
    public static void main(String[] args) {
        Towers t = new Towers();
        Hanoi(t, 3, 1, 3, 2);
    }
}
