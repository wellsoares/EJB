package singleton.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author well
 */
@Singleton
@LocalBean
@Startup
public class SingletonBean {

    @EJB
    private StatefullBean statefulBean;

    @PostConstruct
    private void init() {
        System.out.println("INICIOU SINGLETON BEAN !!!");
    }

    public String callingStatefullBean() {
        return "The value of statefull bean is: " + statefulBean.getStatefullProperty();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTRUINDO BEAN !!!!");
    }

}
