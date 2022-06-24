/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String aluno = keyboard.nextLine();
        System.out.println("Digite a nota do aluno");
                float nota = keyboard.nextFloat();
        System.out.format("A nota do %s é %.2f \n" , aluno,  nota);
    }
    
}
