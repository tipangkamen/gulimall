package com.xiaozhu.gulimall.member.feign;

import com.xiaozhu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponService {

    @RequestMapping("/coupon/coupon/member/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R membercoupons();

}
