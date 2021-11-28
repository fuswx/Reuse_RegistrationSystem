package fuswx.controller;

import com.github.pagehelper.PageInfo;
import fuswx.service.IApartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/apart")
public class ApartController {

    @Autowired
    private IApartService apartService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(Integer pageNum,Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(apartService.findAll(pageNum,pageSize));
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("apart-list");
        return modelAndView;
    }
    @RequestMapping("/userFindAll.do")
    public ModelAndView userFindAll(Integer pageNum,Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(apartService.findAll(pageNum,pageSize));
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("apart-list-show");
        return modelAndView;
    }

    @RequestMapping("/insertOne.do")
    public String insertOne(@RequestParam(name = "pageNum") Integer pageNum, @RequestParam(name = "pageSize")Integer pageSize,@RequestParam(name = "apartName") String apartName,@RequestParam(name = "apartQQ") String apartQQ){
        System.out.println("================="+apartName+"="+apartQQ);
        apartService.insertOne(apartName,apartQQ);
        return "redirect:findAll.do?pageNum="+pageNum+"&pageSize="+pageSize;
    }

    @RequestMapping("/delete.do")
    public String delete(@RequestParam(name = "pageNum") Integer pageNum, @RequestParam(name = "pageSize")Integer pageSize,@RequestParam(name = "apartId") String apartId){
        apartService.delete(apartId);
        apartService.initId("apart","id");
        return "redirect:findAll.do?pageNum="+pageNum+"&pageSize="+pageSize;
    }

}
