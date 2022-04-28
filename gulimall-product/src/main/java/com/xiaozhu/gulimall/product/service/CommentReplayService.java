package com.xiaozhu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhu.common.utils.PageUtils;
import com.xiaozhu.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-08-25 23:42:44
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

