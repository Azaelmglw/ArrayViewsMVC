package main;

import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author Azael_Mendoza
 */
public class Main {
    
    public static void main (String oamg[]){
        ModelMayor3Numeros model_mayor3_numeros = new ModelMayor3Numeros();
        ViewMayor3Numeros view_mayor3_numeros = new ViewMayor3Numeros();
        
        ModelBurbujaAscendente model_burbuja_ascendente = new ModelBurbujaAscendente();
        ViewBurbujaAscendente view_burbuja_ascendente = new ViewBurbujaAscendente();
        
        ModelBurbujaDescendente model_burbuja_descendente = new ModelBurbujaDescendente();
        ViewBurbujaDescendente view_burbuja_descendente = new ViewBurbujaDescendente();
        
        ModelMain model_main = new ModelMain();
        ViewMain view_main = new ViewMain();
        
        Object views[] = new Object[4];
        views[0] = view_mayor3_numeros ;
        views[1] = view_burbuja_ascendente;
        views[2] = view_burbuja_descendente;
        views[3] = view_main;
        ControllerMain controller_main = new ControllerMain(model_main, views);
        ControllerMayor3Numeros controller_mayor3_numeros = new ControllerMayor3Numeros(model_mayor3_numeros, views);
        ControllerBurbujaAscendente controller_burbuja_ascendente = new ControllerBurbujaAscendente(model_burbuja_ascendente, views);
        ControllerBurbujaDescendente controller_burbuja_descendente = new ControllerBurbujaDescendente(model_burbuja_descendente, views);
    }
}