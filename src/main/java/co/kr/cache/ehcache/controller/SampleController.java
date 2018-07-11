package co.kr.cache.ehcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.kr.cache.ehcache.domain.Sample;
import co.kr.cache.ehcache.service.SampleService;

@RestController
@RequestMapping(value = "/samples")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/{id}")
    public Sample getSample(@PathVariable long id){
        return sampleService.getSample(id);
    }

    @DeleteMapping("/{id}")
    public String deleteSample(@PathVariable long id){
    	sampleService.deleteSample(id);
        return "test";
    }

}