package com.techprimers.jpa.springjpahibernateexample.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.OutPutGenerator;
import com.techprimers.jpa.springjpahibernateexample.model.Impacs;
import com.techprimers.jpa.springjpahibernateexample.model.WireTrans;
import com.techprimers.jpa.springjpahibernateexample.repository.ImpacsRepository;
import com.techprimers.jpa.springjpahibernateexample.repository.WireRepository;
@RestController
public class WireResource {
	 private WireRepository wirerepo;

	    public WireResource(WireRepository wererepo) {
	        this.wirerepo = wererepo;
	    }

	    @GetMapping(value = "/allwires")
	    public List<WireTrans> getWires() {
	        return wirerepo.findAll();
	    }
	    
	    @GetMapping("/baifile")
	    public StringBuilder getBAI2file() {
	    List<WireTrans> WireTrans=getWires();
	    OutPutGenerator o = new OutPutGenerator();
	   return  o.GenerateOutput(WireTrans);
	    	
	    }

		
}
