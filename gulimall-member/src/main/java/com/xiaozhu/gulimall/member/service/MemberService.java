package com.xiaozhu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhu.common.utils.PageUtils;
import com.xiaozhu.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-09-22 21:33:03
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

