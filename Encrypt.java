class Encrypt {
  public String encryptPhrase(String phrase, int key) {
    char[] letters = phrase.toUpperCase().toCharArray();
    for (int i = 0; i < letters.length; i++) {
      char c = letters[i];
      if(c >= 'A' && c <='Z') {
        c = (char)(((c + key - 'A') % 26) + 'A');
        letters[i] = c;
      }
    }
    return new String(letters);
  }
}