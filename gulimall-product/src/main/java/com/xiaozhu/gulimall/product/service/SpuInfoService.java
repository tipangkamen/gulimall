package com.xiaozhu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhu.common.utils.PageUtils;
import com.xiaozhu.gulimall.product.entity.SpuInfoEntity;
import com.xiaozhu.gulimall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author xiaozhu
 * @email 1005071600@qq.com
 * @date 2021-08-25 23:42:44
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void savesupInfo(SpuSaveVo vo);

    PageUtils queryPageByCondtion(Map<String, Object> params);

    void up(Long spuId);
}

