public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
        
		if(numero==3)
        //break para o ciclo e não deixa mais ir adiante
			//break;
        //continue continua a partir da condição mas não "imprime ela" (pula)
            continue;
            
		System.out.println(numero);
		
	}
	//Qual a saída no console ?

    }
}