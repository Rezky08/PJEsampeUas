/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service.impl;

import com.je.spring.rest.dao.DosenDao207225;
import com.je.spring.rest.model.Dosen207225;
import com.je.spring.rest.service.DosenService207225;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dosenService207225")
public class DosenServiceImpl207225 implements DosenService207225{

    @Autowired
    DosenDao207225 dosenDao207225;

    
    public List<Dosen207225> getAll() {
        List<Dosen207225> dosenList = new ArrayList<Dosen207225>();
        dosenList = dosenDao207225.getAll();
        return dosenList;
    }

    
    public Dosen207225 getById(int id207225) {
        Dosen207225 dosen207225 = new Dosen207225();
        dosen207225 = dosenDao207225.getById(id207225);
        return dosen207225;
    }

    
    public long count() {
        return dosenDao207225.count();
    }

    @Override
    public void insert(Dosen207225 dosen207225) {
        dosenDao207225.insert(dosen207225);
    }

    @Override
    public void update(Dosen207225 dosen207225) {
        dosenDao207225.update(dosen207225);
    }

    @Override
    public void delete(Dosen207225 dosen207225) {
       dosenDao207225.delete(dosen207225);
    }

}
