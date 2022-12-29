public class Biudzetas {
    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    public void pridetiPajamuIrasa(int i, PajamuIrasas pi1){
        pajamos[i].setSuma(pi1.getSuma());
        pajamos[i].setKategorija(pi1.getKategorija());
        pajamos[i].setPozymisArIBanka(pi1.isPozymisArIBanka());
        pajamos[i].setPapildomaInfo(pi1.getPapildomaInfo());
        pajamos[i].setData();
    }

    public void pridetiIslaiduIrasa(int i, int suma, String kategorija, String atsiskaitymoBudas, String papildomaInfo){
        islaidos[i].setSuma(suma);
        islaidos[i].setKategorija(kategorija);
        islaidos[i].setAtsiskaitymoBudas(atsiskaitymoBudas);
        islaidos[i].setPapildomaInfo(papildomaInfo);
        islaidos[i].setDataSuLaiku();
    }

    public void gautiPajamuIrasa(int i){
        System.out.printf("""
                Suma: %d
                Kategorija: %s
                Data: %s
                Ar i banko saskaita: %b
                Papildoma informacija: %s
                """, pajamos[i].getSuma(), pajamos[i].getKategorija(), pajamos[i].getData(),
                pajamos[i].isPozymisArIBanka(), pajamos[i].getPapildomaInfo());
    }

    public void gautiIslaiduIsrasa(int i){
        System.out.printf("""
                Suma: %d
                Kategorija: %s
                Data ir laikas: %s
                Atsiskaitymo budas: %s
                Papildoma informacija: %s
                """, islaidos[i].getSuma(), islaidos[i].getKategorija(), islaidos[i].getDataSuLaiku(),
                islaidos[i].getAtsiskaitymoBudas(), islaidos[i].getPapildomaInfo());
    }
}
