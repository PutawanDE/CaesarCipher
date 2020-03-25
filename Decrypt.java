class Decrypt {
  public String decryptPhrase(String phrase, int key) {
    char[] letters = phrase.toUpperCase().toCharArray();
    for (int i = 0; i < letters.length; i++) {
      char c = letters[i];
      if(c >= 'A' && c <= 'Z') {
        c = (char)(c - (key%26));
        if(c < 'A') {
          c = (char)(c + 26);
        }
        letters[i] = c;
      }
    }
    return new String(letters);
  }
}