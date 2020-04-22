/*
 Kelompok 1 = Rezky(20)-Ravi(72)-Alfan(25) 
 */
package com.je.spring.rest.controller;

import com.google.gson.Gson;
import com.je.spring.rest.model.BeliCash207225;
import com.je.spring.rest.model.Mobil207225;
import com.je.spring.rest.model.Pegawai207225;
import com.je.spring.rest.model.Pembeli207225;
import com.je.spring.rest.service.BeliCashService207225;
import com.je.spring.rest.service.MobilService207225;
import com.je.spring.rest.service.PegawaiService207225;
import com.je.spring.rest.service.PembeliService207225;
import com.je.spring.rest.util.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class BeliCashController207225 {

    @Autowired
    private BeliCashService207225 beliCashService207225;

    @Autowired
    private PegawaiService207225 pegawaiService207225;

    @Autowired
    private PembeliService207225 pembeliService207225;

    @Autowired
    private MobilService207225 mobilService207225;

    Gson gson = new Gson();

    @RequestMapping(value = "/transaksi/belicash207225", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getAll() {

        Map<String, Object> respone = new HashMap<String, Object>();

        try {
            List<BeliCash207225> belicashList = beliCashService207225.getAll();
            long count = beliCashService207225.count();
            respone.put(Constants.LIST, belicashList);
            respone.put(Constants.TOTAL, count);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/transaksi/belicash207225/{id207225}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Map<String, Object> getById(@PathVariable("id207225") final int id207225) {
        Map<String, Object> respone = new HashMap<String, Object>();

        try {

            BeliCash207225 beliCash207225 = beliCashService207225.getById(id207225);
            respone.put(Constants.BELICASH_KEY, beliCash207225);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respone;

    }

    @RequestMapping(value = "/transaksi/belicash207225", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Map<String, Object> insert(@RequestBody final Map<String, Object> request) {

        Map<String, Object> respone = new HashMap<String, Object>();
        Map<String, Object> belicashMap = (Map<String, Object>) request.get(Constants.BELICASH_KEY);
        BeliCash207225 beliCash207225 = new BeliCash207225();
        Pegawai207225 pegawai207225 = new Pegawai207225();
        Pembeli207225 pembeli207225 = new Pembeli207225();
        Mobil207225 mobil207225 = new Mobil207225();
        try {
            // Auto Generate Date            
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            //            
            beliCash207225.setCashTgl207225(dateFormat.format(date));
            beliCash207225.setCashBayar2072225((int) belicashMap.get("cashBayar207225"));
            pegawai207225.setId207225((int) belicashMap.get("idPegawai207225"));
            pembeli207225.setId207225((int) belicashMap.get("idPembeli207225"));
            mobil207225.setId207225((int) belicashMap.get("idMobil207225"));
            beliCash207225.setPegawai207225(pegawai207225);
            beliCash207225.setMobil207225(mobil207225);
            beliCash207225.setPembeli207225(pembeli207225);

//            BeliCash207225 beliCash207225 = gson.fromJson(belicashMap.toString(), BeliCash207225.class);
            int pegawaiId = beliCash207225.getPegawai207225().getId207225();
            if (pegawaiService207225.getById(pegawaiId) == null) {
                respone.put(Constants.STATUS, "Pegawai Id not Found");
                return respone;
            }
            int pembeliId = beliCash207225.getPembeli207225().getId207225();
            if (pembeliService207225.getById(pembeliId) == null) {
                respone.put(Constants.STATUS, "Pembeli Id not Found");
                return respone;
            }
            int mobilId = beliCash207225.getMobil207225().getId207225();
            if (mobilService207225.getById(mobilId) == null) {
                respone.put(Constants.STATUS, "Mobil Id not Found");
                return respone;
            }

            beliCashService207225.insert(beliCash207225);
            respone.put(Constants.STATUS, Constants.OK);

        } catch (Exception e) {
            respone.put(Constants.STATUS, Constants.ERROR);
            e.printStackTrace();
        }
        return respone;

    }
}
