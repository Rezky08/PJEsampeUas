/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.je.spring.rest.dao.impl;

import com.je.spring.rest.dao.DosenDao207225;
import com.je.spring.rest.model.Dosen207225;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("dosenDao207225")
public class DosenDaoImpl207225 implements DosenDao207225 {

    private static final String SQL_SELECT_DOSEN_BY_ID = "SELECT id207225,nama207225,alamat207225,jenkel207225,nohp207225 FROM dosen207225 WHERE id207225=?";
    private static final String SQL_SELECT_DOSEN_ALL = "SELECT id207225,nama207225,alamat207225,jenkel207225,nohp207225 FROM dosen207225";
    private static final String SQL_COUNT_DOSEN = "SELECT COUNT(*) FROM dosen207225";
    private static final String SQL_INSERT_DOSEN = "INSERT INTO dosen207225 (nama207225,alamat207225,jenkel207225,nohp207225) VALUES (?,?,?,?) ";
    private static final String SQL_UPDATE_DOSEN = "UPDATE dosen207225 SET nama207225=? ,alamat207225=? ,jenkel207225=? ,nohp207225=?  WHERE id207225 =? ";
    private static final String SQL_DELETE_DOSEN = "DELETE FROM dosen207225 WHERE id207225=?";
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Dosen207225> getAll() {
        List<Dosen207225> dosenList = null;
        try {
            dosenList = jdbcTemplate.query(SQL_SELECT_DOSEN_ALL, new Object[]{}, new BeanPropertyRowMapper(Dosen207225.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dosenList;
    }

    @Override
    public Dosen207225 getById(int id207225) {
        Dosen207225 dosen = null;
        try {
            dosen = (Dosen207225) jdbcTemplate.queryForObject(SQL_SELECT_DOSEN_BY_ID, new Object[]{id207225}, new RowMapper<Dosen207225>() {

                public Dosen207225 mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Dosen207225 dosen = new Dosen207225();
                    dosen.setId207225(rs.getInt("id207225"));
                    dosen.setNama207225(rs.getString("nama207225"));
                    dosen.setAlamat207225(rs.getString("alamat207225"));
                    dosen.setJenkel207225(rs.getString("jenkel207225"));
                     dosen.setNohp207225(rs.getString("nohp207225"));
                    return dosen;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dosen;
    }

    @Override
    public long count() {
        long count = 0;
        try {
            count = jdbcTemplate.queryForObject(SQL_COUNT_DOSEN, null, Long.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public void insert(Dosen207225 dosen207225) {
        try {
            jdbcTemplate.update(SQL_INSERT_DOSEN, new Object[]{dosen207225.getNama207225(), dosen207225.getAlamat207225(), dosen207225.getJenkel207225(), dosen207225.getNohp207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Dosen207225 dosen207225) {
        try {
            jdbcTemplate.update(SQL_UPDATE_DOSEN, new Object[]{dosen207225.getNama207225(), dosen207225.getAlamat207225(), dosen207225.getJenkel207225(), dosen207225.getNohp207225(), dosen207225.getId207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Dosen207225 dosen207225) {
        try {
            jdbcTemplate.update(SQL_DELETE_DOSEN, new Object[]{dosen207225.getId207225()});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}
