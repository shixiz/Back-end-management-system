package shop.service;

import org.apache.ibatis.annotations.Select;
import shop.domain.Shop;

import java.util.List;

public interface ShopService {

    int InsertShop(Shop shop);

    List<Shop> SelectAll();

    List<Shop> selectName(String shopname);

    List<Shop> selectStatus(int status);

    List<Shop> selectBrand(String brand);

    int UpdateShop(Shop shop);

    int DeleteShop(int id);
}
