/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.controller;

import com.je.spring.rest.model.Pegawai207225;
import com.je.spring.rest.service.PegawaiService207225;
import com.je.spring.rest.util.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PegawaiController207225 {
    @Autowired
    private PegawaiService207225 pegawaiService207225;

    @RequestMapping(value = "/master/pegawai207225", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getAll() {

        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            List<Pegawai207225> pegawaiList = pegawaiService207225.getAll();
            long count = pegawaiService207225.count();
            respone.put(Constants.LIST, pegawaiList);
            respone.put(Constants.TOTAL, count);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pegawai207225/{id207225}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getById(@PathVariable("id207225") final int id207225) {
        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            Pegawai207225 pegawai207225 = pegawaiService207225.getById(id207225);
            respone.put(Constants.PEGAWAI_KEY, pegawai207225);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pegawai207225", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Map<String, Object> insert(@RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> pegawaiMap = (Map<String, Object>) request.get(Constants.PEGAWAI_KEY);
        Pegawai207225 pegawai207225 = new Pegawai207225();
        try {
            pegawai207225.setNik207225((String) pegawaiMap.get("nik207225"));
            pegawai207225.setNamaPegawai207225((String) pegawaiMap.get("nama_pegawai207225"));
            pegawai207225.setAlamatPegawai207225((String) pegawaiMap.get("alamat_pegawai207225"));
            pegawai207225.setTelpPegawai207225((String) pegawaiMap.get("telp_pegawai207225"));
            pegawaiService207225.insert(pegawai207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pegawai207225/{id207225}", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    Map<String, Object> update(@PathVariable("id207225") final int id207225,
            @RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> pegawaiMap = (Map<String, Object>) request.get(Constants.PEGAWAI_KEY);
        Pegawai207225 pegawai207225 = new Pegawai207225();
        try {
            pegawai207225.setId207225(id207225);
            pegawai207225.setNik207225((String) pegawaiMap.get("nik207225"));
            pegawai207225.setNamaPegawai207225((String) pegawaiMap.get("nama_pegawai207225"));
            pegawai207225.setAlamatPegawai207225((String) pegawaiMap.get("alamat_pegawai207225"));
            pegawai207225.setTelpPegawai207225((String) pegawaiMap.get("telp_pegawai207225"));
            pegawaiService207225.update(pegawai207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pegawai207225/{id207225}", method = RequestMethod.DELETE, produces = "application/json")
    public @ResponseBody
    Map<String, Object> delete(@PathVariable("id207225") final int id207225) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Pegawai207225 pegawai207225 = new Pegawai207225();
        try {
            pegawai207225.setId207225(id207225);
            pegawaiService207225.delete(pegawai207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }
}
