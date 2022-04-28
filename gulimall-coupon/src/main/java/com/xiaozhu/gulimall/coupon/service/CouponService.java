package com.xiaozhu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhu.common.utils.PageUtils;
import com.xiaozhu.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 20:50:00
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

