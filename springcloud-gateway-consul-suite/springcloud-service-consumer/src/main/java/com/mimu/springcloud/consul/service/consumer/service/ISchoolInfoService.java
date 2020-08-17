package com.mimu.springcloud.consul.service.consumer.service;

import com.mimu.springcloud.consul.service.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.consul.service.consumer.request.SchoolRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "school-service", /*fallback = SchoolInfoServiceFallback.class*/ fallbackFactory = SchoolInfoServiceFallbackFactory.class)
public interface ISchoolInfoService {

    @GetMapping(value = "/school.do")
    SchoolSchoolInfo getSchoolInfo1(@RequestParam Map<String, Object> request);

    @GetMapping(value = "/school.do")
    SchoolSchoolInfo getSchoolInfo2(SchoolRequest request);
}
