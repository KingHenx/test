package fi.haagahelia.course;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;  // JUnit4 -> JUnit 5/Jupiter
import org.junit.jupiter.api.extension.ExtendWith; // JUnit4 -> JUnit 5/Jupiter
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fi.haagahelia.course.web.HelloController;

/**
 * Testing that the context is creating your controller
 * 
 * @author h01270
 *
 */
// @RunWith(SpringRunner.class) JUnit4
@ExtendWith(SpringExtension.class)  // JUnit 5 eli Jupiter
@SpringBootTest
public class HellotestApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(helloController).isNotNull();
    }	
}
