package com.xiaozhu.gulimall.product.dao;

import com.xiaozhu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-08-25 23:42:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
