package bowplusplus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BpmToMsConverterTest {

    @Test
    public void testGetMsFromBpm() {
        BpmToMsConverter sixtyBpm = new BpmToMsConverter(60);
        assertEquals(60000, sixtyBpm.milliSeconds);
    }
    
}
