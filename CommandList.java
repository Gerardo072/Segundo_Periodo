package scl.edu.gt;

public class CommandList {
	
	String command 		[] = new String [12];
	String information 	[] = new String [12];
	
	int cantidadDeComandos;
	
	CommandList() {
		
		command[0]="suma";
		command[1]="resta";
		command[2]="multiplicacion";
		command[3]="division";
		command[4]="residuo";
		command[5]="help";
		command[6]="GPU";
		command[7]="Software";
		command[8]="Hardware";
		command[9]="Kernel";
		command[10]="Drives";
		command[11]="exit";
		
		
		
		information[0]= "		El comando puede realzar la suma de dos \n		n�meros ya sean enteres o decimales, el valor \n		a retornar es un doubl�.\n";
		
		information[1]= "       El comando puede realzar la resta de dos \n		n�meros ya sean enteres o decimales, el valor \n		a retornar es un doubl�.\n";
		
		information[2]= "       La multiplicaci�n es una forma\n       de realizar grandes sumas de\n       una manera simplificada y eficiente.\n";
		
		information[3]= "       Es una de las cuatro operaciones\n       b�sicas de la aritm�tica, que da\n        un resultado justo de compartir.\n";
		
		information[4]= "       Un residuo es todo elemento que est�\n     considerado como un desecho al cual hay que\n        eliminar seg�n los tipos de residuo.\n";
		
		information[5]= "		El comando help en cualquier momento para\n     obtener m�s informaci�n sobre el uso y la\n        sintaxis de un comando especifico.\n";
		
		information[6]= "       Es un componente de las tarjetas\n        gr�ficas y sistemas de visualizaci�n que\n        consiste b�sicamente en un procesado.\n";
		
		information[7]= "       Se define comando al mensaje enviado al\n      ordenador por parte del usuario y\n          que va a provocar una respuesta en este.\n";
		
		information[8]= "       Como en cualquier PC, tengas Windows, MacOS o Linux\n      los problemas de hardware pueden aparecer\n      y tendr�s que buscar una soluci�n.\n";
		
		information[9]= "       El comando uname -r muestra\n    el n�mero del kernel de la\n     versi�n de Linux actual. \n";
		
		information[10]="       Para que nos hagamos una idea de\n     lo que realmente hablamos, decir\n     que un driver o controlador de dispositivo.\n";
		
		information[11]="       Si escribimos el comando exit y pulsamos Enter para\n     ejecutarlo desde la l�nea de comandos, veremos c�mo la\n    ventana de CMD o s�mbolo del sistema se cierra autom�ticamente.\n";
		
	}
}
