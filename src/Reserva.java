import java.util.Scanner;
import services.RerservaService;


public class Reserva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
		Boolean continuar = true;
		
		do {
		System.out.println("OLÁ BEM-VINDO A NOSSA REDE");
		System.out.println();
		System.out.println("TEMOS ALGUMAS PERGUNTAS PARA TE MOSTRAR A MELHOR OPÇÃO DE COMPRA!");
		System.out.println();
		System.out.println("VAMOS LÁ??");
		System.out.println();
		System.out.println("Sair = [0]");
		System.out.println("Que tipo de cliente você é? [1]=Regular ou [2]=Reward");
		int opcao = sc.nextInt();
		RerservaService reservaService = new RerservaService();
	
		

        
        switch(opcao) {
        	case 0:
        		continuar = false;
        		System.out.println("Até a proxima! ;)");
        		break;
        		
        	default:
            	System.out.println("Você escolheu um opções invalida!");
            	System.out.println();
            	break;
            
            case 1:
            	System.out.println();
            System.out.println("Um momento nossos algoritmos estão trabalhando.......");
            reservaService.Regular();
            System.out.println();
            continuar = false;
            	break;
            	
            case 2:
            	System.out.println();
                System.out.println("Um momento nossos algoritmos estão trabalhando.......");
                reservaService.fidelidade();
                System.out.println();
                continuar = false;
                	break;
            	
        }
        
		
		}while(continuar);
	}
	
	}


