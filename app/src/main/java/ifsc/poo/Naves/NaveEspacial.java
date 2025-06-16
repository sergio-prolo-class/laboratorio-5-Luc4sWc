package ifsc.poo.Naves;

import ifsc.poo.Interface.Blindada;

public class NaveEspacial implements Blindada {
    private int id;
    private int velocidadeAtual;
    private static int count;
    private int velocidadeMaxima;
    private boolean emVoo;

    static{
        count = 0;
    }

    public NaveEspacial(int velocidadeAtual,int velocidadeMaxima, boolean emVoo){
        this.id = count++;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.emVoo = emVoo;
    }
    public int acelerar(int aceleracao){
        if(aceleracao + this.velocidadeAtual > velocidadeMaxima){
            System.out.println("Os parafusos estão se desprendendo, tiraaa, tiraaa que eu vou cagar");
            return 0;
        }
        if(!emVoo){
            System.out.println("Você tá no chão meu amigo, vai dar merda, vai dar merda vai, vai da merda vaaaaaaai");
        }
        if(ativarBlindagem()){
            if(aceleracao + this.velocidadeAtual > velocidadeMaxima - 6000000){
                System.out.println("Os parafusos estão se desprendendo, tiraaa, tiraaa que eu vou cagar");
                return 0;
            }
        }
        this.velocidadeAtual += aceleracao;
        return this.velocidadeAtual;
    }

    public int frear(int frenagem){
        if(frenagem - this.velocidadeAtual == 0){
            System.out.println("Paramos!");
            return 0;
        }
        this.velocidadeAtual -= frenagem;
        return this.velocidadeAtual;
    }

    public void decolar(){
        this.emVoo = true;
        System.out.println("Ativando propulsores, aquecendo o motor, Iniciando decolagem em 3,2,1");
    }

    public void pousar(){
        if(!emVoo){
            System.out.println("É complicado....");
            return;
        }
        this.emVoo = false;
        System.out.println("Diminuindo a força dos propulsores, abrindo suportes, Pousando");
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean ativarBlindagem() {
        return true;
    }
}
