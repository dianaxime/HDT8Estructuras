/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

/**
 *
 * @author DIANA
 */
public class NodoPaciente {
    String nombre;
    String descrip;
    String prioridad;
    
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
}
