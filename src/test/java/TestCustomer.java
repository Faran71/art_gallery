import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCustomer {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Zsolt",500);
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Steve");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(500);
    }

    @Test
    public void canAddToWallet(){
        customer.addWallet(500);;
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void canRemoveWallet(){
        customer.removeWallet(100);
        assertThat(customer.getWallet()).isEqualTo(400);

    }

}