package com.xiaozhu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhu.common.to.SkuHasStockVo;
import com.xiaozhu.common.utils.PageUtils;
import com.xiaozhu.gulimall.ware.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 21:58:37
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);

    List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);
}

