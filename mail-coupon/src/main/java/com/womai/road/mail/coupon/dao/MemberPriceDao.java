package com.womai.road.mail.coupon.dao;

import com.womai.road.mail.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author road
 * @email road@gmail.com
 * @date 2022-03-27 21:10:38
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
