package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="id")int index){
        return new PeopleList().getPosition(index-1);
    }

    @ResponseBody
    @RequestMapping("/greetings")
    public  List<Greeting> pls(){
        return new PeopleList().getPps();
    }


    /*@RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="id")long id){

        return new Greeting(1,
                "John",
                "Kravitz"
                );
    }*/
}
