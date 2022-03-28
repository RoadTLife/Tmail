package com.womai.road.mail.member.dao;

import com.womai.road.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author road
 * @email road@gmail.com
 * @date 2022-03-27 21:23:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
