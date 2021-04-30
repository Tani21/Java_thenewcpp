importjava.io.*;
classCRC {
  staticStringdiv(Stringnum1, Stringnum2) {
    intpointer = num2.length();
    String res = num1.substring(0, pointer);
    String rem = "";
    for (inti = 0; i < num2.length(); i++) {
      if (res.charAt(i) == num2.charAt(i)) {
        rem = rem + "0";
      } else {
        rem = rem + "1";
      }
    }
    while (pointer < num1.length()) {
      if (rem.charAt(0) == '0') {
        rem = rem.substring(1, rem.length());
        rem = rem + String.valueOf(num1.charAt(pointer));
        pointer++;
      }
      res = rem;
      rem = "";
      for (inti = 0; i < num2.length(); i++) {
        if (res.charAt(i) == num2.charAt(i)) {
          rem += "0";
        } else {
          rem += "1";
        }
      }
    }
    returnrem.substring(1, rem.length());
  }
  publicstaticvoidmain(String args[]) throws IOException {
    BufferedReader br = newBufferedReader(newInputStreamReader(System.in));
    System.out.print(" Enter Generator: ");
    String gen = br.readLine();
    System.out.print(" Enter Data: ");
    String data = br.readLine();
    String code = data;
    while (code.length() < (data.length() + gen.length() - 1)) code = code + "0";
    code = data + div(code, gen);
    System.out.println(" The transmitted code bitsare: " + code);
    System.out.print(" Enter the received code bits:");
    String rec = br.readLine();
    if (Integer.parseInt(div(rec, gen)) == 0) {
      System.out.println("\nThe received code bitscontains no errors.");
    } else {
      System.out.println("\nThe received code bitscontains errors. ");
    }
  }
}
