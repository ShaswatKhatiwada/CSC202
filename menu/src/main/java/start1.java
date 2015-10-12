/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.LinkedList;

/**
 *
 * @author zain
 */
public class start1 {
    public String name;

    /**
     *
     */
    public LinkedList<start2> items;

    public start1(String name) {
        this.name = name;
        this.items = new LinkedList<>();
    }

    start1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<start2> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().getName().equals(start1.class.getName())) {
            return false;
        }
        start1 c = ((start1) obj);
        return c.getName().equalsIgnoreCase(name);
    }



}


