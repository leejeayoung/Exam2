package exam.two.actbase.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class IndexController {

    @GetMapping(value = "hello", params = { "name" })
    public String home(@RequestParam String name) {

        return "" + name + "님. 안녕하세요.";
    }

}
