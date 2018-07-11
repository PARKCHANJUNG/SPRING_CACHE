package co.kr.cache.ehcache.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import co.kr.cache.ehcache.domain.Sample;

@Mapper
public interface SampleDao {
	
	public Sample getSample(HashMap<String, Object> parameters);

}
