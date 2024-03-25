package controller;

import domain.Firend;
import domain.Person;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class TestController {
    @RequestMapping("person1.do")
    public String service1(@RequestParam("person") String person1) {
        System.out.println("参数输出啦1：");
        System.out.println(person1);
        return "welcome.jsp";
    }
    @RequestMapping("person2.do")
    public String service2(Person person) {
        System.out.println("参数输出啦：");
        System.out.println(person);
        return "welcome.jsp";
    }
    @RequestMapping("person3.do")
    public String service3(Person person) {
        System.out.println("参数输出啦：");
        System.out.println();
        return "welcome.jsp";
    }
    @RequestMapping("person4.do")
    public String service4(@RequestParam Map person) {
        System.out.println("参数输出啦：");
        System.out.println(person);
        return "welcome.jsp";
    }


    @RequestMapping("person5.do")
    public String service5(Firend firend, @CookieValue("JSESSIONID")String cookie, @RequestHeader("Accept-Language") String header) {
//        System.out.println(firend);
//        System.out.println(header);
//        System.out.println(cookie);
        return "son";
    }
    @RequestMapping("son.do")
    public String service6() {

        return "welcome.jsp";
    }
    @ResponseBody
    @RequestMapping("ajax.do")
    public Firend service7(@RequestBody Firend firend1) {
        Firend firend = new Firend("王天赐", 18, null);
        System.out.println("接受到啦"+firend1);
        return firend;
    }
}
