import BankPck.Bank;
import BankPck.BankManager;

public class Customer {
    public void accessBankVault(Bank bank) {
//        bank.accessVault(); // If you uncomment this method (remove // from beginning of this line), you'll have an error because bank.accessVault() is package protected & customer is not in the bank package
    }

    public void accessBankVault(BankManager manager, Bank bank) {
        manager.accessVault(bank);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Bank bank = new Bank();
        BankManager manager = new BankManager();

        customer.accessBankVault(bank);
        customer.accessBankVault(manager, bank);

    }
}