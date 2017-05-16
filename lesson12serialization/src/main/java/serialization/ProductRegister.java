package serialization;

import java.io.Serializable;

/**
 * Created by 12 on 16.05.2017.
 */
public class ProductRegister implements Serializable {
    Long value;
    Product product;

    public ProductRegister(Long value, Product product) {
        this.value = value;
        this.product = product;
    }
}
