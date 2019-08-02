import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping(value = "/")
    public String root() {
        return "Hello from Root";
    }

    @GetMapping(value = "/demo")
    public String demo() {
        return "Hello from Demo";
    }

}