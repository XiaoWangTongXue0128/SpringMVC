package exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义异常处理类
 * DispatcherServlet不会帮我们处理
 */
@Component
public class ExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if (e instanceof MyException) {
            ModelAndView mv = new ModelAndView();
            mv.addObject("errorMessage", "errorMessage:" + e.getMessage());
            mv.setViewName("error.jsp");
            return mv;
        }
        return null;
    }
}
