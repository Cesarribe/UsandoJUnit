import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InicialTest {
    @Test
    public void teste  (){
        String nome = "César";
        Assertions.assertEquals("César", nome);

    }
    @Test
    public void notEqualsteste  (){
        String nome = "César";
        Assertions.assertNotEquals("César1", nome);

    }
}
