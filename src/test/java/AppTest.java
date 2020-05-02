import org.junit.Test;
import redis.clients.jedis.Jedis;

public class AppTest {

    public static final String SERVER = "newdemo-001.baolmq.0001.usw2.cache.amazonaws.com";

    @Test
    public void connectionTest(){

        System.out.println( "Hello World!" );
        Jedis jedis = new Jedis(SERVER);
        //set the data in redis string
        jedis.set("tutorial-name", "Redis tutorial");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));
    }
}
