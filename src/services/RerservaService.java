package services;

import java.util.Scanner;

public class RerservaService {
	
public void Regular() {
		
	String dia = "Sim";
	String teclado;
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Sua reserva � para o final de semana? Sim/N�o");
    teclado = sc.next();
    
     if (teclado.equalsIgnoreCase(dia)) {
    	System.out.println();
		System.out.println("UAU!!! achamos op��es incriveis para voc�:");
		System.out.println();
		System.out.println("Lakewood possui uma classifica��o 3!");
		System.out.println("Suas taxas de finais de semana para clientes Regular s�o R$90");
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println();
		System.out.println("Bridgewood possui uma classifica��o 4!");
		System.out.println("Suas taxas de finais de semana para clientes Regular s�o R$60");
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println();
		
		System.out.println("Ridgewood possui uma classifica��o 5!");
		System.out.println("Suas taxas de finais de semana para clientes Regular s�o R$150");
		System.out.println();
     } else {
    System.out.println();
	System.out.println("UAU!!! achamos op��es incriveis para voc�:");
	System.out.println();
	System.out.println("Lakewood possui uma classifica��o 3!");
	System.out.println("Suas taxas de dias de semana para clientes Regular s�o R$110");
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Bridgewood possui uma classifica��o 4!");
	System.out.println("Suas taxas de dias de semana para clientes Regular s�o R$160");
	System.out.println();
	
	System.out.println("*****************************************************");
	System.out.println();
	
	System.out.println("Ridgewood possui uma classifica��o 5!");
	System.out.println("Suas taxas de dias de semana para clientes Regular s�o R$220");
     }
	
}



public void fidelidade () {
	
	String dia = "Sim";
	String teclado;
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Sua reserva � para o final de semana? Sim/N�o");
    teclado = sc.next();
    if (teclado.equalsIgnoreCase(dia)) {
    
    System.out.println();
	System.out.println("UAU!!! achamos op��es incriveis para voc�:");
	System.out.println();
	System.out.println("Lakewood possui uma classifica��o 3!");
	System.out.println("Suas taxas de finais de semana para clientes Reward s�o R$80");
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Bridgewood possui uma classifica��o 4!");
	System.out.println("Suas taxas de finais de semana para clientes Reward s�o R$50");
	System.out.println();
	
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Ridgewood possui uma classifica��o 5!");
	System.out.println("Suas taxas de finais de semana para clientes Reward s�o R$40");	
	
} else {
	System.out.println();
	System.out.println("UAU!!! achamos op��es incriveis para voc�:");
	System.out.println();
	System.out.println("Lakewood possui uma classifica��o 3!");
	System.out.println("Suas taxas de dias de semana para clientes Reward s�o R$80");
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Bridgewood possui uma classifica��o 4!");
	System.out.println("Suas taxas de dias de semana para clientes Reward s�o R$110");
	
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	
	System.out.println("Ridgewood possui uma classifica��o 5!");
	System.out.println("Suas taxas de dias de semana para clientes Reward s�o R$100");
}
	
}

}
