import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach

    public void setUp(){
        bankAccount = new BankAccount("Stella", "Annor", "30.05.1997", 12345, "current");
    }
    @Test
    public void confirmFirstName(){
        String expected = "Stella";
        assertThat(bankAccount.getFirstName()).isEqualTo(expected);
    }
    @Test
    public void confirmLastName(){
        String expected = "Annor";
        assertThat(bankAccount.getLastName()).isEqualTo(expected);
    }
    @Test
    public void confirmDateOfBirth(){
        String expected = "30.05.1997";
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(expected);
    }
    @Test
    public void confirmAccountNumber(){
        int expected = 12345;
        assertThat(bankAccount.getAccountNumber()).isEqualTo(expected);
    }
    @Test
    public void confirmBalance(){
        double expected = 0;
        assertThat(bankAccount.getBalance()).isEqualTo(expected);
    }
    @Test
    public void confirmAccountType(){
        String expected = "current";
        assertThat(bankAccount.getAccountType()).isEqualTo(expected);
    }
    @Test
    public void confirmOverdraftAmount(){
        double expected = -300;
        assertThat(bankAccount.getOverdraft()).isEqualTo(expected);
    }







}
