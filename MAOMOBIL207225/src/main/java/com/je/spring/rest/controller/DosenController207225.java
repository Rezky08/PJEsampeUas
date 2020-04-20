/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.controller;

import com.je.spring.rest.model.Dosen207225;
import com.je.spring.rest.service.DosenService207225;
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
public class DosenController207225 {

    @Autowired
    private DosenService207225 dosenService207225;

    @RequestMapping(value = "/master/dosen207225", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getAll() {

        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            List<Dosen207225> dosenList = dosenService207225.getAll();
            long count = dosenService207225.count();
            respone.put(Constants.LIST, dosenList);
            respone.put(Constants.TOTAL, count);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/dosen207225/{id207225}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getById(@PathVariable("id207225") final int id207225) {
        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            Dosen207225 dosen207225 = dosenService207225.getById(id207225);
            respone.put(Constants.DOSEN_KEY, dosen207225);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/dosen207225", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Map<String, Object> insert(@RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> dosenMap = (Map<String, Object>) request.get(Constants.DOSEN_KEY);
        Dosen207225 dosen207225 = new Dosen207225();
        try {
            dosen207225.setNama207225((String) dosenMap.get("nama207225"));
            dosen207225.setAlamat207225((String) dosenMap.get("alamat207225"));
            dosen207225.setJenkel207225((String) dosenMap.get("jenkel207225"));
            dosen207225.setNohp207225((String) dosenMap.get("nohp207225"));
            System.out.println(dosen207225.getNohp207225());
            dosenService207225.insert(dosen207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/dosen207225/{id207225}", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    Map<String, Object> update(@PathVariable("id207225") final int id207225,
            @RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> dosenMap = (Map<String, Object>) request.get(Constants.DOSEN_KEY);
        Dosen207225 dosen207225 = new Dosen207225();
        try {
            dosen207225.setId207225(id207225);
            dosen207225.setNama207225((String) dosenMap.get("nama207225"));
            dosen207225.setAlamat207225((String) dosenMap.get("alamat207225"));
            dosen207225.setJenkel207225((String) dosenMap.get("jenkel207225"));
            dosen207225.setNohp207225((String) dosenMap.get("nohp207225"));
            dosenService207225.update(dosen207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/dosen207225/{id207225}", method = RequestMethod.DELETE, produces = "application/json")
    public @ResponseBody
    Map<String, Object> delete(@PathVariable("id207225") final int id207225) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Dosen207225 dosen207225 = new Dosen207225();
        try {
            dosen207225.setId207225(id207225);
            dosenService207225.delete(dosen207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }
}
