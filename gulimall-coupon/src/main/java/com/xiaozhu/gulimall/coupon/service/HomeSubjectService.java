package com.xiaozhu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhu.common.utils.PageUtils;
import com.xiaozhu.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 20:50:00
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

