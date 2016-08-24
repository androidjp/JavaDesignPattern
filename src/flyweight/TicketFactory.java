package flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元模式的应用:
 *  Map全局成员,用于存放可复用的类对象(也就是享元)
 * Created by androidjp on 16/8/20.
 */
public class TicketFactory {
    static Map<String ,Ticket> sTicketMap = new ConcurrentHashMap<String , Ticket>();

    public static Ticket getTicket(String from , String to){
        String key = from+"-"+to;
        if (sTicketMap.containsKey(key)){
            return sTicketMap.get(key);
        }else{
            System.out.println("创建新的Ticket对象");
            Ticket ticket = new TrainTicket(from,to);
            sTicketMap.put(key , ticket);
            return ticket;
        }
    }


    public static void main(String[] args){
        TicketFactory.getTicket("北京","上海");
        TicketFactory.getTicket("北京","上海");
        TicketFactory.getTicket("北京","上海");
    }
}
