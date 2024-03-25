package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {  

    @RequestMapping(path = "aaa.do",params = {"key1"})
    public String testOne() {
        System.out.println("testOne1");
        return "welcome.jsp";
    }
    @RequestMapping("bbb.do")
    public String testTwo() {
        System.out.println("testTwo");
        return "welcome.jsp";
    }
    @RequestMapping(path = "ccc.do",params = {"key=mq","value=wtc"},method = RequestMethod.POST)
    public String testThree() {
        System.out.println("testThree");
        return "welcome.jsp";
    }
    @RequestMapping(path = "ddd.do",headers = {"Accept-Language=zh-CN,zh;q=0.9,en;q=0.8","Connection=keep-alive"})
    public String testFour() {
        System.out.println("testFour");
        return "welcome.jsp";
    }
    @RequestMapping(path = "eee.do",params = {"!key"})
    public String testFive() {
        System.out.println("testFive");
        return "welcome.jsp";
    }
    @RequestMapping(path = "fff.do",params = {"param!=value"})
    public String testSix() {
        System.out.println("testSix");
        return "welcome.jsp";
    }
}
