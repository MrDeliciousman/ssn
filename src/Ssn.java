public class Ssn {

  public static void main(String[] args) {
    char[] input = new char[]{'9','3','6','5','7','8','3','1','2'};
    String str1 = "901-47-9866";
    Ssn ssn = new Ssn();
    ssn.ssnConversion(input);
    ssn.ssnConversion2(str1);

  }

  private String ssnConversion(char[] input) {
    String in = new String(input);
    String string1 = in.substring(0,3);
    String string2 = in.substring(3,5);
    String string3 = in.substring(5,9);
    String format = "-";
    String endResult = string1+format+string2+format+string3;
    System.out.println(endResult);
    return endResult;
  }

  private char[] ssnConversion2(String input){
    input = input.replaceAll("-","");
    char[] convert = input.toCharArray();
    System.out.println(convert);
    return convert;
  }
}
