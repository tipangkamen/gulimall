package com.xiaozhu.gulimall.order.dao;

import com.xiaozhu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 21:43:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
