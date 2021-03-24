/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Gabrielle
 */
public class ConfirmaLinha {
    
    ArrayList<String> listaAux = new ArrayList<String>();  
     
    static private ConfirmaLinha _instancia;   
    
    ConfirmaLinha() throws Exception {
    }
    
    public static ConfirmaLinha obtemInstancia() throws Exception{
        if(_instancia == null){
            _instancia = new ConfirmaLinha();            
        }
        return _instancia;
    }
    
    public void confirmaLinhas() throws Exception {
        
        ArrayList<String> arrayTxt = Dao.obtemInstancia().Carregar();
                
        for (String d : arrayTxt){
            
            boolean isValidLine = TestaLinhaValida.obtemInstancia().testaLinhas(d);
            if(isValidLine)
            {
                listaAux.add(d + " - OK");
                Log.obtemInstancia().Salvar(d  + " - OK");
            }
            else
            {
                listaAux.add(d + " - Inválido");
                Log.obtemInstancia().Salvar(d  + " - Inválido");
            }           
        }
        
        Dao.obtemInstancia().Salvar();        
    }
}
