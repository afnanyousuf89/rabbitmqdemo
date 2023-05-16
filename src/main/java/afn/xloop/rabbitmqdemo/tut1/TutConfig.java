package afn.xloop.rabbitmqdemo.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"tut1","hello-world"})
@Configuration
public class TutConfig {
    
    @Bean
    public Queue hello(){
        return new Queue("hello");
    }


    @Profile("sender")
    @Bean
    public TutSender sender(){
        return new TutSender();
    }

    @Profile("receiver")
    @Bean
    public TutReceiver receiver(){
        return new TutReceiver();
    }

}
