package controllers;

import models.ModelBurbujaDescendente;
import views.ViewBurbujaDescendente;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerBurbujaDescendente {
    private final ModelBurbujaDescendente model_burbuja_descendente;
    private final ViewBurbujaDescendente view_burbuja_descendente;
    
    public ControllerBurbujaDescendente(ModelBurbujaDescendente model_burbuja_descendente, Object views[]){
        this.model_burbuja_descendente = model_burbuja_descendente;
        this.view_burbuja_descendente = (ViewBurbujaDescendente) views[2];
        initView();
    }
    
    public void initView(){
        view_burbuja_descendente.jtf_users_input.setText("" + model_burbuja_descendente.getNumero_Insertado());
        view_burbuja_descendente.jlb_resultado.setText("" + model_burbuja_descendente.getPromedio());
        view_burbuja_descendente.jbtn_insertar.addActionListener(e -> jbtn_insertarMouseClicked());
        view_burbuja_descendente.jbtn_ascendente.addActionListener(e -> jbtn_ascendenteMouseClicked());
        view_burbuja_descendente.jbtn_descendente.addActionListener(e -> jbtn_descendenteMouseClicked());
        view_burbuja_descendente.jbtn_eliminar.addActionListener(e -> jbtn_eliminarMouseClicked());
        view_burbuja_descendente.jbtn_promedio.addActionListener(e -> jbtn_promedioMouseClicked());
        model_burbuja_descendente.Crear_Modelo_Lista();
        view_burbuja_descendente.jli_lista_numeros.setModel(model_burbuja_descendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_insertarMouseClicked(){
        model_burbuja_descendente.setNumero_Insertado(Double.parseDouble(view_burbuja_descendente.jtf_users_input.getText()));
        model_burbuja_descendente.Insertar_Valor();
    }
    
    public void jbtn_ascendenteMouseClicked(){
        model_burbuja_descendente.Ordenar_Ascendente();
        view_burbuja_descendente.jli_lista_numeros.setModel(model_burbuja_descendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_descendenteMouseClicked(){
        model_burbuja_descendente.Ordenar_Descendente();
        view_burbuja_descendente.jli_lista_numeros.setModel(model_burbuja_descendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_eliminarMouseClicked(){
        model_burbuja_descendente.Eliminar_Valor(view_burbuja_descendente.jli_lista_numeros.getSelectedIndex());
        view_burbuja_descendente.jli_lista_numeros.setModel(model_burbuja_descendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_promedioMouseClicked(){
        model_burbuja_descendente.Promediar_Lista();
        view_burbuja_descendente.jlb_resultado.setText("Promedio: " + model_burbuja_descendente.getPromedio());
    }
}
