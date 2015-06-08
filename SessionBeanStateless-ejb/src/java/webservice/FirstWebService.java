package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import pojo.PojoWithWebService;

/**
 *
 * @author well
 */
@WebService(serviceName = "WebService")
@Stateless()
public class FirstWebService {

    /**
     * This is a sample web service operation
     *
     * @param outroNome
     * @return
     */
    @WebMethod(operationName = "sayHello")
    public String hello(@WebParam(name = "name") String outroNome) {
        return "Hello " + outroNome + " !";
    }

    @WebMethod()
    //@WebMethod(exclude = true) Retirar metodo do webService
    public PojoWithWebService getPojo() {

        PojoWithWebService pojo = new PojoWithWebService();

        pojo.setAge(26);
        pojo.setCurrencyValue(Double.MIN_NORMAL);
        pojo.setName("Wellington");

        return pojo;
    }
}
