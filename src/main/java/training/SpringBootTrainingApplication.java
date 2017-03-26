package training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.rabbitmq.RabbitmqController;

@SpringBootApplication
public class SpringBootTrainingApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootTrainingApplication.class, args);

		// RabbitMQ
		RabbitmqController mqController = new RabbitmqController("test1");
		Thread mqThread = new Thread(mqController);
		mqThread.start();

	}
}
