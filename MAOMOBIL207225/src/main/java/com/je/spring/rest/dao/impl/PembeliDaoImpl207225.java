/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.dao.impl;

import com.je.spring.rest.dao.PembeliDao207225;
import com.je.spring.rest.model.Pembeli207225;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("pembeliDaO207225")
public class PembeliDaoImpl207225 implements PembeliDao207225 {

    private static final String SQL_SELECT_PEMBELI_BY_ID = "SELECT id207225,nik207225,nama_pembeli207225,alamat_pembeli207225,telp_pembeli207225 FROM PEMBELI207225 WHERE id207225=?";
    private static final String SQL_SELECT_PEMBELI_ALL = "SELECT id207225,nik207225,nama_pembeli207225,alamat_pembeli207225,telp_pembeli207225 FROM PEMBELI207225";
    private static final String SQL_COUNT_PEMBELI = "SELECT COUNT(*) FROM PEMBELI207225";
    private static final String SQL_INSERT_PEMBELI = "INSERT INTO PEMBELI207225 (nik207225 ,nama_pembeli207225, alamat_pembeli207225, telp_pembeli207225) VALUES (?,?,?,?) ";
    private static final String SQL_UPDATE_PEMBELI = "UPDATE PEMBELI207225 SET nik207225=? ,nama_pembeli207225=? ,alamat_pembeli207225=? ,telp_pembeli207225=?  WHERE id207225 =? ";
    private static final String SQL_DELETE_PEMBELI = "DELETE FROM PEMBELI207225 WHERE id207225=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Pembeli207225> getAll() {
        List<Pembeli207225> PembeliList = null;
        try {
            PembeliList = jdbcTemplate.query(SQL_SELECT_PEMBELI_ALL, new Object[]{}, new BeanPropertyRowMapper(Pembeli207225.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PembeliList;
    }

    @Override
    public Pembeli207225 getById(int id207225) {
        Pembeli207225 Pembeli = null;
        try {
            Pembeli = (Pembeli207225) jdbcTemplate.queryForObject(SQL_SELECT_PEMBELI_BY_ID, new Object[]{id207225}, new RowMapper<Pembeli207225>() {

                public Pembeli207225 mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Pembeli207225 Pembeli = new Pembeli207225();
                    Pembeli .setId207225(rs.getInt("id207225"));
                    Pembeli .setNik207225(rs.getString("nik207225"));
                    Pembeli .setNama_pembeli207225(rs.getString("nama_pembeli207225"));
                    Pembeli .setAlamat_pembeli207225(rs.getString("alamat_pembeli207225"));
                    Pembeli .setTelp_pembeli207225(rs.getString("telp_pembeli207225"));
                    return Pembeli ;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pembeli ;
    }

    @Override
    public void insert(Pembeli207225 pembeli207225) {
        try {
            jdbcTemplate.update(SQL_INSERT_PEMBELI, new Object[]{pembeli207225.getNik207225(), pembeli207225.getNama_pembeli207225(), pembeli207225.getAlamat_pembeli207225(), pembeli207225.getTelp_pembeli207225()});
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public void update(Pembeli207225 pembeli207225) {
        try {
            jdbcTemplate.update(SQL_UPDATE_PEMBELI, new Object[]{pembeli207225.getNik207225(), pembeli207225.getNama_pembeli207225(), pembeli207225.getAlamat_pembeli207225(), pembeli207225.getTelp_pembeli207225(), pembeli207225.getId207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Pembeli207225 pembeli207225) {
         try {
            jdbcTemplate.update(SQL_DELETE_PEMBELI, new Object[]{pembeli207225.getId207225()});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public long count() {
        long count = 0;
        try {
            count = jdbcTemplate.queryForObject(SQL_COUNT_PEMBELI, null, Long.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
