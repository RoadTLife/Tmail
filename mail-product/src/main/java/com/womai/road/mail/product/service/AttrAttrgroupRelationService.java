package com.womai.road.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.womai.road.common.utils.PageUtils;
import com.womai.road.mail.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author road
 * @email road@gmail.com
 * @date 2022-03-24 00:07:50
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

