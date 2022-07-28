import com.oracle.tools.packager.Log;

public class PayByPayImp implements PayStrategy{
    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("现金支付 :" + paymentAmount);
        return false;
    }
}
