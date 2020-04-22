/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.dao.impl;

import com.je.spring.rest.dao.BeliCashDao207225;
import com.je.spring.rest.model.BeliCash207225;
import com.je.spring.rest.model.Mobil207225;
import com.je.spring.rest.model.Pegawai207225;
import com.je.spring.rest.model.Pembeli207225;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("belicashDao")
public class BeliCashDaoImpl207225 implements BeliCashDao207225 {

    private static final String SQL_SELECT_BELICASH_BY_ID = "SELECT * FROM beli_cash207225 INNER JOIN pegawai207225 "
            + "ON pegawai207225.id207225 = beli_cash207225.idPegawai207225"
            + "INNER JOIN pembeli207225 ON pembeli207225.id207225 = beli_cash207225.idPembeli207225"
            + "INNER JOIN mobil207225 ON mobil207225.id207225 = beli_cash207225.idMobil207225"
            + "WHERE beli_cash207225.id207225 =?";
    private static final String SQL_SELECT_BELICASH_ALL = "SELECT * FROM beli_cash207225 INNER JOIN pegawai207225 "
            + "ON pegawai207225.id207225 = beli_cash207225.idPegawai207225"
            + "INNER JOIN pembeli207225 ON pembeli207225.id207225 = beli_cash207225.idPembeli207225"
            + "INNER JOIN mobil207225 ON mobil207225.id207225 = beli_cash207225.idMobil207225";

    private static final String SQL_COUNT_BELICASH = "SELECT COUNT(*) FROM beli_cash207225";
    private static final String SQL_INSERT_BELICASH = "INSERT INTO beli_cash207225 (cashTgl207225, cashBayar207225, idPegawai207225, idPembeli207225, idMobil207225) VALUES (?,?,?,?,?) ";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<BeliCash207225> getAll() {
        List<BeliCash207225> belicashList = null;
        try {
            belicashList = jdbcTemplate.query(SQL_SELECT_BELICASH_ALL, new Object[]{}, new RowMapper<BeliCash207225>() {
                public BeliCash207225 mapRow(ResultSet rs, int rowNum) throws SQLException {
                    BeliCash207225 beliCash207225 = new BeliCash207225();
                    Pegawai207225 pegawai = new Pegawai207225();
                    Pembeli207225 Pembeli = new Pembeli207225();
                    Mobil207225 mobil = new Mobil207225();
                    beliCash207225.setId207225(rs.getInt("id207225"));
                    beliCash207225.setCashTgl207225(null);//kaga tau gmn penuisannya tanggal
                    beliCash207225.setCashBayar2072225(rs.getString("cashBayar207225"));

                    pegawai.setId207225(rs.getInt("id207225"));
                    pegawai.setNik207225(rs.getString("nik207225"));
                    pegawai.setNamaPegawai207225(rs.getString("namaPegawai207225"));
                    pegawai.setAlamatPegawai207225(rs.getString("alamatPegawai207225"));
                    pegawai.setTelpPegawai207225(rs.getString("telpPegawai207225"));
                    beliCash207225.setPegawai207225(pegawai);

                    Pembeli.setId207225(rs.getInt("id207225"));
                    Pembeli.setNik207225(rs.getString("nik207225"));
                    Pembeli.setNamaPembeli207225(rs.getString("namaPembeli207225"));
                    Pembeli.setAlamatPembeli207225(rs.getString("alamatPembeli207225"));
                    Pembeli.setTelpPembeli207225(rs.getString("telpPembeli207225"));
                    beliCash207225.setPembeli207225(Pembeli);
                    
                    mobil.setId207225(rs.getInt("id207225"));
                    mobil.setNamaMobil207225(rs.getString("nama_mobil207225"));
                    mobil.setMerk207225(rs.getString("merk207225"));
                    mobil.setType207225(rs.getString("type207225"));
                    mobil.setWarna207225(rs.getString("warna207225"));
                    mobil.setHarga207225(rs.getInt("harga207225"));
                    beliCash207225.setMobil207225(mobil);
                    return beliCash207225;
                }

            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        return belicashList;
    }

    @Override
    public BeliCash207225 getById(int id207225) {
        BeliCash207225 beliCash207225 = null;
        try {
            beliCash207225 = (BeliCash207225) jdbcTemplate.query(SQL_SELECT_BELICASH_BY_ID, new Object[]{id207225}, new RowMapper<BeliCash207225>() {
                public BeliCash207225 mapRow(ResultSet rs, int rowNum) throws SQLException {
                    BeliCash207225 beliCash207225 = new BeliCash207225();
                    Pegawai207225 pegawai = new Pegawai207225();
                    Pembeli207225 Pembeli = new Pembeli207225();
                    Mobil207225 mobil = new Mobil207225();
                    beliCash207225.setId207225(rs.getInt("id207225"));
                    beliCash207225.setCashTgl207225(null);//kaga tau gmn penuisannya tanggal
                    beliCash207225.setCashBayar2072225(rs.getString("cashBayar207225"));

                    pegawai.setId207225(rs.getInt("id207225"));
                    pegawai.setNik207225(rs.getString("nik207225"));
                    pegawai.setNamaPegawai207225(rs.getString("namaPegawai207225"));
                    pegawai.setAlamatPegawai207225(rs.getString("alamatPegawai207225"));
                    pegawai.setTelpPegawai207225(rs.getString("telpPegawai207225"));
                    beliCash207225.setPegawai207225(pegawai);

                    Pembeli.setId207225(rs.getInt("id207225"));
                    Pembeli.setNik207225(rs.getString("nik207225"));
                    Pembeli.setNamaPembeli207225(rs.getString("namaPembeli207225"));
                    Pembeli.setAlamatPembeli207225(rs.getString("alamatPembeli207225"));
                    Pembeli.setTelpPembeli207225(rs.getString("telpPembeli207225"));
                    beliCash207225.setPembeli207225(Pembeli);
                    
                    mobil.setId207225(rs.getInt("id207225"));
                    mobil.setNamaMobil207225(rs.getString("nama_mobil207225"));
                    mobil.setMerk207225(rs.getString("merk207225"));
                    mobil.setType207225(rs.getString("type207225"));
                    mobil.setWarna207225(rs.getString("warna207225"));
                    mobil.setHarga207225(rs.getInt("harga207225"));
                    beliCash207225.setMobil207225(mobil);
                    return beliCash207225;
                }

            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        return beliCash207225;
    }

    @Override
    public void insert(BeliCash207225 beliCash207225) {
         try {
            
            jdbcTemplate.update(SQL_INSERT_BELICASH, new Object[]{beliCash207225.getCashTgl207225(), beliCash207225.getCashBayar2072225(), 
                beliCash207225.getPegawai207225().getId207225(),beliCash207225.getPembeli207225().getId207225(),beliCash207225.getMobil207225().getId207225()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public long count() {
        long count = 0;
        try {
            count = jdbcTemplate.queryForObject(SQL_COUNT_BELICASH, null, Long.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

}
