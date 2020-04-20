/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service;

import com.je.spring.rest.model.Pegawai207225;
import java.util.List;


public interface PegawaiService207225 {
    public List<Pegawai207225> getAll();

    public Pegawai207225 getById(int id207225);
    public void insert(Pegawai207225 pegawai207225);
    public void update(Pegawai207225 pegawai207225);
    public void delete(Pegawai207225 pegawai207225);

    public long count();
}
