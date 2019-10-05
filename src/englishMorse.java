public enum englishMorse {
    //Enumerator that stores the english alphabet letter and the morse code that is attributed to each letter.
    A('a', ".-"),
    B('b', "-..."),
    C('C', "-.-."),
    D('d', "-.."),
    E('e', "."),
    F('f', "..-."),
    G('g', "--."),
    H('h', "...."),
    I('i', ".."),
    J('j', ".---"),
    K('k', "-.-"),
    L('l', ".-.."),
    M('m', "--"),
    N('n', "-."),
    O('o', "---"),
    P('p', ".--."),
    Q('q', "--.-"),
    R('r', ".-."),
    S('s', "..."),
    T('t', "-"),
    U('u', "..-"),
    V('v', "...-"),
    W('w', ".--"),
    X('x', "-..-"),
    Y('y', "-.--"),
    Z('z', "--..");

    private char english;
    private String morse;

    englishMorse(char e, String m){
        this.english = e;
        this.morse = m;
    }


    public String toMorse(){
        return this.morse;
    }

    public char toEnglish(){
        return this.english;
    }
}