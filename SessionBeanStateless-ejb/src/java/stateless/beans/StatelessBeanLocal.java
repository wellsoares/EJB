package stateless.beans;

import javax.ejb.Local;

/**
 *
 * @author well
 */
@Local
public interface StatelessBeanLocal {

    public String testeStalessBeanWithInterface();
    
}
