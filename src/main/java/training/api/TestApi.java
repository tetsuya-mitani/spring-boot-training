package training.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mitanitetsuya on 2017/03/20.
 */

@RestController
@RequestMapping("api/v1/test")
public class TestApi {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }
}
