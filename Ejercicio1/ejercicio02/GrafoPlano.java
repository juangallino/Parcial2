package Ejercicio1.ejercicio02;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class GrafoPlano extends Grafo {


	

	public boolean esPlano(Grafo g, Vertice nodoF){

		ArrayList<verices> checkvertice;

		if(g.gradoEntrada(nodoF)==0 && g.gradoSalida(nodoF)>0){	//si el nodo fuente no tiene ninguna entrada seguimos con sus adyacentes, sino termina ahi ydevuelve false
			
			checkvertice= esPlano(g,g.getAdyacentes(nodoF); 
			if(/* todos los elementos en la lista son iguales*/checkvertice )	return true;} //todos los elementos en la lista son 1 mismo vertice, entocnes es el unico vertice final que pose el grafo y el resultado el true
		else return false;
	}

	public List<Vertices> esPlano(Grafo g, List<Vertices> listaadyacentes){
			List<Verices> verticeFinal;
		for (Vertices vertice : listaadyacentes) {   

			if(g.gradoEntrada(vertice)>0 && g.gradoSalida(vertice)==0) {   //si el nodo en el que estamos tiene arista de llegada pero no de salida, encontramos un nodo final
						verticeFinal.add(vertice);
							return verticeFinal;

			} 			
		else{
			return esPlano(g,g.getAdyacentes(vertice))


		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public List<Ciudad> camino2(Ciudad c1,Ciudad c2,Integer poblacion){
//		List<Ciudad> camino = new ArrayList<Ciudad>();
//		camino.add(c1);
//		return camino2(c1,c2,poblacion,camino,new LinkedHashSet<Ciudad>());		
//	}
//	
//	private List<Ciudad> camino2(Ciudad c1,Ciudad c2,Integer poblacion,List<Ciudad> camino,Set<Ciudad> procesados){
//		List<Ciudad> adyacentes = getAdyacentes(c1);
//		procesados.add(c1);
//		
//		for(Ciudad unaCiudad : adyacentes) {
//			if(unaCiudad.equals(c2)) {
//				camino.add(unaCiudad);
//				return camino;
//			} else {
//				if(unaCiudad.habitantes>=poblacion) {
//					camino.add(unaCiudad);
//					List<Ciudad> hayCamino = camino2(unaCiudad,c2,poblacion,camino,procesados);
//					if(hayCamino!=null && !hayCamino.isEmpty()) return hayCamino;
//					else camino.remove(unaCiudad);
//				}
//			}
//		}
//		return new ArrayList<Ciudad>();
//	}

}
