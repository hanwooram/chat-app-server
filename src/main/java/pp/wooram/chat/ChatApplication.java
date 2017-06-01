package pp.wooram.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import pp.wooram.chat.room.ChatRoom;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:8081").allowedMethods("*");
			}
		};
	}

	@Bean
	public JedisConnectionFactory jedisConnFactory() {
		JedisConnectionFactory jedisConnFactory = new JedisConnectionFactory();
		return jedisConnFactory;
	}

	@Bean
	public RedisTemplate<String, ChatRoom> redisTemplate(JedisConnectionFactory jedisConnFactory) {
		RedisTemplate<String, ChatRoom> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnFactory);
		return redisTemplate;
	}
}
