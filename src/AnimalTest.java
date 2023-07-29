import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {
public void testCustomsMethod(){
    Animal animal=new Animal();

    int result= animal.customMethod;

    int expectedOutput = 0;
    assertEquals(result, expectedOutput);
}

}
