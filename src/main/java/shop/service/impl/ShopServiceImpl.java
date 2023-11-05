package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shop.dao.ShopDao;
import shop.domain.Shop;
import shop.service.ShopService;

import java.util.List;

@Component
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Override
    public int InsertShop(Shop shop) {
        return shopDao.InsertShop(shop.getShop_id(),shop.getShop_name(),shop.getShop_price(),shop.getShop_brand(),shop.getShop_number(),shop.getShop_inventory(),shop.getShop_sales(),shop.getShop_status());
    }

    @Override
    public List<Shop> SelectAll() {
        List<Shop> shops= shopDao.SelectAll();
        return shops;
    }

    @Override
    public List<Shop> selectName(String shopname) {
        return shopDao.selectName(shopname);
    }

    @Override
    public List<Shop> selectStatus(int status) {
        return shopDao.selectStatus(status);
    }

    @Override
    public List<Shop> selectBrand(String brand) {
        return shopDao.selectBrand(brand);
    }

    @Override
    public int UpdateShop(Shop shop) {
        return shopDao.UpdateShop(shop.getShop_id(),shop.getShop_name(),shop.getShop_price(),shop.getShop_brand(),shop.getShop_number(),shop.getShop_inventory(),shop.getShop_sales(),shop.getShop_status());
    }

    @Override
    public int DeleteShop(int id) {
        return shopDao.DeleteShop(id);
    }
}
