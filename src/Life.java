public class Life {
    public LifeStatus status;

    public LifeStatus getStatus(int aliveNumber) {
        modifyStatus(aliveNumber);
        return status;
    }

    public void modifyStatus(int aliveNumber) {
        if(aliveNumber ==3 )
            status = LifeStatus.alive;
    }

}
