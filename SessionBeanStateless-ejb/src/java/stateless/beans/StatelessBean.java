package stateless.beans;

import javax.ejb.Stateless;

/**
 *
 * @author well
 */
@Stateless()
public class StatelessBean implements StatelessBeanLocal {

    @Override
    public String testeStalessBeanWithInterface() {
        return "BEAN WITH INTERFACE WORKING !!!!";
    }
}
