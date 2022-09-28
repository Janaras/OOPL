package ooplearn;

class Text {
    private String zagolovok;
    private static String text = "";

    public Text(Word zagolovok) {
        this.zagolovok = zagolovok.getWord();
    }

    public Text(Sentences zagolovk){
        this.zagolovok = zagolovk.getSentences();
    }

    public void addText(Sentences sentences){
        text += sentences;
    }

    public void addToTextWord(Word word){
        text += word;
    }

    public void replaceZagolovok(Sentences sentences){
        zagolovok = sentences.getSentences();
    }

    @Override
    public String toString() {
        return
                "zagolovok='" + zagolovok + '\'' + '\'' +"text: " + text + '\'';
    }
}


