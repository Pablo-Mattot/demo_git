package be.ehb.demo_git.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalcController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public Integer som(@RequestParam(value = "x") Integer x,
                       @RequestParam(value = "y") Integer y){
        return x+y;
    }

}
