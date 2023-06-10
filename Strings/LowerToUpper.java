import java.util.Scanner;

class LowerToUpper {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String in lowercase : ");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int i = 0;
        while (i != c.length) {
            if (c[i] != ' ') {
                c[i] = (char) (c[i] - 32);
            }
            i++;
        }
        System.out.print("String in uppercase      : ");
        for (char x : c) {
            System.out.print(x);
        }
        System.out.println();
    }
}
