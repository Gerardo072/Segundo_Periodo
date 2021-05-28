package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*MENSAJE INCIAL DEL PROGRAMA*/
		Img txtMensaje = new Img();
		txtMensaje.Mensaje();
		
		
		/*ESTADO DEL PLOGRAMA*/
		boolean on = true;
		
		/*INCIO DEL PROGRMA*/
		do {
		
			/*SOLICITANDO UN COMANDO*/
			Scanner inputCommand = new Scanner(System.in);
			System.out.println("");
			System.out.println("~$ ");
			String output = inputCommand.nextLine();
			
			
			/*INSTANCIAS DE CLASES*/
			CommandList dateCommand = new CommandList();
			ArithmeticFunctions fa = new ArithmeticFunctions();
			Tema h = new Tema();
			
			 
			
			if(output.equals(dateCommand.command[0])) {
				fa.sumar();
			}else if (output.equals(dateCommand.command[1])) {
				fa.restar();
			}else if (output.equals(dateCommand.command[2])) {
				fa.multiplicar();
			}else if (output.equals(dateCommand.command[3])) {
				fa.division();
			}else if (output.equals(dateCommand.command[4])) {
				fa.residuo();
			}else if (output.equals(dateCommand.command[5])) {
			
				Hellp hellp = new Hellp();
				
				hellp.CommandList();
				
				if(output.equals(dateCommand.command[6])) {
					h.GPU();
				}else if (output.equals(dateCommand.command[7])) {
					h.Software();
				}else if (output.equals(dateCommand.command[8])) {
					h.Hardware();
				}else if (output.equals(dateCommand.command[9])) {
					h.Kernel();
				}else if (output.equals(dateCommand.command[10])) {
					h.Drives();
					
				}else if (output.equals(dateCommand.command[11])) {
					on = false;
				}
				
			 
				else {System.out.println("Ingresa help para más información");
				}
				
			}
		}while(on);
		
		
		
		System.out.println("Programa finalizado");
		
		
		
	}
}
     