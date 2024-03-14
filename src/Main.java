import java.sql.SQLOutput;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Labas ");
//        System.out.println("Antanas");
////byte
////// ctrl+ / = commentaras
////        manoamzius = 29;
////        System.out.println(manoamzius);
////        manoamzius = 28;
////        System.out.println(manoamzius
////        );
////short tavotevas = 2024519;
//        int tiesa = 299858546;
//long ilgas = 9988855479895258L;
//float kaina = 40.45F;
//double PI = 4.52085201952;
//boolean somethinglearnt = true;
//boolean wasitEasy = false;
//char aLetter = 'a';
//char numberChar = 8;
//String manoVardas = "Aleksandras";
//String miestas = "Vilnius";
//String darbas = "Bedarbis";
//        System.out.println(" As esu " + manoVardas + " gyvenu " + miestas + " uzsiemu " + darbas);
////if ()
////else
////for ()
////while ()
////switch ()
////
////
//
//if (false) {
//    System.out.println("sako tiesa");
//}else {
//    System.out.println("sako netiesa");
//}
//
//
////
        int min = 1;
        int max = 10;


        String vardas = "Aleksandras";
        String pavarde = "Kozlov";
        short birth = 1994;
        short year = 2024;


        System.out.println(" As esu" + " " + vardas + " " + pavarde + " man greitai bus " + (year - birth) + " Metu ");

        int rndNum = (int) Math.round(Math.random() * 4);//4
        int rndNum2 = (int) Math.round(Math.random() * 4);//3

//        rndNum = 4;
//        rndNum2 = 3;
        System.out.println(rndNum + " " + rndNum2);

        if (rndNum != 0 && rndNum2 != 0) {
            if (rndNum > rndNum2) {
                System.out.println(Math.round((double) rndNum / rndNum2 * 100) / 100.0);
            } else {
                System.out.println(Math.round((double) rndNum2 / rndNum * 100) / 100.0);
            }
        } else {
            System.out.println("dalyba is 0 negalima");
        }
        int num = (int) Math.round(Math.random() * 25);
        int num2 = (int) Math.round(Math.random() * 25);
        int num3 = (int) Math.round(Math.random() * 25);

        System.out.println(num);
        ;
        System.out.println(num2);
        ;
        System.out.println(num3);
        ;
// 10 5001 5000
//        num = 20;
//        num2 = 23;
//        num3 = 16;
        if ((num < num2 && num2 < num3) || (num > num2 && num2 > num3)) {
            System.out.println("vudurinis skaicius yra " + num2);
        }
        if ((num3 < num && num < num2) || (num3 > num && num > num2)) {
            System.out.println("vudurinis skaicius yra " + num);
        }

        if ((num2 < num3 && num3 < num) || (num2 > num3 && num3 > num)) {
            System.out.println("vudurinis skaicius yra " + num3);
        }
        if (num == num2 || num3 == num || num2 == num3) {
            System.out.println(" Yra vienodu skaiciu ");
        }

        int a = (int) (min + Math.round(Math.random() * (max - min)));
        int b = (int) (min + Math.round(Math.random() * (max - min)));
        int c = (int) (min + Math.round(Math.random() * (max - min)));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (a + b > c && c + b > a && c + a > b) {
            System.out.println("Trinkampis gaunasi");
        } else {
            System.out.println("kitas variantas");
        }

        int d = (int) (0 + Math.round(Math.random() * 2));
        a = (int) (0 + Math.round(Math.random() * 2));
        b = (int) (0 + Math.round(Math.random() * 2));
        c = (int) (0 + Math.round(Math.random() * 2));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        if (a == 0) {
            count0++;
        }
        if (a == 1) {
            count1++;
        }
        if (a == 2) {
            count2++;
        }
        if (b == 0) {
            count0++;
        }
        if (b == 1) {
            count1++;
        }
        if (b == 2) {
            count2++;
        }
        if (c == 0) {
            count0++;
        }
        if (c == 1) {
            count1++;
        }
        if (c == 2) {
            count2++;
        }
        if (d == 0) {
            count0++;
        }
        if (d == 1) {
            count1++;
        }
        if (d == 2) {
            count2++;
        }

        System.out.println(count0 + " tiek nuliu " + count1 + " tiek vienetu " + count2 + " tiek dvejetu ");
        System.out.println("5 uzduotis galas ^");

        System.out.println(" 6 uzduotis");
        min = -10;

        max = 10;
        int a1 = (int) (min + Math.round(Math.random() * (max - min)));
        int b2 = (int) (min + Math.round(Math.random() * (max - min)));
        int c3 = (int) (min + Math.round(Math.random() * (max - min)));

//        a1 = 0;
        System.out.println(a1 + " " + b2 + " " + c3);
        if (a1 > 0) {
            System.out.println("[" + a1 + "]");
        }
        if (a1 < 0) {
            System.out.println("{" + a1 + "}");
        }
        if (a1 == 0) {
            System.out.println("(" + a1 + ")");
        }

        if (b2 > 0) {
            System.out.println("[" + b2 + "]");
        }
        if (b2 < 0) {
            System.out.println("{" + b2 + "}");
        }
        if (b2 == 0) {
            System.out.println("(" + b2 + ")");
        }

        if (c3 > 0) {
            System.out.println("[" + c3 + "]");
        }
        if (c3 < 0) {
            System.out.println("{" + c3 + "}");
        }
        if (c3 == 0) {
            System.out.println("(" + c3 + ")");
        }

        System.out.println(" 7-ta uzduotis");

        min = 5;

        max = 3000;
        int x = (int) (min + Math.round(Math.random() * (max - min)));
//        x = 50000;
        System.out.println(" Nupirktu zvakiu kiekis " + x);
        int finalC = 0;
        if (x > 1000 && x <= 2000) {
            finalC = x - (x * 3 / 100);
        } else if (x > 2000) {
            finalC = x - (x * 4 / 100);

        } else {
            finalC = x;
        }
        System.out.println(" Zvakiu kaina su nuolaida " + finalC);

        System.out.println("8tos uzdoties pradzia");

        min = 0;

        max = 100;
        double sk1 = (min + (Math.random() * (max - min)));
        double sk2 = (min + (Math.random() * (max - min)));
        double sk3 = (min + (Math.random() * (max - min)));
        System.out.println(" " + sk1 + " " + sk2 + " " + sk3);
        System.out.println(Math.round(sk1 + sk2 + sk3) / 3 + " pirmas vidurkis ");

//        if (sk1 < 10 || sk1 > 90) {
//            System.out.println(Math.round((sk2 + sk3) / 2));
//        }
//        if (sk2 < 10 || sk2 > 90) {
//            System.out.println(Math.round((sk1 + sk3) / 2));
//
//        }
//
//        if (sk3 < 10 || sk3 > 90) {
//            System.out.println(Math.round((sk1 + sk2) / 2));
//
//        }
//        if (sk3 < 10 || sk3 > 90 && sk1 < 10 || sk1 > 90) {
//            System.out.println(Math.round(sk2));
//        }
//        if (sk2 < 10 || sk2 > 90 && sk1 < 10 || sk1 > 90) {
//            System.out.println(Math.round(sk3));
//        }
//        if (sk3 < 10 || sk3 > 90 && sk2 < 10 || sk2 > 90) {
//            System.out.println(Math.round(sk1));
//
//
//        }
//
//        if ( sk1 > 10 && sk1 <90 && sk2 > 10 && sk2 < 90 && sk3 > 10 && sk3 < 90){
//            System.out.println(Math.round(sk1 + sk2 + sk3) / 3 + " Antras vidurkis ");
//        }


        double sum = 0;
        int count = 0;

        if(sk1 >=10 && sk1 <= 90 ){
            sum += sk1;
            count++;
        }

        if(sk2 >=10 && sk2 <= 90 ){
            sum += sk2;
            count++;
        }

        if(sk3 >=10 && sk3 <= 90 ){
            sum += sk3;
            count++;
        }

        System.out.println(Math.round( sum / count));


////        Open the command line.
//        Set your username: git config --global user.name "Dreallidar"
//        Set your email address: git config --global user.email "Realdreanix@gmail.com"










    }


}

