package com.xiaozhu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhu.common.to.SkuReductionTo;
import com.xiaozhu.common.utils.PageUtils;
import com.xiaozhu.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 20:50:00
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

