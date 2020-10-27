/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */

import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordTranslations;
    
    public DictionaryOfManyTranslations() {
        this.wordTranslations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.wordTranslations.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translations = this.wordTranslations.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if (this.wordTranslations.containsKey(word)) {
            ArrayList<String> translations = this.wordTranslations.get(word);
            return translations;
        } else {
            ArrayList<String> emptyTranslations = new ArrayList<>();
            return emptyTranslations;
        }
        
        
        
    }
    
    public void remove(String word) {
        this.wordTranslations.remove(word);
    }
}
