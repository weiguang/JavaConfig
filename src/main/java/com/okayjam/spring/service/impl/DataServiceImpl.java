package com.okayjam.spring.service.impl;

import com.okayjam.spring.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Chen weiguang <chen2621978@gmail.com>
 * @create: 2019/08/23 16:17
 **/
@Service
public class DataServiceImpl implements DataService {

    @Autowired
    JdbcOperations jdbcTemplate;

    @Override
    public void list() {
        List<Map> list = jdbcTemplate.query("select * from  jam1 ", (resultSet, i) -> {
            Map m = new HashMap(16);
            m.put("id", resultSet.getObject(1));
            m.put("name", resultSet.getObject(2));
            m.put("birthday", resultSet.getObject(3));
            m.put("age", resultSet.getObject(4));
            return m;
        });
        for (Map map : list) {
            System.out.println(map);
        }
    }
}
