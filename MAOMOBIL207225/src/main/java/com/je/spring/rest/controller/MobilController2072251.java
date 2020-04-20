/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.controller;

import com.je.spring.rest.model.Mobil207225;
import com.je.spring.rest.service.MobilService207225;
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
public class MobilController2072251 {

    @Autowired
    private MobilService207225 mobilService207225;

    @RequestMapping(value = "/master/mobil207225", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getAll() {

        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            List<Mobil207225> mobilList = mobilService207225.getAll();
            long count = mobilService207225.count();
            respone.put(Constants.LIST, mobilList);
            respone.put(Constants.TOTAL, count);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/mobil207225/{id207225}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getById(@PathVariable("id207225") final int id207225) {
        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            Mobil207225 mobil207225 = mobilService207225.getById(id207225);
            respone.put(Constants.MOBIL_KEY, mobil207225);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/mobil207225", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Map<String, Object> insert(@RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> mobilMap = (Map<String, Object>) request.get(Constants.MOBIL_KEY);
        Mobil207225 mobil207225 = new Mobil207225();
        try {
            mobil207225.setNamaMobil207225((String) mobilMap.get("nama_mobil207225"));
            mobil207225.setMerk207225((String) mobilMap.get("merk207225"));
            mobil207225.setType207225((String) mobilMap.get("type207225"));
            mobil207225.setWarna207225((String) mobilMap.get("warna207225"));
            mobil207225.setHarga207225((int) mobilMap.get("harga207225"));
            mobilService207225.insert(mobil207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/mobil207225/{id207225}", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    Map<String, Object> update(@PathVariable("id207225") final int id207225,
            @RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> mobilMap = (Map<String, Object>) request.get(Constants.MOBIL_KEY);
        Mobil207225 mobil207225 = new Mobil207225();
        try {
            mobil207225.setId207225(id207225);
            mobil207225.setNamaMobil207225((String) mobilMap.get("nama_mobil207225"));
            mobil207225.setMerk207225((String) mobilMap.get("merk207225"));
            mobil207225.setType207225((String) mobilMap.get("type207225"));
            mobil207225.setWarna207225((String) mobilMap.get("warna207225"));
            mobil207225.setHarga207225((int) mobilMap.get("harga207225"));
            mobilService207225.update(mobil207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/master/mobil207225/{id207225}", method = RequestMethod.DELETE, produces = "application/json")
    public @ResponseBody
    Map<String, Object> delete(@PathVariable("id207225") final int id207225) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Mobil207225 mobil207225 = new Mobil207225();
        try {
            mobil207225.setId207225(id207225);
            mobilService207225.delete(mobil207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }
}
