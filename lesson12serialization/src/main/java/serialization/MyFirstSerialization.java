package serialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 12 on 16.05.2017.
 */
public class MyFirstSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Deposit deposit = new Deposit("code1");
//        List<ProductRegister> productRegisters = new ArrayList<>();
//        productRegisters.add(new ProductRegister(1L,deposit));
//        productRegisters.add(new ProductRegister(10L,deposit));
//        productRegisters.add(new ProductRegister(15L,deposit));
//        productRegisters.add(new ProductRegister(11L,deposit));
//        deposit.setMainRegister(productRegisters.get(0));
//        deposit.setRegisters(productRegisters);
//        System.out.println(deposit);
//        DepositSerializer.serialize("name1", deposit);
        Deposit newDeposist = DepositSerializer.deserialize("name1");
        System.out.println(newDeposist);
    }
}
