package afn.xloop.rabbitmqdemo.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class TutSender {
    
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(){
        String msg = "This is message from Sender";
        this.template.convertAndSend(queue.getName(),msg);
        System.out.println(" [x] Send '"+msg+"'");
    }
}
