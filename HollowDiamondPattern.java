class Main {
    public static void main(String[] args) {
        int size = 5; // Size of the diamond (height of top half)
        
        // Top half of the diamond
        for (int i = 1; i <= size; i++) {
            // Print leading spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            
            // Print first asterisk
            System.out.print("*");
            
            // Print inner spaces
            for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                System.out.print(" ");
            }
            
            // Print second asterisk for rows after first
            if (i > 1) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // Bottom half of the diamond
        for (int i = size - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            
            // Print first asterisk
            System.out.print("*");
            
            // Print inner spaces
            for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                System.out.print(" ");
            }
            
            // Print second asterisk for rows after first
            if (i > 1) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}