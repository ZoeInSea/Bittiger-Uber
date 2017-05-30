import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zoe on 5/29/17.
 */

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello Spring Boot";
    }
}
