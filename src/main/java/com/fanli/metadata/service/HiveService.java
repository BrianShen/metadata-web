package com.fanli.metadata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by wei.shen on 2015/10/29.
 */
@Service
public class HiveService {
    @Autowired
    private JdbcTemplate hiveJdbcTemplate;

    public List<Map<String, Object>> queryForList(String sql) {
        return hiveJdbcTemplate.queryForList(sql);
    }
}
