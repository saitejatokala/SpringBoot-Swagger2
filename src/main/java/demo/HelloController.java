package demo;

/**
 * Created by saitejatokala on 05/09/15.
 */
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String autoCompleteLocality(@RequestParam String q, @RequestParam(required = false) String lat,@RequestParam(required = false) String lon,@RequestParam(required = false)Long cityId) {
        return "sa";
    }
}