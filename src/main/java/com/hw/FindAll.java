package com.hw;

import com.google.gson.JsonObject;
import com.hw.util.DataBaseUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hw
 * @version 1.0
 * @date 2020/3/24 19:57
 */
@Controller
public class FindAll {

    @RequestMapping("/findAll")
    @ResponseBody
    @Scheduled(cron = "0/1 * *  * * ? ")
    public List<String> TestDemo(){
        List<String> list = new ArrayList<>();
        List<String> tableNames = DataBaseUtil.getTableNames();
        for (String tableName : tableNames){
            List<String> columnNames = DataBaseUtil.getColumnNames(tableName);
            for (String columnName : columnNames){
                list.add(columnName);
            }
        }
        System.out.println(list);
        return list;
    }
}
