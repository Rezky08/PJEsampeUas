/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service.impl;

import com.je.spring.rest.dao.BeliCashDao207225;
import com.je.spring.rest.model.BeliCash207225;
import com.je.spring.rest.service.BeliCashService207225;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("belicashService")
public class BeliCashServiceImpl207225 implements BeliCashService207225{

    @Autowired
    BeliCashDao207225 BeliCashDao207225;
    
    @Override
    public List<BeliCash207225> getAll() {
         List<BeliCash207225> mobilList = new ArrayList<BeliCash207225>();
        mobilList = BeliCashDao207225.getAll();
        return mobilList;
    }

    @Override
    public BeliCash207225 getById(int id207225) {
        BeliCash207225 beliCash207225 = new BeliCash207225();
        beliCash207225  = BeliCashDao207225 .getById(id207225);
        return beliCash207225 ;
    }

    @Override
    public void insert(BeliCash207225 beliCash207225) {
        BeliCashDao207225.insert(beliCash207225);
    }

    @Override
    public long count() {
       return BeliCashDao207225.count();
    }
    
}
