package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen stringdeki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input = "Java her zaman guzel";

        tekrarsizYap(input);


    }

    public static void tekrarsizYap(String input) {

        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","");


        System.out.println(input.substring(0,1));

        for (int i = 0; i < islenecekKelime.length(); i++) {

                if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))) {
                    System.out.print(islenecekKelime.substring(i, i + 1) + ", ");
                    benzersizInput += islenecekKelime.substring(i, i + 1);
                }
        }
        System.out.println();
        System.out.println("input = " + input);
        System.out.println("islenecekKelime = " + islenecekKelime);
        System.out.println("benzersizInput = " + benzersizInput);
    }

//    public static void tekrarsizYap(String input) {
//
//        String benzersizInput="";
//
//        String islenecekKelime=input.replaceAll("\\W",""); // EmsalEfe
//
//        System.out.print(islenecekKelime.substring(0,1)); // E
//        benzersizInput+=islenecekKelime.substring(0,1);  // E
//
//        for (int i = 1; i <islenecekKelime.length() ; i++) {
//
//            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
//
//                System.out.print(", "+ islenecekKelime.substring(i,i+1));
//                benzersizInput+=islenecekKelime.substring(i,i+1);
//            }
//        }
//
//        System.out.println("");
//        System.out.println("inpt: " + input);
//        System.out.println("benzersiz input : " + benzersizInput);
//    }

}
