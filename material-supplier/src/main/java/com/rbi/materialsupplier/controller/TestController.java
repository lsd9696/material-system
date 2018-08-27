package com.rbi.materialsupplier.controller;

import com.rbi.materialmanagement.helper.testHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TestController {

    @RequestMapping("/testDate")
    @ResponseBody
    public String getDate(){
        Date curdate = testHelper.getCurdate();
        SimpleDateFormat df = new SimpleDateFormat("yyy-mm-dd");
        return "当前时间为"+df.format(curdate);
    }

}
