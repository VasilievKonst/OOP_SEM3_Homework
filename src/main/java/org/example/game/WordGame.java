package org.example.game;

import java.util.Arrays;
import java.util.List;

public class WordGame extends AbstractGame {
    String alphabetEN = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";

    @Override
    List<String> generateCharList() {
        List<String> charList = Arrays.asList(alphabetEN.split(","));
        return charList;
    }
}
