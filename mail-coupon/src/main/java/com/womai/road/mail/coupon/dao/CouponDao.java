package com.womai.road.mail.coupon.dao;

import com.womai.road.mail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author road
 * @email road@gmail.com
 * @date 2022-03-27 21:10:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
