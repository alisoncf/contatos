/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Administrador
 */
public final class Util {
    public static String ToSimpleQuotes(String text, String separate){
        return "'" + text + "'" + separate;
    }
    public static String ToDoubleQuotes(String text, String separate){
        return "\"" + text + "\"" + separate;
    }
}
