package org.example.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordRussianGame extends AbstractGame {
String alphabetRUS = "А,Б,В,Г,Д,Е,Ж,З,И,К,Л,М,Н,О,П,Р,С,Т,У,Ф,Х,Ц,Ч,Ш,Щ,Ъ,Ы,Ь,Э,Ю,Я";
    @Override
    List <String> generateCharList() {
    List<String> charList = Arrays.asList(alphabetRUS.split(","));
    return charList;
    }


}


