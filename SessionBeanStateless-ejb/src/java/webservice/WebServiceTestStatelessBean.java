package webservice;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import singleton.beans.SingletonBean;
import stateless.beans.SecondStatelessBean;
import stateless.beans.StatelessBeanLocal;

/**
 *
 * @author well
 */
@WebService(serviceName = "webServiceTeste")
@Stateless()
public class WebServiceTestStatelessBean {

    @EJB()
    private StatelessBeanLocal statelessBeanWithInterface;
    @EJB()
    private SecondStatelessBean statelessBeanWithoutInterface;
    @EJB
    private SingletonBean singletonBean;

    @WebMethod
    public String callWithInterface() {
        return statelessBeanWithInterface.testeStalessBeanWithInterface();
    }

    @WebMethod
    public String callWithoutInterface() {
        return statelessBeanWithoutInterface.callStatelessBeanWithoutInterfaces();
    }

    @WebMethod
    public String callingSingletonBean() {
        return singletonBean.callingStatefullBean();
    }
}
