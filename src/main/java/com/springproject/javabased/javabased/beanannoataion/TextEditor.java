package com.springproject.javabased.javabased.beanannoataion;

import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	   private SpellChecker spellChecker;

	   public TextEditor()
	   {
		   System.out.println("texteditor");
	   }
	   public TextEditor(SpellChecker spellChecker2) {
		// TODO Auto-generated constructor stub
		   System.out.println("Inside TextEditor constructor." );
		      this.spellChecker = spellChecker;
	}
	public void spellCheck(){
	      spellChecker.checkSpelling();
	   }
	}