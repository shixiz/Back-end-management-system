package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.domain.Sales;
import shop.service.SalesService;

import java.util.List;

@RestController  //===>@Controller+@ResponseBody
@RequestMapping(value = "/sales")
@CrossOrigin//===>配置跨域，网络请求，允许所有的站点访问
public class SalesController {
    @Autowired
    private SalesService salesService;
    @GetMapping
    public List<Sales> SelectAll() {
        return salesService.selectAll();
    }
}
