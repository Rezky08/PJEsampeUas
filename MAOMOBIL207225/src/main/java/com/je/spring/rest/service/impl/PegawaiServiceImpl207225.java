/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service.impl;

import com.je.spring.rest.dao.PegawaiDao207225;
import com.je.spring.rest.model.Pegawai207225;
import com.je.spring.rest.service.PegawaiService207225;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pegawaiService207225")
public class PegawaiServiceImpl207225 implements PegawaiService207225{
    @Autowired
    PegawaiDao207225 pegawaiDao207225;

    
    public List<Pegawai207225> getAll() {
        List<Pegawai207225> pegawaiList = new ArrayList<Pegawai207225>();
        pegawaiList = pegawaiDao207225.getAll();
        return pegawaiList;
    }

    
    public Pegawai207225 getById(int id207225) {
        Pegawai207225 pegawai207225 = new Pegawai207225();
        pegawai207225 = pegawaiDao207225.getById(id207225);
        return pegawai207225;
    }

    
    public long count() {
        return pegawaiDao207225.count();
    }

    @Override
    public void insert(Pegawai207225 pegawai207225) {
        pegawaiDao207225.insert(pegawai207225);
    }

    @Override
    public void update(Pegawai207225 pegawai207225) {
        pegawaiDao207225.update(pegawai207225);
    }

    @Override
    public void delete(Pegawai207225 pegawai207225) {
       pegawaiDao207225.delete(pegawai207225);
    }
}
