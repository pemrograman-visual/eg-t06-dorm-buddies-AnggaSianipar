// 12S24004 - Silvai Eklesiana br. Sitorus
// 12S24032 - Angga B. P. Sianipar

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddy = new String[4];
        int n;

        n = 0;
        inisialisasi(buddy);
        n = func_input(buddy, n);
        output(buddy, n);
    }
    
    public static void inisialisasi(String[] buddy) {
        int a;

        for (a = 0; a <= 3; a++) {
            buddy[a] = "";
        }
    }
    
    public static int func_input(String[] buddy, int n) {
        int i;

        for (i = 0; i <= 3; i++) {
            buddy[i] = input.nextLine();
            if (buddy[i].equals("---")) {
                i = 4;
            } else {
                n = n + 1;
            }
        }
        
        return n;
    }
    
    public static void output(String[] buddy, int n) {
        int m;

        for (m = 0; m <= n - 1; m++) {
            System.out.println(buddy[m]);
        }
    }
}

