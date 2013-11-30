import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LifeTest {
    @Test
    public void should_alive_when_there_are_3_alive_cell_around() throws Exception {
        Life life = new Life();
        int aliveNumber = 3;
        LifeStatus lifeStatus = life.getStatus(aliveNumber);
        assertThat(lifeStatus, is(LifeStatus.alive));
    }


}
