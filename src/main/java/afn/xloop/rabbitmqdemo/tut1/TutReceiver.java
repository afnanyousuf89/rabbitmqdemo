package afn.xloop.rabbitmqdemo.tut1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")
public class TutReceiver {
    @RabbitHandler
    public void receive(String in){
        System.out.println(" [x] Received '"+in+"'");
    }
}
