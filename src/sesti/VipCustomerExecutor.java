package sesti;


public class VipCustomerExecutor {
    
    public static void main(String[] args) {
        
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());
        
        VipCustomer vipCustomer2 = new VipCustomer("Mirzad", 2500.00);
        System.out.println(vipCustomer2.getName());
        
        VipCustomer vipCustomer3 = new VipCustomer("Uma", 100.00, "uma@email.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmail());
    }
}
