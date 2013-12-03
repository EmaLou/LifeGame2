public class Life {
    private LifeStatus status;


    private LifePosition position;

    public void setStatus(LifeStatus status) {
        this.status = status;
    }
    public void setPosition(LifePosition position) {
        this.position = position;
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




    public LifePosition getPosition() {
        return position;
    }
}
