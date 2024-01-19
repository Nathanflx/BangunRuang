package bangun.ruang;

class Bola extends Main {
    float r;
    
    float volume(){
        float volume = (float)(4/3 * Math.PI * r * r * r);
        System.out.println("Volume Bola: "+volume);
        return volume;
    }
    
    float luaspermukaan(){
        float luaspermukaan = (float)(4 * Math.PI * r * r);
        System.out.println("Luas Permukaan Bola; "+luaspermukaan);
        return luaspermukaan;
    }
}
