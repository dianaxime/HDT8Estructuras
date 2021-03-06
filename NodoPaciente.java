/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt8;

import java.text.Collator;

/**
 *
 * @author DIANA
 */

//Diana Ximena de Leon Figueroa 18607
//Fatima Jazmin Albeño Barrios 18060

public class NodoPaciente implements Comparable<NodoPaciente>{
    String nombre;
    String descrip;
    String prioridad;
    Collator comparador = Collator.getInstance();
    
    public NodoPaciente(String name, String desc,String prio){
        nombre=name;
        descrip=desc;
        prioridad=prio;
    }
    public String getname (){
        return this.nombre;
    }
    public String getdes (){
        return this.descrip;
    }
    public String getprior (){
        return this.prioridad;
    }
    public String data(){
        return this.nombre + ", "+ this.descrip + ", " + this.prioridad;
    }

    @Override
    public int compareTo(NodoPaciente o) {
        comparador.setStrength(Collator.SECONDARY);
        return comparador.compare(this.prioridad,o.getprior());
    }
}
