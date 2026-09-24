import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        
        int temp = a;
        a=b;
        b=temp;
        
        System.out.print(a+" ");
        System.out.print(b);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna