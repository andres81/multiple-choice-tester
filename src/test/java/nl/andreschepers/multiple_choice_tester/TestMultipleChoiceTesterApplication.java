package nl.andreschepers.multiple_choice_tester;

import org.springframework.boot.SpringApplication;

public class TestMultipleChoiceTesterApplication {

	public static void main(String[] args) {
		SpringApplication.from(MultipleChoiceTesterApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
