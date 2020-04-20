/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service;

import com.je.spring.rest.model.Dosen207225;
import java.util.List;

public interface DosenService207225 {
    public List<Dosen207225> getAll();

    public Dosen207225 getById(int id207225);
    public void insert(Dosen207225 dosen207225);
    public void update(Dosen207225 dosen207225);
    public void delete(Dosen207225 dosen207225);

    public long count();
}
