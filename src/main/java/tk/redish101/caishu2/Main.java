package tk.redish101.caishu2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(101);
        int c = 1;
        int shu1 = 1;
        int shu2 = 100;
        while (true) {
            System.out.println("请输入你要猜的数字"+shu1+"~"+shu2);
            int d = in.nextInt();
            if (d == a) {
                System.out.println("恭喜你，猜对了，你用了"+c+"次");
                break;
            }
            if (d > a) {
                c = c + 1;
                shu2 = d - 1;
                System.out.println("猜大了");
            }
            if (d < a) {
                c = c + 1;
                shu1 = d + 1;
                System.out.println("猜小了");
            }
        }
    }
}
