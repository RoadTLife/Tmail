package com.womai.road.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.womai.road.common.utils.PageUtils;
import com.womai.road.mail.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author road
 * @email road@gmail.com
 * @date 2022-03-27 21:30:08
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

