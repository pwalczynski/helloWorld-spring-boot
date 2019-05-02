package pl.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}
