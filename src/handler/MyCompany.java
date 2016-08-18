package handler;

/**
 * Created by androidjp on 16/8/16.
 */
public class MyCompany {


    public static void main(String[] args) {

        Dealer me = new Dealer() {
            @Override
            protected boolean onHandleEvent(Event event) {
                if ("我能做".equals(event.tag)) {
                    System.out.println("我来做");
                    return true;
                } else {
                    System.out.println("我做不了,我叫我的组长做");
                    return false;
                }
            }
        };

        me.setLeader(new Dealer() {
            @Override
            protected boolean onHandleEvent(Event event) {
                if ("组长能做".equals(event.tag)) {
                    System.out.println("我是组长,我来做");
                    return true;
                } else {
                    System.out.println("我做不了,我叫我的上司做");
                    return false;
                }
            }
        }).setLeader(new Dealer() {
            @Override
            protected boolean onHandleEvent(Event event) {
                if ("上司能做".equals(event.tag)) {
                    System.out.println("我是上司,我来做");
                    return true;
                } else {
                    System.out.println("我做不了,我叫老板做");
                    return false;
                }
            }
        }).setLeader(new Dealer() {
            @Override
            protected boolean onHandleEvent(Event event) {
                System.out.println("我是老板,哎,还是我来");
                return true;
            }
        });

        me.handleEvent(new Event("上司能做"));

    }
}
