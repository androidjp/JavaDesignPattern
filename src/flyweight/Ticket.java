package flyweight;

/**
 * 外部状态
 * Created by androidjp on 16/8/20.
 */
public interface Ticket {

    /**
     * 显示票信息
     * @param bunk 铺位
     */
    public void showTicketInfo(String bunk);
}
