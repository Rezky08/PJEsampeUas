/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.je.spring.rest.dao.impl;

import com.je.spring.rest.dao.MobilDao207225;
import com.je.spring.rest.model.Mobil207225;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("mobilDao207225")
public class MobilDaoImpl207225 implements MobilDao207225 {

    private static final String SQL_SELECT_MOBIL_BY_ID = "SELECT * WHERE id207225=?";
    private static final String SQL_SELECT_MOBIL_ALL = "SELECT * FROM mobil207225";
    private static final String SQL_COUNT_MOBIL = "SELECT COUNT(*) FROM mobil207225";
    private static final String SQL_INSERT_MOBIL = "INSERT INTO mobil207225 (nama_mobil207225,merk207225,type207225,warna207225,harga207225) VALUES (?,?,?,?,?)";
    private static final String SQL_UPDATE_MOBIL = "UPDATE mobil207225 SET nama_mobil207225=?, merk207225=? ,type207225=? ,warna207225=?, harga207225=?  WHERE id207225 =? ";
    private static final String SQL_DELETE_MOBIL = "DELETE FROM mobil207225 WHERE id207225=?";
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Mobil207225> getAll() {
        List<Mobil207225> mobilList = null;
        try {
            mobilList = jdbcTemplate.query(SQL_SELECT_MOBIL_ALL, new Object[]{}, new BeanPropertyRowMapper(Mobil207225.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mobilList;
    }

    @Override
    public Mobil207225 getById(int id207225) {
        Mobil207225 mobil = null;
        try {
            mobil = (Mobil207225) jdbcTemplate.queryForObject(SQL_SELECT_MOBIL_BY_ID, new Object[]{id207225}, new RowMapper<Mobil207225>() {

                public Mobil207225 mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Mobil207225 mobil = new Mobil207225();
                    mobil.setId207225(rs.getInt("id207225"));
                    mobil.setNamaMobil207225(rs.getString("nama_mobil207225"));
                    mobil.setMerk207225(rs.getString("merk207225"));
                    mobil.setType207225(rs.getString("type207225"));
                    mobil.setWarna207225(rs.getString("warna207225"));
                    mobil.setHarga207225(rs.getInt("harga207225"));
                    return mobil;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mobil;
    }

    @Override
    public long count() {
        long count = 0;
        try {
            count = jdbcTemplate.queryForObject(SQL_COUNT_MOBIL, null, Long.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public void insert(Mobil207225 mobil207225) {
        try {
            
            jdbcTemplate.update(SQL_INSERT_MOBIL, new Object[]{mobil207225.getNamaMobil207225(), mobil207225.getMerk207225(), mobil207225.getType207225(), mobil207225.getWarna207225(),mobil207225.getHarga207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Mobil207225 mobil207225) {
        try {
            jdbcTemplate.update(SQL_UPDATE_MOBIL, new Object[]{mobil207225.getNamaMobil207225(), mobil207225.getMerk207225(), mobil207225.getType207225(), mobil207225.getWarna207225(),mobil207225.getHarga207225(),mobil207225.getId207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Mobil207225 mobil207225) {
        try {
            jdbcTemplate.update(SQL_DELETE_MOBIL, new Object[]{mobil207225.getId207225()});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}
