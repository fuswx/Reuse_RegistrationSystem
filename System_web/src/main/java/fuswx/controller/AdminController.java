package fuswx.controller;

import com.github.pagehelper.PageInfo;
import fuswx.domain.Admin;
import fuswx.domain.User;
import fuswx.service.IAdminService;
import fuswx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @RequestMapping("/register.do")
    public ModelAndView register(Admin admin){
        ModelAndView modelAndView=new ModelAndView();
        adminService.register(admin);
        modelAndView.setViewName("submit-success");
        return modelAndView;
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "paheNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name="pageSize",required = true,defaultValue = "5")Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(adminService.findAll(pageSize,pageNum));
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("admin-list");
        return modelAndView;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id") Integer id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("admin",adminService.findById(id));
        modelAndView.setViewName("admin-show");
        return modelAndView;
    }
}
