public class Bank {
    private String bankName;
    private int amount;
    private String address;

    
    public Bank(String bank, int amt, String address) {
        bankName = bank;
        amount = amt;
        this.address = address;
    }

    
    public void display() {
        System.out.println("Bank name: " + bankName + ", Amount: " + amount + ", Address: " + address);
    }
    
    public static void main(String[] args) {
        Bank nicBank = new Bank("NIC", 1000, "Balaju");
        nicBank.display();

        Bank nabilBank = new Bank("Nabil", 10000, "Baneshwor");
        nabilBank.display();


    }
}
