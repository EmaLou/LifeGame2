public class Earth {

    public LifeStatus calculateAliveBaseOnAround(Life life, String[][] input) {
        LifePosition position = life.getPosition();
        LifePosition[] aroundPosition = calculateAroundPosition(position);
        int aliveNumber = getAliveNumber(aroundPosition,input);

        return life.getStatus(aliveNumber);
    }

    private int getAliveNumber(LifePosition[] aroundPosition, String[][] input) {
        int aliveNumber = 0;
        for(int i=0; i<aroundPosition.length; i++) {
            String lifeSymbol = input[aroundPosition[i].getX()][aroundPosition[i].getY()];
            LifeStatus lifeStatus = getStatusFromInput(lifeSymbol);
            if(lifeStatus.equals(LifeStatus.alive))
                aliveNumber ++;
        }
        return aliveNumber;
    }

    public LifePosition[] calculateAroundPosition(LifePosition position) {
        LifePosition[] result = new LifePosition[8];
        result[0] = new LifePosition(position.getX()-1, position.getY()-1);
        result[1] = new LifePosition(position.getX()-1, position.getY());
        result[2] = new LifePosition(position.getX()-1, position.getY()+1);
        result[3] = new LifePosition(position.getX(), position.getY()-1);
        result[4] = new LifePosition(position.getX(), position.getY()+1);
        result[5] = new LifePosition(position.getX()+1, position.getY()-1);
        result[6] = new LifePosition(position.getX()+1, position.getY());
        result[7] = new LifePosition(position.getX()+1, position.getY()+1);
        return result;
    }

    public LifeStatus getStatusFromInput(String input) {
        return input.equals("*") ? LifeStatus.alive : LifeStatus.dead;
    }
}
