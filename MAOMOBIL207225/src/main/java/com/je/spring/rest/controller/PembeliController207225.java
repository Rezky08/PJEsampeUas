/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.controller;

import com.je.spring.rest.model.Pembeli207225;
import com.je.spring.rest.service.PembeliService207225;
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
public class PembeliController207225 {
    @Autowired
    private PembeliService207225 pembeliService207225;

    @RequestMapping(value = "/master/pembeli207225", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getAll() {

        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            List<Pembeli207225> pembeliList = pembeliService207225.getAll();
            long count = pembeliService207225.count();
            respone.put(Constants.LIST, pembeliList);
            respone.put(Constants.TOTAL, count);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pembeli207225/{id207225}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getById(@PathVariable("id207225") final int id207225) {
        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            Pembeli207225 pembeli207225 = pembeliService207225.getById(id207225);
            respone.put(Constants.PEMBELI_KEY, pembeli207225);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pembeli207225", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Map<String, Object> insert(@RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> pembeliMap = (Map<String, Object>) request.get(Constants.PEMBELI_KEY);
        Pembeli207225 pembeli207225 = new Pembeli207225();
        try {
            pembeli207225.setNik207225((String) pembeliMap.get("nik207225"));
            pembeli207225.setNamaPembeli207225((String) pembeliMap.get("namaPembeli207225"));
            pembeli207225.setAlamatPembeli207225((String) pembeliMap.get("alamatPembeli207225"));
            pembeli207225.setTelpPembeli207225((String) pembeliMap.get("telpPembeli207225"));
            pembeliService207225.insert(pembeli207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pembeli207225/{id207225}", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    Map<String, Object> update(@PathVariable("id207225") final int id207225,
            @RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> pembeliMap = (Map<String, Object>) request.get(Constants.PEMBELI_KEY);
        Pembeli207225 pembeli207225 = new Pembeli207225();
        try {
            pembeli207225.setId207225(id207225);
              pembeli207225.setNik207225((String) pembeliMap.get("nik207225"));
            pembeli207225.setNamaPembeli207225((String) pembeliMap.get("namaPembeli207225"));
            pembeli207225.setAlamatPembeli207225((String) pembeliMap.get("alamatPembeli207225"));
            pembeli207225.setTelpPembeli207225((String) pembeliMap.get("telpPembeli207225"));
            pembeliService207225.update(pembeli207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/pembeli207225/{id207225}", method = RequestMethod.DELETE, produces = "application/json")
    public @ResponseBody
    Map<String, Object> delete(@PathVariable("id207225") final int id207225) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Pembeli207225 pembeli207225 = new Pembeli207225();
        try {
            pembeli207225.setId207225(id207225);
            pembeliService207225.delete(pembeli207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }
}
