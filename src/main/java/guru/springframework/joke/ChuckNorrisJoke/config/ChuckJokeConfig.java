package guru.springframework.joke.ChuckNorrisJoke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


public class ChuckJokeConfig {
   
  
   public ChuckNorrisQuotes chuckNorrisQuotes() {
	   return new ChuckNorrisQuotes();
   }
   
}
