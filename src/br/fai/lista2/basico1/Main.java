package br.fai.lista2.basico1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		Scanner scanner = new Scanner(System.in);
		
		
		Map<Integer, String> mapaCandidatos = new HashMap<>(); 
	    mapaCandidatos.put(1, "João");
	    mapaCandidatos.put(2, "Maria");
	    mapaCandidatos.put(3, "Jose");
	    mapaCandidatos.put(4, "Antonio");
	    mapaCandidatos.put(5, "Tiburssinho");
	    
	    ArrayList<Integer> votosCandidatos= new ArrayList();
	    votosCandidatos.add(0);
	    votosCandidatos.add(0);
	    votosCandidatos.add(0);
	    votosCandidatos.add(0);
	    votosCandidatos.add(0);
	    
	    for (Integer chaveCandidatos : mapaCandidatos.keySet()) {
			int voto=-1;
	    	do {
	    	System.out.println("Digite seu voto: ");
	    	voto = scanner.nextInt();
	    	
	    	if(voto == chaveCandidatos) {
	    		votosCandidatos(chaveCandidatos);
	    	}
	    		
	    	
	    	}while(voto!=0);
	    			}
	    
	 
			
			
		}

	private void votosCandidatos(Integer chaveCandidatos) {
		// TODO Auto-generated method stub
		
	}
	}


