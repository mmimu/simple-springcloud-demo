package com.mimu.springcloud.ms.consumer.controller;

import com.mimu.springcloud.ms.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.ms.consumer.request.SchoolRequest;
import com.mimu.springcloud.ms.consumer.service.ISchoolInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    private static final Logger logger = LoggerFactory.getLogger(SchoolController.class);
    @Autowired
    private ISchoolInfoService schoolInfoService;

    @RequestMapping(value = "/consumer/school.do", method = RequestMethod.GET)
    public SchoolSchoolInfo getUserData(SchoolRequest request) {
        SchoolSchoolInfo schoolInfo = schoolInfoService.getSchoolInfo1(request);
        logger.info("request={},result={}", request, schoolInfo);
        return schoolInfo;
    }
}
