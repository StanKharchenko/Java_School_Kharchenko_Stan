package serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 12 on 16.05.2017.
 */
public class Deposit extends Product {

    private static final long serialVersionUID = 9134579123376307402L;
    private String code;
//    private long rate;
    public Deposit(String code) {
        super(code + new Date().getTime());
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return super.toString() + " Deposit(" + this.hashCode() + "){" +
                "code='" + code + '\'' +
                '}';
    }
}
