import com.sun.deploy.util.StringUtils;

/**
 * Created by androidjp on 16-8-2.
 */
public class Main {
    public static void main(String[] args) {
        String value = "123556\" ";
        value = value.split("\"")[0].trim();
        System.out.println(value);
    }
}
