/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabrielle
 */
public abstract class Desafio2 {

    //interface com usuário
    

    public static void main(String[] args) throws Exception{
               
        System.out.println("Olá! Pressione Enter para testar o arquivo!");
        
        Scanner scanner = new Scanner(System.in);
        
        scanner.nextLine();
        ConfirmaLinha.obtemInstancia().confirmaLinhas();        
    }

}

