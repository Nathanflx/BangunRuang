package bangun.ruang;

public class LimasSegitiga {
    float lalas;
    float lselubung;
    float t;


float volume(){
    float volume = 1/3 * lalas * t;
    System.out.println("Volume Limas Segitiga: "+volume);
    return volume;
}

float luaspermukaan(){
    float luaspermukaan = lalas * lselubung;
    System.out.println("Luas Permukaan Limas Segitiga; "+luaspermukaan);
    return luaspermukaan;
}
}
