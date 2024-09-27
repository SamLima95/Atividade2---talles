package atividade1;

public class Moto {
    String tipo;
    String vender;
    String cor;
    String ano;
    int velocidadeMaxima;
    boolean isUsado;

    boolean minhaMotoEUsado(){
        return isUsado;
    }

    int qualMinhaVelocidade(){
        return velocidade;
    }

    void acelerar(int novaVelocidade) {
        velocidade = velocidade + novaVelocidade;
    }

    void qualMeuMoto(String ModeloMoto, String corMoto, String anoMoto, String venderMoto){
        tipo = tipoMoto;
        cor = corMoto;
        ano = anoMoto;
        vender = vendaMoto;
    }


    void reduzir(int novaVelocidade){
        velocidade = novaVelocidade;
    }
}
