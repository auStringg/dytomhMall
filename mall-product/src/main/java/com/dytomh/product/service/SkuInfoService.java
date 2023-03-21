package com.dytomh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dytomh.common.utils.PageUtils;
import com.dytomh.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author qjf
 * @email qjfyouxiang@gmail.com
 * @date 2023-03-21 23:34:49
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
