package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java compile Time'da bunu fark eder ve size izin vermez
        */

        str=null;

 //       System.out.println(str.length());
            // NullPointerException

        Object obj= "Java Java Java";
        Integer sayi= (Integer) obj; // ClassCastException

        /*
        String str2="Hava civa";
        Integer sayi2=str2;

        Java bazi casting islemlerine compile time'da izin vermez

        Ancak bazen syntax uygun olabilir
        bu durumda java kodun calismasina itiraz etmez
        */

        Thread.sleep(3500);
    }
}
