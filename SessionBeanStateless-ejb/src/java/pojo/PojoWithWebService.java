package pojo;
//TESTE GITHUB !!!!
import java.io.Serializable;

/**
 *
 * @author well
 */
public class PojoWithWebService implements Serializable {

    private String name;
    private Integer age;
    private Double currencyValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(Double currencyValue) {
        this.currencyValue = currencyValue;
    }

}
