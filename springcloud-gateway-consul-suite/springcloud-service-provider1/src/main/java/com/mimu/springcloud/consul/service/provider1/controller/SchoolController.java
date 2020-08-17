package com.mimu.springcloud.consul.service.provider1.controller;


import com.mimu.springcloud.consul.service.provider1.model.SchoolSchoolInfo;
import com.mimu.springcloud.consul.service.provider1.request.SchoolRequest;
import com.mimu.springcloud.consul.service.provider1.service.SchoolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: mimu
 * date: 2019/6/29
 */
@RestController
public class SchoolController {
    private static final Logger logger = LoggerFactory.getLogger(SchoolController.class);
    private SchoolService schoolService;

    @Autowired
    public void setSchoolService(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @RequestMapping(value = "/school.do", method = RequestMethod.GET)
    public SchoolSchoolInfo getUserData(SchoolRequest request) {
        SchoolSchoolInfo schoolInfo = schoolService.getSchoolInfo(request);
        logger.info("provider1 request={},result={}", request, schoolInfo);
        return schoolInfo;
    }
}
