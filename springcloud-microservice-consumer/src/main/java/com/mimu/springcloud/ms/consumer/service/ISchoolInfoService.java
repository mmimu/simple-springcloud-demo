package com.mimu.springcloud.ms.consumer.service;

import com.mimu.springcloud.ms.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.ms.consumer.request.SchoolRequest;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.lang.model.element.NestingKind;
import java.util.Map;

@FeignClient(value = "micro-service-school", fallbackFactory = SchoolInfoServiceFallbackFactory.class)
public interface ISchoolInfoService {

    @GetMapping(value = "/school.do")
    SchoolSchoolInfo getSchoolInfo1(@RequestParam Map<String,Object> request);

    @GetMapping(value = "/school.do")
    SchoolSchoolInfo getSchoolInfo2(SchoolRequest request);
}
