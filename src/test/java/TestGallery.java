import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestGallery {

    Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("British Gallery");
    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("British Gallery");
    }
    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }
    @Test
    public void canGetStock(){
        assertThat(gallery.getStock().size()).isEqualTo(3);
    }
    @Test
    public void canAddToStock(){
        gallery.addArtwork(new Artwork("Bob","Dave",9.99));
        assertThat(gallery.getStock().size()).isEqualTo(4);
    }
    @Test
    public void canRemoveFromStock(){
        gallery.removeArtwork(1);
        assertThat(gallery.getStock().size()).isEqualTo(2);
    }
    @Test
    public void canSellArtwork(){
        gallery.sellArtwork("Mona Lisa");
        gallery.removeArtwork(0);
        assertThat(gallery.getTill()).isEqualTo(50);
        assertThat(gallery.getStock().size()).isEqualTo(2);
        assertThat(gallery.getCustomerWallet()).isEqualTo(450);
    }



}
