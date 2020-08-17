package com.mimu.springcloud.consul.service.consumer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mimu.springcloud.consul.service.consumer.model.SchoolSchoolInfo;
import com.mimu.springcloud.consul.service.consumer.request.SchoolRequest;
import com.mimu.springcloud.consul.service.consumer.service.ISchoolInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SchoolController {
    private static final Logger logger = LoggerFactory.getLogger(SchoolController.class);
    @Autowired
    private ISchoolInfoService schoolInfoService;
    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping(value = "/consumer/school.do", method = RequestMethod.GET)
    public SchoolSchoolInfo getUserData(SchoolRequest request) throws JsonProcessingException {
        Map map = objectMapper.readValue(objectMapper.writeValueAsString(request), Map.class);
        SchoolSchoolInfo schoolInfo = schoolInfoService.getSchoolInfo1(map);
        SchoolSchoolInfo schoolInfo2 = schoolInfoService.getSchoolInfo2(request);
        logger.info("request={},result1={},result2={}", request, schoolInfo, schoolInfo2);
        return schoolInfo;
    }
}
