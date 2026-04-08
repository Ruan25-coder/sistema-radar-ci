package Sistema_radar;

public class Simulacao {

    public static void main(String[] args){
        System.out.println("Simulação");

        Carro lancer = new Carro("ACLR300", "Comodoro", 76, 0);
        Radar radar = new Radar(60, "Pistao Sul");

        radar.avaliarVelocidade(lancer);

        for(int i = 0; i < 12; i++){
            lancer.acelerar();
        }

        lancer.setVelocidade(-60);

        radar.avaliarVelocidade(lancer);

        lancer.frear();

        radar.avaliarVelocidade(lancer);
    }
}