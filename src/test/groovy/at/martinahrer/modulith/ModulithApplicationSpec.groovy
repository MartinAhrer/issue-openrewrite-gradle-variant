package at.martinahrer.modulith;

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration;
import spock.lang.Specification;

@SpringBootTest
@ContextConfiguration // required due to https://github.com/spockframework/spock/issues/1539
class ModulithApplicationSpec extends Specification {

    @Autowired
    ApplicationContext applicationContext

    void contextLoads() {
        expect:
        1 == 1
        applicationContext != null
    }

}
