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
		
		
		
		information[0]= "		El comando puede realzar la suma de dos \n		números ya sean enteres o decimales, el valor \n		a retornar es un doublé.\n";
		
		information[1]= "       El comando puede realzar la resta de dos \n		números ya sean enteres o decimales, el valor \n		a retornar es un doublé.\n";
		
		information[2]= "       La multiplicación es una forma\n       de realizar grandes sumas de\n       una manera simplificada y eficiente.\n";
		
		information[3]= "       Es una de las cuatro operaciones\n       básicas de la aritmética, que da\n        un resultado justo de compartir.\n";
		
		information[4]= "       Un residuo es todo elemento que está\n     considerado como un desecho al cual hay que\n        eliminar según los tipos de residuo.\n";
		
		information[5]= "		El comando help en cualquier momento para\n     obtener más información sobre el uso y la\n        sintaxis de un comando especifico.\n";
		
		information[6]= "       Es un componente de las tarjetas\n        gráficas y sistemas de visualización que\n        consiste básicamente en un procesado.\n";
		
		information[7]= "       Se define comando al mensaje enviado al\n      ordenador por parte del usuario y\n          que va a provocar una respuesta en este.\n";
		
		information[8]= "       Como en cualquier PC, tengas Windows, MacOS o Linux\n      los problemas de hardware pueden aparecer\n      y tendrás que buscar una solución.\n";
		
		information[9]= "       El comando uname -r muestra\n    el número del kernel de la\n     versión de Linux actual. \n";
		
		information[10]="       Para que nos hagamos una idea de\n     lo que realmente hablamos, decir\n     que un driver o controlador de dispositivo.\n";
		
		information[11]="       Si escribimos el comando exit y pulsamos Enter para\n     ejecutarlo desde la línea de comandos, veremos cómo la\n    ventana de CMD o símbolo del sistema se cierra automáticamente.\n";
		
	}
}
