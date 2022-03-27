package com.womai.road.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.womai.road.common.utils.PageUtils;
import com.womai.road.mail.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author road
 * @email road@gmail.com
 * @date 2022-03-24 00:07:50
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

