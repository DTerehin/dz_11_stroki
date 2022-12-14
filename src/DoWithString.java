public class DoWithString {
    private String myString;
    private boolean sameLetterFlag = false;
    private int[] Mas;
    private String[] strArray;
    private int wNumber;

    public DoWithString(String myString) {
        this.myString = myString;
        strArray = myString.split(" ");
        wNumber = strArray.length;
        Mas = new int[wNumber];
        for (int i = 0; i < wNumber; i++) {
            Mas[i] = strArray[i].length();
        }
    }

    public boolean sameLetter() {
        sameLetterFlag = false;
        int l = myString.length();
        char firstChar = myString.charAt(0);
        char lastChar = myString.charAt(l - 1);
        if (firstChar == lastChar)
            sameLetterFlag = true;
        return sameLetterFlag;
    }

    public int wordsNumber() {
        return wNumber;
    }

    public int[] getMas() {
        return Mas;
    }

    public String biggestWord() {
        int indexBig = 0;
        int start = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > start) {
                indexBig = i;
                start = strArray[i].length();
            }
        }
        return strArray[indexBig];
    }

}



