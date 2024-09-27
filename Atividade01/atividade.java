package atividade1;

public class atividade1 {
    public static void main(String[] args){
        Motocicleta moto = new Motocicleta();
        moto.modelo = "xj";
        moto.velocidade = 50;
        moto.acelerar(50);
        System.out.println(" Impressão 1 -> " + moto.velocidade);

         moto.reduzir(30);
            System.out.println(" Impressão 2 -> " + moto.velocidade);


          moto.qualMinhaMoto("XJ", "Preta", "2020");
          System.out.println(moto.cor + " , " + cmoto.modelo);



          System.out.println(" Impressão 1 -> " + moto.velocidade);
              moto.acelerar(50);
                 System.out.println(" Impressão 2 -> " + moto.velocidade);
  
         int velocidadeMoto = moto.qualMinhaVelocidade();

              System.out.println(" Impressão 3 -> " + moto.qualMinhaVelocidade());




    }
}
