package com.mimu.springcloud.consul.service.provider2.service;

import com.mimu.springcloud.consul.service.provider2.model.SchoolSchoolInfo;
import com.mimu.springcloud.consul.service.provider2.repository.SchoolRepository;
import com.mimu.springcloud.consul.service.provider2.request.SchoolRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * author: mimu
 * date: 2020/4/16
 */
@Service
public class SchoolService {
    private static final Logger logger = LoggerFactory.getLogger(SchoolService.class);
    private SchoolRepository schoolRepository;
    private RestTemplate restTemplate;

    @Autowired
    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public SchoolSchoolInfo getSchoolInfo(SchoolRequest request) {
        SchoolSchoolInfo schoolInfo = schoolRepository.getSchoolInfo(request.getSerial());
        logger.info("{}", schoolInfo);
        return schoolInfo;
    }

}
