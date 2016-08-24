package observer;

/**
 * Created by androidjp on 16/8/18.
 */
public class Test {
    public static void main(String[] args){
        News news = new News();

        Person A  = new Person("A");
        Person B  = new Person("B");
        Person C  = new Person("C");

        news.addObserver(A);
        news.addObserver(B);
        news.addObserver(C);

        news.postNewArticle("大消息,奥巴马挂了!!!");

        news.addObserver(C);

        news.postNewArticle("又一条消息,我考上清华啦!!");

    }
}
