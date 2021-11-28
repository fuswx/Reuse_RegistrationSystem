package fuswx.controller;

import fuswx.domain.Input;
import fuswx.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/input")
public class InputController {
    @Autowired
    private InputService inputService;

    @RequestMapping("/showOne.do")
    public @ResponseBody Input showOne(@RequestParam(required = true,name = "id")String id){
        System.out.println("sha="+inputService.showOne(Integer.parseInt(id)));
        return inputService.showOne(Integer.parseInt(id));
    }

    @RequestMapping("/addOne.do")
    public @ResponseBody Input addOne(@RequestParam(required = true,name = "id")String id){
        return inputService.addOne(Integer.parseInt(id));
    }

    @RequestMapping("/initOne.do")
    public @ResponseBody Input initOne(@RequestParam(required = true,name = "id")String id){
        return inputService.initOne(Integer.parseInt(id));
    }
}
