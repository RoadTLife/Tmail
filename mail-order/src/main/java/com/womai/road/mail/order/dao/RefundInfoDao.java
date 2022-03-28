package com.womai.road.mail.order.dao;

import com.womai.road.mail.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author road
 * @email road@gmail.com
 * @date 2022-03-27 21:32:43
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
