public enum englishMorse {
    //Enumerator that stores the english alphabet letter and the morse code that is attributed to each letter.
    A("a", ".-"),
    B("b", "-..."),
    C("C", "-.-."),
    D("d", "-.."),
    E("e", "."),
    F("f", "..-."),
    G("g", "--."),
    H("h", "...."),
    I("i", ".."),
    J("j", ".---"),
    K("k", "-.-"),
    L("l", ".-.."),
    M("m", "--"),
    N("n", "-."),
    O("o", "---"),
    P("p", ".--."),
    Q("q", "--.-"),
    R("r", ".-."),
    S("s", "..."),
    T("t", "-"),
    U("u", "..-"),
    V("v", "...-"),
    W("w", ".--"),
    X("x", "-..-"),
    Y("y", "-.--"),
    Z("z", "--..");

    private String english;
    private String morse;

    englishMorse(String e, String m){
        this.english = e;
        this.morse = m;
    }


    public String toMorse(){
        return this.morse;
    }

    public String toEnglish(){
        return this.english;
    }
}

/*
public enum englishMorse {
    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--..");

    String morse;
    englishMorse(String m){
        this.morse = m;
    }

    public String toMorse(){
        return morse;
    }
}
*/
