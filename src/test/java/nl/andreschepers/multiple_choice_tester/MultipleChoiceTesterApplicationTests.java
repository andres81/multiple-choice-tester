package nl.andreschepers.multiple_choice_tester;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MultipleChoiceTesterApplicationTests {

	@Test
	void contextLoads() {
	}

}
