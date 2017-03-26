package training.rabbitmq;

/**
 * Created by mitanitetsuya on 2017/03/26.
 */
public class RabbitmqController implements Runnable {
    private String name;

    public RabbitmqController(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Receive receive = new Receive();
        try {
            receive.receive();
        } catch (Exception e) {
            e.printStackTrace();
        }

        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Send send = new Send();
            try {
                send.send();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
