package shop.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.domain.Shop;
import shop.service.ShopService;

import java.util.List;

@RestController  //===>@Controller+@ResponseBody
@RequestMapping(value = "/shop")
@CrossOrigin//===>配置跨域，网络请求，允许所有的站点访问
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping
    public List<Shop> SelectAll() {
        return shopService.SelectAll();
    }

    @PostMapping
    public boolean InsertShop(@RequestBody Shop shop) {
        int i = shopService.InsertShop(shop);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @PutMapping
    public boolean UpdateShop(@RequestBody Shop shop) {
        int i = shopService.UpdateShop(shop);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean DeleteShop(@PathVariable int id) {
        int i = shopService.DeleteShop(id);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/{shopname}")
    public List<Shop> selectName(@PathVariable String shopname) {
        return shopService.selectName(shopname);
    }

//    @GetMapping("/selectStatus/{status}")
//    public List<Shop> selectStatus(@PathVariable int status) {
//        return shopService.selectStatus(status);
//    }
//
//    @GetMapping("/selectBrand/{brand}")
//    public List<Shop> selectBrand(@PathVariable String brand) {
//        return shopService.selectBrand(brand);
//    }

}
