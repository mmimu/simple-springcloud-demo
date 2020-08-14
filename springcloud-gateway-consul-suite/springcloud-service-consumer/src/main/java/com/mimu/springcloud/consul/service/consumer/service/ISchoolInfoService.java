package com.mimu.springcloud.consul.service.consumer.service;

import com.mimu.springcloud.consul.service.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.consul.service.consumer.request.SchoolRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "school-service", fallback = ISchoolInfoService.SchoolInfoServiceFallback.class)
public interface ISchoolInfoService {

    @GetMapping(value = "/school.do")
    SchoolSchoolInfo getSchoolInfo1(SchoolRequest request);

    @GetMapping(value = "/school.do")
    SchoolSchoolInfo getSchoolInfo2(SchoolRequest request);

    @Component
    class SchoolInfoServiceFallback implements ISchoolInfoService {
        protected static final Logger logger = LoggerFactory.getLogger(SchoolInfoServiceFallback.class);

        @Override
        public SchoolSchoolInfo getSchoolInfo1(SchoolRequest request) {
            logger.error("getSchoolInfo1 fallback");
            return null;
        }

        @Override
        public SchoolSchoolInfo getSchoolInfo2(SchoolRequest request) {
            logger.error("getSchoolInfo2 fallback");
            return null;
        }
    }
}
