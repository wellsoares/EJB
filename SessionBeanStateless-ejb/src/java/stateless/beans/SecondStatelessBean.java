package stateless.beans;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author well
 */
@Stateless()
@LocalBean
public class SecondStatelessBean  {

    public String callStatelessBeanWithoutInterfaces() {
        return "BEAN WITHOUT INTERFACE WORKING !!!!";
    }
}
