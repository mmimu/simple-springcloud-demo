package com.mimu.springcloud.ms.consumer.service;

import com.mimu.springcloud.ms.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.ms.consumer.request.SchoolRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SchoolInfoServiceFallback implements ISchoolInfoService{
    protected static final Logger logger = LoggerFactory.getLogger(SchoolInfoServiceFallback.class);

    @Override
    public SchoolSchoolInfo getSchoolInfo1(Map<String,Object> request) {
        logger.error("getSchoolInfo1 fallback");
        return null;
    }

    @Override
    public SchoolSchoolInfo getSchoolInfo2(SchoolRequest request) {
        logger.error("getSchoolInfo2 fallback");
        return null;
    }
}
