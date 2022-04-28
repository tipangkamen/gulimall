package com.xiaozhu.gulimall.order.dao;

import com.xiaozhu.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 21:43:17
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
