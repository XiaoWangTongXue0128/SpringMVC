package controller;

import exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

@SessionAttributes("value3")
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("login.do")
    public String login(Integer id,String name) {
        System.out.println(id + "--- " + name);
        String value = userService.login(id, name);
        if (value.equals("登录成功")) {
            return "welcome.jsp";
        }
        return "index.jsp";
    }


    @RequestMapping("test.do")
    public ModelAndView test(Model model, ModelMap modelMap) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("value3", "ccc");
//        model.addAttribute("value1", "aaa");
//        modelMap.addAttribute("value2", "bbb");

        modelAndView.setViewName("welcome.jsp");
        return modelAndView;
    }
    @RequestMapping("testException.do")
    public String testException(){
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            //后台开发人员查看
            e.printStackTrace();
            throw new MyException("服务端业务层异常");
        }

        return "welcome.jsp";
    }
    @RequestMapping("testIntercept.do")
    public String testIntercept(){//所谓的资源方法  拦截器在资源到达之前执行 资源执行后也能执行
        System.out.println("控制层执行啦");
        String s = null;
//        System.out.println(s.length());
        return "interceptor.jsp";
    }
}
