package src;

import java.util.concurrent.Semaphore;

public class Filosofo extends Thread {
    private int id;
    private Semaphore[] garfos;
    
    public Filosofo(int id) {
        this.id = id;
        this.garfos = JantarDosFilosofos.getGarfos();
    }
    
    public void run() {
        while (true) {
            try {
                pensar();
                pegarGarfos();
                comer();
                largarGarfos();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void pensar() throws InterruptedException {
        System.out.println("Filósofo " + id + " está pensando.");
        Thread.sleep(1000);
    }
    
    private void pegarGarfos() throws InterruptedException {
        int garfoEsquerdo = id;
        int garfoDireito = (id + 1) % JantarDosFilosofos.NUM_FILOSOFOS;
        
        garfos[garfoEsquerdo].acquire();
        garfos[garfoDireito].acquire();
        
        System.out.println("Filósofo " + id + " pegou os garfos.");
    }
    
    private void comer() throws InterruptedException {
        System.out.println("Filósofo " + id + " está comendo.");
        Thread.sleep(1000);
    }
    
    private void largarGarfos() {
        int garfoEsquerdo = id;
        int garfoDireito = (id + 1) % JantarDosFilosofos.NUM_FILOSOFOS;
        
        garfos[garfoEsquerdo].release();
        garfos[garfoDireito].release();
        
        System.out.println("Filósofo " + id + " largou os garfos.");
    }
}
