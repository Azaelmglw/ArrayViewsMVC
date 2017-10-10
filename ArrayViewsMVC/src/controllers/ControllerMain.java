package controllers;

import models.ModelMain;
import views.*;

/**
 *
 * @author Azael_Mendoza
 */
public class ControllerMain {
    private final ModelMain model_main;
    private final ViewMain view_main;
    private final ViewMayor3Numeros view_mayor3_numeros;
    private final ViewBurbujaAscendente view_burbuja_ascendente;
    private final ViewBurbujaDescendente view_burbuja_descendente;

    public ControllerMain(ModelMain model_main, Object views[]){
        this.model_main = model_main;
        this.view_mayor3_numeros = (ViewMayor3Numeros) views[0];
        this.view_burbuja_ascendente = (ViewBurbujaAscendente) views[1];
        this.view_burbuja_descendente = (ViewBurbujaDescendente) views[2];
        this.view_main =  (ViewMain) views[3];
        initView();
    }
    
    public void initView(){
        this.view_main.setTitle("Vistas MVC con Arrays");
        this.view_main.jbtn_mayor.addActionListener(e -> jbtn_mayorMouseClicked());
        this.view_main.jbtn_burbuja_asc.addActionListener(e -> jbtn_burbuja_ascMouseClicked());
        this.view_main.jbtn_burbuja_desc.addActionListener(e -> jbtn_burbuja_descMouseClicked());
        this.view_main.setLocationRelativeTo(null);
        this.view_main.setVisible(true);
    }
    
    public void jbtn_mayorMouseClicked(){
        view_main.setContentPane(view_mayor3_numeros);
        view_main.revalidate();
        view_main.repaint();
    }
    
    public void jbtn_burbuja_ascMouseClicked(){
        view_main.setContentPane(view_burbuja_ascendente);
        view_main.revalidate();
        view_main.repaint();
    }
    
    public void jbtn_burbuja_descMouseClicked(){
        view_main.setContentPane(view_burbuja_descendente);
        view_main.revalidate();
        view_main.repaint();
    }
}