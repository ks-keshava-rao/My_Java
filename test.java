import java.util.HashMap;

public class test {
    public void using(){
        System.out.println(getTextSubjectForBrand("AnswerConnect", "888888999"));
    }
    public  String getTextSubjectForBrand(String brandName, String accountNumber) {
    String textSubject = "";

    if (brandName.equals("AnswerConnect") || brandName.equals("AnswerConnect CA")) {
        textSubject = "ANCT";
    } else if (brandName.equals("LexReception") || brandName.equals("LEX Reception")) {
        textSubject = "LEX";
    } else if (brandName.equals("Answer Force") || brandName.equals("AnswerForce CA")) {
        textSubject = "ANFC";
    } else if (brandName.equals("HelloSells")) {
        textSubject = "HSLS";
    } else if (brandName.equals("Synclio")) {
        textSubject = "SYCL";
    } else if (brandName.equals("FranForce")) {
        textSubject = "FNFC";
    } else if (brandName.equals("WellReceived")) {
        textSubject = "WLRC";
    } else if (brandName.equals("ChatSupport")) {
        textSubject = "CS";
    } else if (brandName.equals("ServiceForge CA")) {
        textSubject = "SF";
    } else if (brandName.equals("SignMore")) {
        textSubject = "SM";
    }

    return textSubject + " " + accountNumber;
}
public static void main(String[] args){
  test t = new test();
  t.using();
}
}
