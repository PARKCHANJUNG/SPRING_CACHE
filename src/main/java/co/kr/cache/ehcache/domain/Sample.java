package co.kr.cache.ehcache.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Sample implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3131400694963477339L;
	private long id;
    private String name;
    private int age;

}