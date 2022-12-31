public class Biudzetas {
    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    public void pridetiPajamuIrasa(int i, PajamuIrasas pi1){
        pajamos[i] = pi1;
    }

    public void pridetiIslaiduIrasa(int i, IslaiduIrasas ii1){
        islaidos[i] = ii1;
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
