/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */
/*
public class Order extends Customer {
    private String product;
    private String count;
    
    public Order(String product, String count, String name, String address) {
        super(name, address);
        this.product = product;
        this.count = count;
    }
    
    public String getProduct() {
        return product;
    }
    
    public String getCount() {
        return count;
    }
    
    public String postalAddress() {
        return this.getName() + "\n" + this.getAddress();
    }
}
 */
// Inheritance is not used correctly here since an Order is not a special case of a customer
// The code breaks the single responsibility principle: the Order class is responsible both for 
// maintaining the customer information and the order information
public class Order {

    private Customer customer;
    private String product;
    private String count;

    public Order(Customer customer, String product, String count) {
        this.customer = customer;
        this.product = product;
        this.count = count;
    }

    public String getProduct() {
        return product;
    }

    public String getCount() {
        return count;
    }

    public String postalAddress() {
        return this.customer.getAddress() + "\n" + this.customer.getAddress();
    }
}
