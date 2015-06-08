/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfbean;

import stateless.beans.SecondStatelessBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author well
 */
@ManagedBean(name = "indexBean")
@RequestScoped
public class IndexBean {


    public void beanStatelessWithoutInterface() {

        System.out.println("SEM INTERFACE: " );

    }

}
