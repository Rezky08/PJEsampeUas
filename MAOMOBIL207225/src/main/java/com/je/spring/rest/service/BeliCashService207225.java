/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service;

import com.je.spring.rest.model.BeliCash207225;
import java.util.List;

public interface BeliCashService207225 {
    public List<BeliCash207225> getAll();
    public BeliCash207225 getById(int id207225);
    public void  insert(BeliCash207225 beliCash207225);
    public long count();
}
