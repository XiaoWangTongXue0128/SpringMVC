package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class TestController {

    @RequestMapping("test.do")
    public String test(){
        System.out.println("test好用啦");
        return "welcome.jsp";
    }

    //原生方式处理文件的上传
//    @RequestMapping("upload.do")
//    public String upload(HttpServletRequest request) throws Exception {
//        //获取磁盘文件选项的factory
//        DiskFileItemFactory factory = new DiskFileItemFactory();
//        //创建一个ServletFileUpload对象
//        ServletFileUpload upload = new ServletFileUpload(factory);
//        //让upload对象帮我们去解析request(目的获取数据)
//        List<FileItem> itemList = upload.parseRequest(request);
//        //遍历所有的文件项
//        for(FileItem item : itemList){
//            //每次循环判断一下当前item是文件还是普通表单对象
//            if(item.isFormField()){//普通表单数据
//                String key = item.getFieldName();
//                String value = item.getString("UTF-8");
//                System.out.println(key+"--"+value);
//            }else{//文件数据
//                String fileName = item.getName();//名字可以自己弄一个规则 确保文件名唯一  UUID
//                item.write(new File("D://test//",fileName));
//            }
//        }
//        return "welcome.jsp";
//    }

    //文件上传的时候需要一个临时存储
    //factory.setSizeThreshold(1024000);//设置缓存大小
    //factory.setRepository(new File("路径"));

    @RequestMapping("upload.do")
    public String upload(String text, MultipartFile upload) throws IOException {
        System.out.println("新的controller执行啦");
        System.out.println(text);
        //文件名字
        String fileName = upload.getOriginalFilename();
        //文件对象
        //upload对象帮我们做传输
        upload.transferTo(new File("D://test//",fileName));
        return "welcome.jsp";
    }
}
