/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 *
 * @author well
 */
@Stateful
@LocalBean
public class StatefullBean {

    private int id;

    public String getStatefullProperty() {
        return "The value of id is: " + id++;
    }

}
