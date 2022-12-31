import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int pajamosCount = -1;
        int islaidosCount = -1;
        PajamuIrasas pi1 = new PajamuIrasas();
        IslaiduIrasas ii1 = new IslaiduIrasas();
        Biudzetas b1 = new Biudzetas();
        Scanner sc = new Scanner(System.in);
        boolean runProgram = true;

        komandos();
        while(runProgram){
            String command = sc.nextLine().toLowerCase();
            switch (command){
                case "pajamos":
                    pajamosCount++;
                    System.out.println("Iveskite pajamu kieki:");
                    pi1.setSuma(Integer.parseInt(sc.nextLine()));
                    System.out.println("Pajamu kategorija:");
                    pi1.setKategorija(sc.nextLine());
                    System.out.println("Ar i banka (true/false)");
                    pi1.setPozymisArIBanka(Boolean.parseBoolean(sc.nextLine()));
                    System.out.println("Papildoma informacija:");
                    pi1.setPapildomaInfo(sc.nextLine());
                    pi1.setData();
                    b1.pridetiPajamuIrasa(pajamosCount, pi1);
                    break;
                case "islaidos":
                    islaidosCount++;
                    System.out.println("Iveskite islaidu kieki:");
                    ii1.setSuma(Integer.parseInt(sc.nextLine()));
                    System.out.println("Islaidu kategorija:");
                    ii1.setKategorija(sc.nextLine());
                    System.out.println("Atsiskaitymo budas:");
                    ii1.setAtsiskaitymoBudas(sc.nextLine());
                    System.out.println("Papildoma informacija:");
                    ii1.setPapildomaInfo(sc.nextLine());
                    ii1.setDataSuLaiku();
                    b1.pridetiIslaiduIrasa(islaidosCount, ii1);
                    break;
                case "isvesti pajamas":
                    System.out.println("Kuria pajamu operacija noretumete matyti? (1 - 100)");
                    int w = Integer.parseInt(sc.nextLine());
                    b1.gautiPajamuIrasa(w - 1);
                    break;
                case "isvesti islaidas":
                    System.out.println("Kuria islaidu operacija noretumete matyti? (1 - 100)");
                    int q = Integer.parseInt(sc.nextLine());
                    b1.gautiIslaiduIsrasa(q - 1);
                    break;
                case "komandos":
                    komandos();
                    break;
                case "stop":
                    runProgram = false;
                    break;
                default:
                    System.out.println("Netinkama ivestis.");
                    break;
            }
        }
        sc.close();
    }

    static void komandos(){
        System.out.printf("""
                pajamos - ivesti naujas pajamas
                islaidos - ivesti naujas islaidas
                isvesti pajamas
                isvesti islaidas
                komandos - komandu sarasas
                stop - nutraukia programos veikima
                """);
    }
}