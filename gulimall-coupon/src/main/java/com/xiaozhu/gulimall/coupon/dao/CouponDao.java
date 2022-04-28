package com.xiaozhu.gulimall.coupon.dao;

import com.xiaozhu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 20:50:00
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
