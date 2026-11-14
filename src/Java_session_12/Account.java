package Java_session_12;

// i want to make this class Encapsulated.
// 1. Step 1 : Give all class variables private access modifier.
// 2. Step 2 : Give the getter and setter's as per requirement.

// points to remember

// Encapsulation is not just getters/setters. The real value is protecting invariants (rules that must always hold).
// Not every field needs a setter. Here there is deliberately no setBalance().
// Benefits: security, validation, flexibility to change internals without breaking callers, easier debugging.

// what is Encapsulation : Hiding the important data from outside classes
//  and showing only few details to outside classes.

public class Account {
    private int accountBalance;
    private String accountHolderName;
    private String Email;
    private int pin;
    public int viewAccountBalance(){
        return accountBalance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
     // set email
    public void setEmail(String email){
        this.Email = email;
    }
    // get email
    public String getEmail(){
        return this.Email;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void Debit(int amount , int pin){
        if(pin != this.pin){
            System.out.println("PIN is invalid ");
            return;
        }
        if(this.accountBalance <= 0){
            System.out.println("Account having balance " + this.accountBalance + " kindly credit money !!");
            return;
        }
        this.accountBalance = this.accountBalance-amount;
    }
    public void Credit(int amount , int pin){
        if(pin != this.pin){
            System.out.println("PIN is invalid ");
            return;
        }
        this.accountBalance = this.accountBalance + amount;
        System.out.println(amount + " Credited to account !!");
    }
}
class Bank{
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountHolderName("Pratik Mohite");
        account.setEmail("mohitepratik155@gmail.com");
        account.setPin(1234);
        System.out.println(account.getEmail());
        System.out.println(account.getAccountHolderName());
//        System.out.println(account.getAccountBalance());
        account.Credit(500 , 1234);
        System.out.println(account.viewAccountBalance());
        account.Debit(200 ,1234);
        System.out.println(account.getAccountBalance());

    }
}
