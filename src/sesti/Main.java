package sesti;

public class Main {
    
    public static void main(String[] args) {
        
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is "+ porsche.getModel());
        
        
        
        BankAccount bankAccount = new BankAccount(123456789, 2000.20, "Mirzad Sadovic", "mirzad11@icloud.com", 61907007);
        
        //Challenge
        
        //dodavanje parametara, prije kreiranja konstruktora iznad
        //BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456789);
        bankAccount.setBalance(2000.20);
        bankAccount.setCustomerName("Mirzad Sadovic");
        bankAccount.setEmail("mirzad11@icoud.com");
        bankAccount.setPhoneNumber(61907007);
        
        bankAccount.depositFunds(200.20);
        bankAccount.withdrawlFunds(400);
    }
}
