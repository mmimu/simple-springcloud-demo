package com.mimu.springcloud.ms.consumer.service;

import com.mimu.springcloud.ms.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.ms.consumer.request.SchoolRequest;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "micro-service-school", fallbackFactory = SchoolInfoServiceFallbackFactory.class)
public interface ISchoolInfoService {

    @GetMapping("/school.do")
    SchoolSchoolInfo getSchoolInfo1(@RequestParam("request") SchoolRequest request);

    @GetMapping(value = "/school.do")
    SchoolSchoolInfo getSchoolInfo2(SchoolRequest request);
}
