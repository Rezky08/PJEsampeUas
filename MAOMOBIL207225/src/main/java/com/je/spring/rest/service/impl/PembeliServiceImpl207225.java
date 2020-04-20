/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.service.impl;
import com.je.spring.rest.dao.PembeliDao207225;
import com.je.spring.rest.model.Pembeli207225;
import com.je.spring.rest.service.PembeliService207225;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pembeliService207225")
public class PembeliServiceImpl207225 implements PembeliService207225 {

    @Autowired
    PembeliDao207225 PembeliDao207225;

    @Override
    public List<Pembeli207225> getAll() {
        List<Pembeli207225> PembeliList = new ArrayList<Pembeli207225>();
        PembeliList = PembeliDao207225.getAll();
        return PembeliList;
    }

    @Override
    public Pembeli207225 getById(int id207225) {
        Pembeli207225 pembeli207225 = new Pembeli207225();
        pembeli207225 = PembeliDao207225.getById(id207225);
        return pembeli207225;
    }

    @Override
    public void insert(Pembeli207225 pembeli207225) {
        PembeliDao207225.insert(pembeli207225);
    }

    @Override
    public void update(Pembeli207225 pembeli207225) {
        PembeliDao207225.update(pembeli207225);
    }

    @Override
    public void delete(Pembeli207225 pembeli207225) {
        PembeliDao207225.delete(pembeli207225);
    }

    @Override
    public long count() {
        return PembeliDao207225.count();
    }

}
