package bangun.ruang;

public class Main {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        
        Bola bola = new Bola();
        bola.r = 7; 
        
        Balok balok = new Balok();
        balok.r = 10;
        balok.p = 5;
        balok.l = 6;
        balok.t =15;
        
        LimasSegitiga limassegitiga = new LimasSegitiga();
        limassegitiga.lalas = 2456;
        limassegitiga.lselubung = 300;
        limassegitiga.t = 50 ;
        
        Tabung tabung = new Tabung();
        tabung.r = 5;
        tabung.t = 10;
        
        bangunRuang.volume();
        bangunRuang.luaspermukaan(); 
        
        bola.volume();
        bola.luaspermukaan();
        
        balok.volume();
        balok.luaspermukaan();
        
        limassegitiga.volume();
        limassegitiga.luaspermukaan();
        
        tabung.volume();
        tabung.luaspermukaan();
    }
}
