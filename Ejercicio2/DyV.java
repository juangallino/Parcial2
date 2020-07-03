package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DyV {
    public class ElementoDuplicado {

        public Integer elemtExtra(Integer[] lista1,Integer[] lista2) {		
            return this.elemtExtra(lista1,lista2,lista1[0],lista2[0], lista1.length-1, lista2.length-1);
        }
    
        private Integer elemtExtra(Integer[] lista1, Integer[] lista1,int inicio1,int inicio2, int fin1, int fin2) {
             

           int inicio lista1.Getinicio; //obtengo la pos del primer elemento
            
            int medio1 = (fin1+inicio)/2;    //si tengo la misma distancia de inicio a medio(mismomeido) en ambas lista, el elemento esta extra atras, sino esta adelante
            int medio2 =(fin2+inicio)/2;
            
            if(medio1==medio2){   // mismo medio el extra esta atras
                    elemtExtra(lista1, lista2, meido1, medio2, fin1 ,fin2)
            }
            else{//si los medios son diferentes el extra esta adelante
                elemtExtra(lista1, lista2, inicio, inicio, medio1 ,medio2)
            }
            
       
        }





    
}