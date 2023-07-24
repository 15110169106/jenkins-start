package ls.jk.jenkinsstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName JenkinsController
 * @Description TODO
 * @Author liushuai
 * @Date 2023/7/24 15:54
 */
@RestController
@RequestMapping("/jk")
public class JenkinsController {

    @RequestMapping("/getStr")
    public String getStr(){
        return "测试";
    }
}
