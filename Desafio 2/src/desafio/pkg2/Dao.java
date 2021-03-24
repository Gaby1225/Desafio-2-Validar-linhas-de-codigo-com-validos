/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.pkg2;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabrielle
 */
public class Dao{
    
    //Lista onde vai salvar depois de carregar
    
    static private Dao _instancia;    
    private File carrega = new File("java gera prog.txt");
    private File salva = new File("prog-check.txt");
    ArrayList<String> listaLinhas = new ArrayList<String>();  
    
    Dao() throws Exception {
    }
    
    public static Dao obtemInstancia() throws Exception{
        if(_instancia == null){
            _instancia = new Dao();            
        }
        return _instancia;
    }    
    
    public ArrayList<String> Carregar() throws Exception {
        if (carrega.exists()) {
            Scanner scanner = new Scanner(carrega);     
            
            while (scanner.hasNextLine()) {               
                
                listaLinhas.add(scanner.nextLine());
            }            
        }
        else{
            throw new Exception("Arquivo não existe !");
        }
        return listaLinhas;
    }
       
    public void Salvar() throws Exception {
        try {       
            
            FileWriter writer = new FileWriter("prog-check.txt");
            if (!salva.createNewFile()) {
                salva.delete();
                salva.createNewFile();
            }
            
            for (String sv : ConfirmaLinha.obtemInstancia().listaAux) {
                writer.write(sv + System.lineSeparator());                
                //Log.obtemInstancia().Salvar(sv + " - Inserido no prog-check.txt");
            }            
            writer.close();
        } catch (Exception e) {
            throw new Exception("Algo não deu certo !");
        }
    }
}
