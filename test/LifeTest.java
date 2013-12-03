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

    @Test
    public void should_alive_when_there_are_2_alive_cell_around_for_a_living_cell() throws Exception {
        Life life = new Life();
        life.setStatus(LifeStatus.alive);
        int aliveNumber = 2;
        LifeStatus lifeStatus = life.getStatus(aliveNumber);
        assertThat(lifeStatus, is(LifeStatus.alive));
    }

    @Test
    public void should_dead_when_there_are_2_alive_cell_around_for_a_dead_cell() throws Exception {
        Life life = new Life();
        life.setStatus(LifeStatus.dead);
        int aliveNumber = 2;
        LifeStatus lifeStatus = life.getStatus(aliveNumber);
        assertThat(lifeStatus, is(LifeStatus.dead));
    }

    @Test
    public void should_return_alive_status_when_input_star() throws Exception {
        Earth earth = new Earth();
        String alive = "*";

        LifeStatus aliveStatus = earth.getStatusFromInput(alive);

        assertThat(aliveStatus, is(LifeStatus.alive));
    }

    @Test
    public void should_return_dead_status_when_input_bland() throws Exception {
        Earth earth = new Earth();
        String dead = " ";

        LifeStatus deadStatus = earth.getStatusFromInput(dead);

        assertThat(deadStatus, is(LifeStatus.dead));
    }

    @Test
    public void should_middle_alive_when_input_three_alive_cell() throws Exception {
        String[][] input = {{"*","*","*"},{" "," "," "},{" "," "," "}};
        Earth earth = new Earth();
        Life life = new Life();
        LifePosition position = new LifePosition(1,1);
        life.setPosition(position);

        LifeStatus status = earth.calculateAliveBaseOnAround(life, input);

        assertThat(status, is(LifeStatus.alive));
    }

}
