package fuswx.controller;

import com.github.pagehelper.PageInfo;
import fuswx.domain.User;
import fuswx.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(userService.findAll(pageNum,pageSize));
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }

    @RequestMapping("/register.do")
    public ModelAndView register(User user){
        ModelAndView modelAndView=new ModelAndView();
        userService.register(user);
        modelAndView.setViewName("submit-success");
        return modelAndView;
    }

    @RequestMapping("/save.do")
    public String save(User user,@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize){
        userService.register(user);
        return "redirect:findAll.do?pageNum="+pageNum+"&pageSize="+pageSize;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id){
        ModelAndView modelAndView=new ModelAndView();
        if (id==null){
            modelAndView.addObject("user",userService.findById(id));
            modelAndView.setViewName("user-show");
            //modelAndView.setViewName("user-login-page");
        }else {
            modelAndView.addObject("user",userService.findById(id));
            modelAndView.setViewName("user-show");
        }
        return modelAndView;
    }

    @RequestMapping("/findById_Admin.do")
    public ModelAndView findById_Admin(Integer id){
        ModelAndView modelAndView=new ModelAndView();
        if (id==null){
            modelAndView.addObject("user",userService.findById(id));
            modelAndView.setViewName("user-show-Admin");
            //modelAndView.setViewName("user-login-page");
        }else {
            modelAndView.addObject("user",userService.findById(id));
            modelAndView.setViewName("user-show-Admin");
        }
        return modelAndView;
    }

    @RequestMapping("/update.do")
    public ModelAndView update(User user){
        ModelAndView modelAndView=new ModelAndView();
        userService.update(user);
        modelAndView.addObject("user",userService.findById(user.getId()));
        modelAndView.setViewName("user-show");
        return modelAndView;
    }

    @RequestMapping("/update_Admin.do")
    public String update_Admin(User user){
        userService.alter(user);
        return "redirect:findAll.do?pageNum=1&pageSize=5";
    }

    @RequestMapping("/delete.do")
    public String delete(@RequestParam(name = "id",required = true) Integer id,@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize){
        userService.delete(id);
        return "redirect:findAll.do?pageNum="+pageNum+"&pageSize="+pageSize;
    }

    @RequestMapping("/findByAny.do")
    public ModelAndView findByAny(@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize,@RequestParam(name = "pageSize",required = true) String data){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(userService.findByAny(pageNum,pageSize,data));
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.addObject("data",data);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }

}
