package serialization;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 12 on 16.05.2017.
 */
public class Product implements Serializable {
    private String name;
    private ProductRegister mainRegister;
    private List<ProductRegister> registers;

    public void setMainRegister(ProductRegister mainRegister) {
        this.mainRegister = mainRegister;
    }

    public ProductRegister getMainRegister() {

        return mainRegister;
    }

    public void setRegisters(List<ProductRegister> registers) {
        this.registers = registers;
    }

    public List<ProductRegister> getRegisters() {

        return registers;
    }



    public Product(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
