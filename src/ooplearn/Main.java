package ooplearn;

import tenthTask.Animals;
import tenthTask.Dog;
import tenthTask.Puppy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Word wordzag = new Word("Java");

        Word word = new Word("Java ");
        Sentences sentences = new Sentences(word);
        Sentences sentences1 = new Sentences();

        Text text = new Text(wordzag);

        Word word1 = new Word("is ");
        Word word2 = new Word("best");

        Word word3 = new Word(". Hello ");
        Word word4 = new Word("world.");

        sentences.addWord(word1);
        sentences.addWord(word2);
        sentences1.addWord(word3);
        sentences1.addWord(word4);

        text.addText(sentences);
        text.addText(sentences1);

        System.out.println(text);

    }
}



