import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCustomer {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Steve",5000000);
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Steve");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(5000000);
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(500);
        assertThat(customer.getWallet()).isEqualTo(500);
    }

}