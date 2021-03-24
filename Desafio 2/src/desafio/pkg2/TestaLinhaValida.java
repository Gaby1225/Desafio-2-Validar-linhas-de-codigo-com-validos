/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.pkg2;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Gabrielle
 */
public class TestaLinhaValida {

    //testa linha válida    
    static private TestaLinhaValida _instancia;

    TestaLinhaValida() throws Exception {
    }

    public static TestaLinhaValida obtemInstancia() throws Exception {
        if (_instancia == null) {
            _instancia = new TestaLinhaValida();
        }
        return _instancia;
    }

    public boolean testaLinhas(String linha) throws Exception {
        Stack<Character> pilha = new Stack<Character>();

        int tamanho = linha.toCharArray().length;
        //int tamanhoAbre = 0;
        
        if (tamanho % 2 != 0) {
            return false;
        }
        for (char c : linha.toCharArray()) {

            if (c == '[' || c == '{' || c == '(' || c == '<') {
                pilha.push(c);
                //tamanhoAbre++;
            }//verificar mais entrada que saída e mais saída que entrada
            else {
                switch (c) {
                    case ']':
                        if (pilha.peek() == '[') {
                            pilha.pop();
                            tamanho = tamanho -2;
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (pilha.peek() == '{') {
                            pilha.pop();
                            tamanho = tamanho -2;
                        } else {
                            return false;
                        }
                        break;
                    case '>':
                        if (pilha.peek() == '<') {
                            pilha.pop();
                            tamanho = tamanho -2;
                        } else {
                            return false;                            
                        }
                        break;
                    case ')':
                        if (pilha.peek() == '(') {
                            pilha.pop();
                            tamanho = tamanho -2;
                        } else {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (tamanho >= 1) {
            return false;
        }

        return true;
    }
}
