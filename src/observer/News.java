package observer;

import java.util.Observable;

/**
 * 新闻
 * Created by androidjp on 16/8/18.
 */
public class News extends Observable{

    public void postNewArticle(String article){
        setChanged();
        notifyObservers(article);
    }

}
