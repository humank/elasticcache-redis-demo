import software.amazon.codeguruprofilerjavaagent.Profiler;

public class MyElasticCache {
    public static final String SERVER = "newdemo-001.baolmq.0001.usw2.cache.amazonaws.com";

    public static void main(String[] args) {

        new Profiler.Builder()
                .profilingGroupName("elasticcache-demo")
                .build().start();

        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i) + 1;
            System.out.println("s is :" + s);
        }
        System.out.println("Hello World!");
//        Jedis jedis = new Jedis(SERVER);
        //set the data in redis string
//        jedis.set("tutorial-name", "Redis tutorial");
        // Get the stored data and print it
        //System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));

    }
}
