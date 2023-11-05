package shop.dao;

import org.apache.ibatis.annotations.*;
import shop.domain.Shop;

import java.util.List;

public interface ShopDao {
    @Insert("insert into shop values (#{arg0},#{arg1},#{arg2},#{arg3},#{arg4},#{arg5},#{arg6},#{arg7})")
    int InsertShop(int id, String names, double price, String brand, String number, int inventory, int sales, int status);

    @Select("select * from shop")
    List<Shop> SelectAll();

    @Select("select * from shop where shop_name like \"%${shopname}%\"")
    List<Shop> selectName(String shopname);

    @Select("select * from shop where shop_status like \"%${status}%\"")
    List<Shop> selectStatus(int status);

    @Select("select * from shop where shop_brand like \"%${brand}%\"")
    List<Shop> selectBrand(String brand);

    @Update("update shop set shop_name=#{arg1},shop_price=#{arg2},shop_brand=#{arg3},shop_number=#{arg4},shop_inventory=#{arg5},shop_sales=#{arg6}," +
            "shop_status=#{arg7} where shop_id=#{arg0}")
    int UpdateShop(int id, String name, double price, String brand, String number, int inventory, int sales, int status);

    @Delete("delete from shop where shop_id = #{id}")
    int DeleteShop(int id)  ;
}
