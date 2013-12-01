public class Life {
    private LifeStatus status;

    public void setStatus(LifeStatus status) {
        this.status = status;
    }
    public LifeStatus getStatus(int aliveNumber) {
        modifyStatus(aliveNumber);
        return status;
    }

    public void modifyStatus(int aliveNumber) {
        if(aliveNumber == 3 )
            status = LifeStatus.alive;
        else if(aliveNumber != 2)
            status = LifeStatus.dead;
    }


}
