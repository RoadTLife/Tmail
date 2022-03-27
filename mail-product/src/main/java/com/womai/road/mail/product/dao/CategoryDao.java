package com.womai.road.mail.product.dao;

import com.womai.road.mail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author road
 * @email road@gmail.com
 * @date 2022-03-24 00:07:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
