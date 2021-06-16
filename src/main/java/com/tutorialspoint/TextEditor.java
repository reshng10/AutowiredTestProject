package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

    // @autowired property ile olanda setter lazim olmur
    @Autowired
   private SpellChecker spellChecker;



   // @autowired construtor la olanda constructor-arg eliminate olur, esas meqsedimiz budu
    // require=false o demeydiki xml de dependency bean olmasa bele islemeye davam ele
@Autowired
    public TextEditor( SpellChecker spellChecker) {
        System.out.println("inside texteditor cons");
       //   this.spellChecker =spellChecker;

    }


// @autowired setter methodunda autowing=byType i evez eliyir
//@Autowired
//    public void s(SpellChecker spellChecker )
//{
//        this.spellChecker = spellChecker;
//    }


    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}