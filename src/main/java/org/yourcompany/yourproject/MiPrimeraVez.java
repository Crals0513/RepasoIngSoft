/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.sql.SQLOutput;

/**
 *
 * @author casantanal
 */
public class MiPrimeraVez {

    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario("1", "pepe", "pepe", "Mañana");
        System.out.println(bibliotecario.getEmail());
    }
}
