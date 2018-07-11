package co.kr.cache.ehcache.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import co.kr.cache.ehcache.dao.SampleDao;
import co.kr.cache.ehcache.domain.Sample;

@Service
public class SampleService {
	
	@Autowired
	private SampleDao sampleDao;

	//메소드에 캐시 트리거 설정(캐시기능 적용)
    @Cacheable(value = "s_sample", key ="#id")
    public Sample getSample(long id){
        System.out.println("test");
        
        HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("id", id);

        return sampleDao.getSample(parameters);
       
    }

    //캐시되있는 데이터 지우기
    @CacheEvict(value = "d_sample",key ="#id")
    public void deleteSample(long id){
        System.out.println("deleteSample");
    }
}