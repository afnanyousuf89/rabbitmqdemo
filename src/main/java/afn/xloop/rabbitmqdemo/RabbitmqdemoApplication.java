package afn.xloop.rabbitmqdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

import afn.xloop.rabbitmqdemo.tut1.*;

@SpringBootApplication
@EnableScheduling
public class RabbitmqdemoApplication {

	@Profile("usage_message")
	@Bean
	public CommandLineRunner usage(){
		return args ->{
			System.out.println("This App uses Spring profile to control its behavior....\n");
			System.out.println("You can run using: java -jar target/demo.jar --spring.profiles.active=hello-world,sender");
		};
	}


	@Profile("!usage_message")
	@Bean
	public CommandLineRunner toturial(){
		return new MyAppRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqdemoApplication.class, args);
	}
}
