/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service.impl;

import com.je.spring.rest.dao.MobilDao207225;
import com.je.spring.rest.model.Mobil207225;
import com.je.spring.rest.service.MobilService207225;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mobilService207225")
public class MobilServiceImpl207225 implements MobilService207225{

    @Autowired
    MobilDao207225 mobilDao207225;

    
    public List<Mobil207225> getAll() {
        List<Mobil207225> mobilList = new ArrayList<Mobil207225>();
        mobilList = mobilDao207225.getAll();
        return mobilList;
    }

    
    public Mobil207225 getById(int id207225) {
        Mobil207225 mobil207225 = new Mobil207225();
        mobil207225 = mobilDao207225.getById(id207225);
        return mobil207225;
    }

    
    public long count() {
        return mobilDao207225.count();
    }

    @Override
    public void insert(Mobil207225 mobil207225) {
        mobilDao207225.insert(mobil207225);
    }

    @Override
    public void update(Mobil207225 mobil207225) {
        mobilDao207225.update(mobil207225);
    }

    @Override
    public void delete(Mobil207225 mobil207225) {
       mobilDao207225.delete(mobil207225);
    }

}
