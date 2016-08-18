package handler;

/**
 * 事件处理者(采用责任链模式)
 * Created by androidjp on 16/8/17.
 */
public abstract class Dealer {
    protected Dealer myLeader;

    public Dealer() {
    }

    public Dealer setLeader(Dealer leader){
        this.myLeader = leader;
        return this.myLeader;
    }

    public void handleEvent(Event event){
        if(!onHandleEvent(event)){
            this.myLeader.handleEvent(event);
        }
    }

    protected abstract boolean onHandleEvent(Event event);
}
