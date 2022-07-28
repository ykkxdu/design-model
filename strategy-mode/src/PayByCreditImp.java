import com.oracle.tools.packager.Log;

public class PayByCreditImp implements PayStrategy {
    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("信用卡支付 :" + paymentAmount);
        return true;
    }
}
