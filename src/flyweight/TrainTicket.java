package flyweight;

/**
 * Created by androidjp on 16/8/20.
 */
public class TrainTicket implements Ticket {
    //内部状态(创建享元时提供)
    public String from;
    public String to;

    //外部状态(由外界动态提供)
    public String bunk;//铺位
    public int price;//价格

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        System.out.println("购买从"+ from+ "到"+to+ "的"+ bunk +"火车票,价格为:"+ price);
    }
}
