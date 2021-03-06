package com.womai.road.mail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.womai.road.mail.product.entity.BrandEntity;
import com.womai.road.mail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setBrandId(1L);
        brandEntity.setDescript("好吃");
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<>(brandEntity).eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item.toString());
        });
        System.out.println("select execute success ！！！");
    }

}
