package services;

import java.util.Scanner;

public class RerservaService {
	
public void Regular() {
		
	String dia = "Sim";
	String teclado;
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Sua reserva é para o final de semana? Sim/Não");
    teclado = sc.next();
    
     if (teclado.equalsIgnoreCase(dia)) {
    	System.out.println();
		System.out.println("UAU!!! achamos opções incriveis para você:");
		System.out.println();
		System.out.println("Lakewood possui uma classificação 3!");
		System.out.println("Suas taxas de finais de semana para clientes Regular são R$90");
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println();
		System.out.println("Bridgewood possui uma classificação 4!");
		System.out.println("Suas taxas de finais de semana para clientes Regular são R$60");
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println();
		
		System.out.println("Ridgewood possui uma classificação 5!");
		System.out.println("Suas taxas de finais de semana para clientes Regular são R$150");
		System.out.println();
     } else {
    System.out.println();
	System.out.println("UAU!!! achamos opções incriveis para você:");
	System.out.println();
	System.out.println("Lakewood possui uma classificação 3!");
	System.out.println("Suas taxas de dias de semana para clientes Regular são R$110");
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Bridgewood possui uma classificação 4!");
	System.out.println("Suas taxas de dias de semana para clientes Regular são R$160");
	System.out.println();
	
	System.out.println("*****************************************************");
	System.out.println();
	
	System.out.println("Ridgewood possui uma classificação 5!");
	System.out.println("Suas taxas de dias de semana para clientes Regular são R$220");
     }
	
}



public void fidelidade () {
	
	String dia = "Sim";
	String teclado;
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Sua reserva é para o final de semana? Sim/Não");
    teclado = sc.next();
    if (teclado.equalsIgnoreCase(dia)) {
    
    System.out.println();
	System.out.println("UAU!!! achamos opções incriveis para você:");
	System.out.println();
	System.out.println("Lakewood possui uma classificação 3!");
	System.out.println("Suas taxas de finais de semana para clientes Reward são R$80");
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Bridgewood possui uma classificação 4!");
	System.out.println("Suas taxas de finais de semana para clientes Reward são R$50");
	System.out.println();
	
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Ridgewood possui uma classificação 5!");
	System.out.println("Suas taxas de finais de semana para clientes Reward são R$40");	
	
} else {
	System.out.println();
	System.out.println("UAU!!! achamos opções incriveis para você:");
	System.out.println();
	System.out.println("Lakewood possui uma classificação 3!");
	System.out.println("Suas taxas de dias de semana para clientes Reward são R$80");
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	System.out.println("Bridgewood possui uma classificação 4!");
	System.out.println("Suas taxas de dias de semana para clientes Reward são R$110");
	
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println();
	
	System.out.println("Ridgewood possui uma classificação 5!");
	System.out.println("Suas taxas de dias de semana para clientes Reward são R$100");
}
	
}

}
