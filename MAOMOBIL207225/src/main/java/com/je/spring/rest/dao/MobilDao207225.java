/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.dao;

import com.je.spring.rest.model.Mobil207225;
import java.util.List;

public interface MobilDao207225 {

    public List<Mobil207225> getAll();

    public Mobil207225 getById(int id207225);
    public void insert(Mobil207225 dosen207225);
    public void update(Mobil207225 dosen207225);
    public void delete(Mobil207225 dosen207225);

    public long count();
}
