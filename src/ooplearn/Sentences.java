package ooplearn;

public class Sentences {
    private String sentences = "";

    public Sentences(Word sentences) {
        this.sentences += sentences;
    }

    public Sentences() {
    }

    public void addWord (Word word){
        sentences += word.getWord();
    }

    public String getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        return sentences;
    }
}
