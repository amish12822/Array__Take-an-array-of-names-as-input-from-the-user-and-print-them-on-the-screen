import java.util.Scanner;

/**
 * array_string
 */
public class array_string {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of Array = ");int n = sc.nextInt();

        String name[] = new String[n];

        //input array
        System.out.println("Input Array Value: ");
        for (int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) +" Name = ");name[i] = sc.next();
        }

        // output array
        System.out.println("Print Array Value: ");
        for (int i=0; i<n; i++){
            System.out.print(name[i] + " ");
        }
    }
}