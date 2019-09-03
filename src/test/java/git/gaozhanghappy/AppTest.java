package git.gaozhanghappy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.orclight.encryption.util.UUIDUtil;

import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void uuid(){
        final String split = UUID.randomUUID().toString();
        System.out.println(split);
        final String[] split1 = split.split("-");
        for (String strings:split1){
            System.out.println(strings);
        }
    }
}
