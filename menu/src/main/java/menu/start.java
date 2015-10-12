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
public class start {
      LinkedList<start1> categories;

    public void start() {
        categories = new LinkedList<>();
    }

    public void add(start1 Z) {
        boolean add = categories.add(Z);
    }

    public Boolean delete(start1 Z) {
        return categories.remove(Z);
    }

    public Boolean deleteByName(String name) {
        for (start1 Z : categories) {
            if (Z.getName().equals(name)) {
                categories.remove(Z);
                return true;
            }
        }
        return false;
    }

    public boolean updateByName(String oldName, String newName) {
        for (start1 Z : categories) {
            if (Z.getName().equals(oldName)) {
                Z.setName(newName);
                return true;
            }
        }
        return false;
    }

    public LinkedList<start1> search(String query) {
        if (query.isEmpty()) {
            return categories;
        }

        LinkedList<start1> result = new LinkedList<>();
        for (start1 Z : categories) {
            if (Z.getName().toLowerCase().matches(".*" + query.toLowerCase() + ".*")) {
                result.add(Z);
            }
        }
        return result;
        
    }

    public LinkedList<start1> getCategories() {
        return categories;
    }

    void add(String name1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
