package pratica08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int numero = 0;
    
    private static List<Boolean> vet = new ArrayList<>();
	
	public static void main(String[] args) {
		String originalText = "This is the original text.";
        String someOtherText = " Here is some other text.";
        String littleMoreText = " And a little more text.";
        
        DocumentInstance instance = new DocumentInstance();

        //Adicionando primeiro texto
        instance.write(originalText);
        //Adicionando outro texto
        instance.write(someOtherText);
        

        verificaTeste((originalText + someOtherText), instance);
        instance.undo(1);
        verificaTeste((originalText), instance);

        instance.redo(1);
        verificaTeste((originalText + someOtherText), instance);

        instance.write(littleMoreText);
        verificaTeste((originalText + someOtherText + littleMoreText), instance);

        instance.undo(2);
        verificaTeste((originalText + someOtherText), instance);

        instance.redo(2);
        verificaTeste((originalText + someOtherText + littleMoreText), instance);

        instance.undo(1);
        verificaTeste((originalText + littleMoreText), instance);
        
        instance.undo(2);
        verificaTeste((originalText), instance);

        instance.redo(1);
        verificaTeste((originalText + someOtherText), instance);
        
        instance.redo(1);
        verificaTeste((originalText + someOtherText + someOtherText), instance);
                
        mostraRelatorio();
	}
	

	public static void imprimeMsgTeste(int num, boolean status) {
		vet.add(status);
		if(status == true) {
			System.out.println("Status teste " + num + ": " + "PASSOU");
		}else{
			System.out.println("Status teste " + num + ": " + "NAO PASSOU");						
		}
	}
	
	public static void verificaTeste(String str1, DocumentInstance str2) {
		numero++;
		if(str1.equals(str2.Read())) {
        	imprimeMsgTeste(numero, true);
		}else {
			imprimeMsgTeste(numero, false);
		}
	}
	
	public static void mostraRelatorio() {
		int qtdTotal = 0, qtdSucessos = 0;
		
		qtdTotal = vet.size();
		
		for(int i = 0; i < vet.size(); i++) {
			if(vet.get(i)) {
				qtdSucessos++;
			}
		}
		
		System.out.println("Foram excutados " + qtdTotal + " testes");
		
		System.out.println("O programa teve assertividade de " + (qtdSucessos / (double) qtdTotal) * 100 + " %");
	}
}
