import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestArtwork {

    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Mona Lisa", "Da Vinci", 500000000);
    }

    @Test
    public void canGetTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void canGetArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Da Vinci");
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(500000000);
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("Head of a Women");
        assertThat(artwork.getTitle()).isEqualTo("Head of a Women");
    }

    @Test
    public void canSetArtist(){
        artwork.setArtist("Leonardo");
        assertThat(artwork.getArtist()).isEqualTo("Leonardo");
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(3);
        assertThat(artwork.getPrice()).isEqualTo(3);
    }
}
