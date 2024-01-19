package bangun.ruang;

public class Tabung {
    float r;
    float t;
    
    float volume(){
        float volume = (float)(Math.PI * r * r * t);
        System.out.println("Volume Tabung: "+volume);
        return volume;
    }
    
    float luaspermukaan(){
        float luaspermukaan = (float)((r + t) * 2 * Math.PI * r);
        System.out.println("Luas Permukaan Tabung; "+luaspermukaan);
        return luaspermukaan;
    }
}
