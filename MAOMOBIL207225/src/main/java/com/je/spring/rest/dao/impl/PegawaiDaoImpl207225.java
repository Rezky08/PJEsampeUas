/*
  Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
*/

package com.je.spring.rest.dao.impl;

import com.je.spring.rest.dao.PegawaiDao207225;
import com.je.spring.rest.model.Pegawai207225;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("pegawaiDao207225")
public class PegawaiDaoImpl207225 implements PegawaiDao207225{
    private static final String SQL_SELECT_PEGAWAI_BY_ID = "SELECT * FROM pegawai207225 WHERE id207225=?";
    private static final String SQL_SELECT_PEGAWAI_ALL = "SELECT * FROM pegawai207225";
    private static final String SQL_COUNT_PEGAWAI = "SELECT COUNT(*) FROM pegawai207225";
    private static final String SQL_INSERT_PEGAWAI = "INSERT INTO pegawai207225 (nik207225, nama_pegawai207225, alamat_pegawai207225, telp_pegawai207225) VALUES (?,?,?,?) ";
    private static final String SQL_UPDATE_PEGAWAI = "UPDATE pegawai207225 SET nik207225=?, nama_pegawai207225=?, alamat_pegawai207225=?, telp_pegawai207225=?  WHERE id207225 =? ";
    private static final String SQL_DELETE_PEGAWAI = "DELETE FROM pegawai207225 WHERE id207225=?";
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Pegawai207225> getAll() {
        List<Pegawai207225> pegawaiList = null;
        try {
            pegawaiList = jdbcTemplate.query(SQL_SELECT_PEGAWAI_ALL, new Object[]{}, new BeanPropertyRowMapper(Pegawai207225.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pegawaiList;
    }

    @Override
    public Pegawai207225 getById(int id207225) {
        Pegawai207225 pegawai = null;
        try {
            pegawai = (Pegawai207225) jdbcTemplate.queryForObject(SQL_SELECT_PEGAWAI_BY_ID, new Object[]{id207225}, new RowMapper<Pegawai207225>() {

                public Pegawai207225 mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Pegawai207225 pegawai = new Pegawai207225();
                    pegawai.setId207225(rs.getInt("id207225"));
                    pegawai.setNik207225(rs.getString("nik207225"));
                    pegawai.setNamaPegawai207225(rs.getString("nama_pegawai207225"));
                    pegawai.setAlamatPegawai207225(rs.getString("alamat_pegawai207225"));
                    pegawai.setTelpPegawai207225(rs.getString("telp_pegawai207225"));
                    return pegawai;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pegawai;
    }

    @Override
    public long count() {
        long count = 0;
        try {
            count = jdbcTemplate.queryForObject(SQL_COUNT_PEGAWAI, null, Long.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public void insert(Pegawai207225 pegawai207225) {
        try {
            jdbcTemplate.update(SQL_INSERT_PEGAWAI, new Object[]{pegawai207225.getNik207225(), pegawai207225.getNamaPegawai207225(), pegawai207225.getAlamatPegawai207225(), pegawai207225.getTelpPegawai207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Pegawai207225 pegawai207225) {
        try {
            jdbcTemplate.update(SQL_UPDATE_PEGAWAI, new Object[]{pegawai207225.getNik207225(), pegawai207225.getNamaPegawai207225(), pegawai207225.getAlamatPegawai207225(), pegawai207225.getTelpPegawai207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Pegawai207225 pegawai207225) {
        try {
            jdbcTemplate.update(SQL_DELETE_PEGAWAI, new Object[]{pegawai207225.getId207225()});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
