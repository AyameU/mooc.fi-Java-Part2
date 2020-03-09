public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String word) {
        String newWord = "";

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == this.fromCharacter) {
                newWord += this.toCharacter;
            }
            else {
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }
}
