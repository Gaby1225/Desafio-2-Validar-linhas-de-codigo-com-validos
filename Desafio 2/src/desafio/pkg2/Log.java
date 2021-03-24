/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.pkg2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Gabrielle
 */
public class Log{
    
    private File log = new File("Log.txt");
    
    ArrayList<String> listaLog = new ArrayList<String>(); 
    
    
    static private Log _instancia;   
    
    Log() throws Exception {
    }    
    
    public static Log obtemInstancia() throws Exception{
        if(_instancia == null){
            _instancia = new Log();            
        }
        return _instancia;
    }
    public void Salvar(String stringLog) throws Exception {
        try {
            FileWriter writer = new FileWriter(log, true);
            
            BufferedWriter bw = new BufferedWriter(writer);
            if (!log.createNewFile()) {
                bw.append(stringLog + System.lineSeparator());
                bw.close();
                //writer.write(stringLog + System.lineSeparator());
                //writer.close();
            }
            else
            {
                bw.append(stringLog + System.lineSeparator());
                bw.close();
                //writer.write(stringLog + System.lineSeparator());
                //writer.close();
            }
        } catch (Exception e) {
            throw new Exception("Algo de errado não está certo...");
        }
    }
}
