package pcg;

import java.util.Scanner;
public class Main{
    static int count = 0;
    public static void p(int n) {
        count++;
        if (count <= n) {
            System.out.println(count);
            p(n);
        }
}
    public static void main(String[] args) {
        Scanner n = new  Scanner(System.in);
        p(n.nextInt());
    }
}

