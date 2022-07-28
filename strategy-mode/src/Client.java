import java.util.Scanner;

public class Client {
    private static PayStrategy mPayStrategy;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.nextInt() == 1) {
            mPayStrategy = new PayByPayImp();
        } else {
            mPayStrategy = new PayByCreditImp();
        }
        mPayStrategy.pay(20);
    }
}
