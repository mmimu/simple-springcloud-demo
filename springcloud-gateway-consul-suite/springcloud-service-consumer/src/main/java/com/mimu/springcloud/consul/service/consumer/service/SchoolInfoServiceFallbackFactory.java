package com.mimu.springcloud.consul.service.consumer.service;

import com.mimu.springcloud.consul.service.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.consul.service.consumer.request.SchoolRequest;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SchoolInfoServiceFallbackFactory implements FallbackFactory<ISchoolInfoService> {

    private static final Logger logger = LoggerFactory.getLogger(SchoolInfoServiceFallbackFactory.class);

    @Override
    public ISchoolInfoService create(Throwable cause) {
        return new ISchoolInfoService() {
            @Override
            public SchoolSchoolInfo getSchoolInfo1(Map<String, Object> request) {
                logger.error("getSchoolInfo1 fallback error={}", cause);
                return null;
            }

            @Override
            public SchoolSchoolInfo getSchoolInfo2(SchoolRequest request) {
                logger.error("getSchoolInfo2 fallback error={}", cause);
                return null;
            }
        };
    }
}
