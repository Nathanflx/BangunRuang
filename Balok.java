package bangun.ruang;

public class Balok {
    float r;
    float p;
    float l;
    float t;
    
    
    float volume(){
        float volume = (float)(p * l * t);
        System.out.println("Volume Balok: "+volume);
        return volume;
    }
    
    float luaspermukaan(){
        float luaspermukaan = p * l * p * t * l * t * 2;
        System.out.println("Luas Permukaan Balok; "+luaspermukaan);
        return luaspermukaan;
    }
}
