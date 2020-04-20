/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service;

import com.je.spring.rest.model.Pembeli207225;
import java.util.List;

public interface PembeliService207225 {
    public List<Pembeli207225> getAll();

    public Pembeli207225 getById(int id207225);

    public void insert(Pembeli207225 pembeli207225);

    public void update(Pembeli207225 pembeli207225);

    public void delete(Pembeli207225 pembeli207225);

    public long count(); 
}
