package controllers;

import models.ModelBurbujaAscendente;
import views.ViewBurbujaAscendente;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerBurbujaAscendente {
    private final ModelBurbujaAscendente model_burbuja_ascendente;
    private final ViewBurbujaAscendente view_burbuja_ascendente;
    
    public ControllerBurbujaAscendente(ModelBurbujaAscendente model_burbuja_ascendente, Object views[]){
        this.model_burbuja_ascendente = model_burbuja_ascendente;
        this.view_burbuja_ascendente = (ViewBurbujaAscendente) views[1];
        initView();
    }
    
    public void initView(){
        view_burbuja_ascendente.jtf_users_input.setText("" + model_burbuja_ascendente.getNumero_Insertado());
        view_burbuja_ascendente.jlb_resultado.setText("" + model_burbuja_ascendente.getPromedio());
        view_burbuja_ascendente.jbtn_insertar.addActionListener(e -> jbtn_insertarMouseClicked());
        view_burbuja_ascendente.jbtn_ascendente.addActionListener(e -> jbtn_ascendenteMouseClicked());
        view_burbuja_ascendente.jbtn_promedio.addActionListener(e -> jbtn_promedioMouseClicked());
        model_burbuja_ascendente.Crear_Modelo_Lista();
        view_burbuja_ascendente.jli_lista_numeros.setModel(model_burbuja_ascendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_insertarMouseClicked(){
        model_burbuja_ascendente.setNumero_Insertado(Double.parseDouble(view_burbuja_ascendente.jtf_users_input.getText()));
        model_burbuja_ascendente.Insertar_Valor();
    }
    
    public void jbtn_ascendenteMouseClicked(){
        model_burbuja_ascendente.Ordenar_Ascendente();
        view_burbuja_ascendente.jli_lista_numeros.setModel(model_burbuja_ascendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_promedioMouseClicked(){
        model_burbuja_ascendente.Promediar_Lista();
        view_burbuja_ascendente.jlb_resultado.setText("Promedio: " + model_burbuja_ascendente.getPromedio());
    }
    
}
