package guru.springframework.joke.ChuckNorrisJoke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckJokeConfig {
   
   @Bean
   public ChuckNorrisQuotes chuckNorrisQuotes() {
	   return new ChuckNorrisQuotes();
   }
   
}
