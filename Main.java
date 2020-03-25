import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean running = true;
    while(running) {
      String phrase;
      int key = 0;

      System.out.print("Enter phrase: ");    
      phrase = input.nextLine();
      System.out.print("Enter key: ");
      try {
        key = Integer.parseInt(input.nextLine());
        if(key <= 0) {
          throw new Exception("Key cannot be negative, or zero.");
        }
      } catch (Exception e) {
        System.out.println("Invalid key..\n" + e.toString());
        input.nextLine();
        continue;              
      }

      System.out.println("Type 1 to encrypt. Type 2 to decrypt. Type 3 to exit");
      int select = 0;
      try {
        select = Integer.parseInt(input.nextLine());
      } catch (Exception e) {
        System.out.println("Invalid input..");
        input.nextLine();
        continue;
      }

      switch(select) {
        case 1:
          Encrypt encrypt = new Encrypt();
          System.out.println("Encrypted: --------");
          System.out.println(encrypt.encryptPhrase
          (phrase, key));
          break;  
        case 2:
          Decrypt decrypt = new Decrypt();
          System.out.println("Decrypted: --------");
          System.out.println(decrypt.decryptPhrase
          (phrase, key));
          break;
        case 3:
          running = false;
          break;
        default:
          System.out.println("Invalid input");   
      }
      System.out.println("***************");
      System.out.println(" ");
    }
    input.close();
  }
}