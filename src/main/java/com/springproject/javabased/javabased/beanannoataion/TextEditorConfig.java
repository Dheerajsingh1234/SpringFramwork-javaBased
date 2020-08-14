package com.springproject.javabased.javabased.beanannoataion;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


@Configuration
public class TextEditorConfig {



   @Bean
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

  @Bean
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}
