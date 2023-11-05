package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.domain.Count;
import shop.service.CountService;

import java.util.List;

@RestController  //===>@Controller+@ResponseBody
@RequestMapping(value = "/count")
@CrossOrigin//===>配置跨域，网络请求，允许所有的站点访问
public class CountController {
    @Autowired
    private CountService countService;
    @GetMapping
    public List<Count> SelectAll() {
        return countService.selectAll();
    }
}
