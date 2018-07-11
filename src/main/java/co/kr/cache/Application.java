package co.kr.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/********************************************************************************************/
/********************************************************************************************
 	<예제>
	https://minwan1.github.io/2018/03/18/2018-03-18-Spring-Cache/
	https://memorynotfound.com/spring-boot-ehcache-2-caching-example-configuration/
*/
/********************************************************************************************/

@SpringBootApplication
// 스프링캐시 선언
@EnableCaching
@MapperScan(value = {"co.kr.cache.**.dao"})
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	
	/*@Bean
	public CacheManager cacheManager() {
		return new EhCacheCacheManager(ehCacheCacheManager().getObject());
	}*/
	
	/**
	 * XML 파일 경로 지정
	 * @return
	 */
	/*@Bean
	public EhCacheManagerFactoryBean ehCacheCacheManager() {
		EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
		factoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
		factoryBean.setShared(true);
		return factoryBean;
	}*/
}