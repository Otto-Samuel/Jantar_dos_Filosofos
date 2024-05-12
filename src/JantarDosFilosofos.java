package src;

import java.util.concurrent.Semaphore;

public class JantarDosFilosofos {
    static final int NUM_FILOSOFOS = 5;
    static Semaphore[] garfos = new Semaphore[NUM_FILOSOFOS];
    
    public static void main(String[] args) {
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            garfos[i] = new Semaphore(1);
        }
        
        Filosofo[] filosofos = new Filosofo[NUM_FILOSOFOS];
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            filosofos[i] = new Filosofo(i);
            filosofos[i].start();
        }
    }
    
    public static Semaphore[] getGarfos() {
        return garfos;
    }
}
