/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author zain
 */
public class start2 {
     private String name;

    private Double price;

    private Integer quantity;

    private String description;

    private String size;

    private Boolean specialOrder;

    public start2(String name, Double price, Integer Quantity, String description, Boolean specialOrder) {
        this.name = name;
        this.price = price;
        this.quantity = Quantity;
        this.description = description;
        this.specialOrder = specialOrder;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @return the Quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @return the specialOrder
     */
    public Boolean getSpecialOrder() {
        return specialOrder;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().getName().equals(start2.class.getName())) {
            return false;
        }
        start2 f = (start2) obj;
        return name.equals(f.getName()) && description.equals(f.getDescription())
                && price == f.getPrice() && quantity == f.getQuantity()
                && specialOrder == f.getSpecialOrder() && size == f.getSize();
    }


}

   

