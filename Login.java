/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesprogramación;
import java.util.Scanner;

/**
 *
 * @author raffs
 */
public class Login {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        boolean res = false;
        for (int i = 1; i < 4 && !res; i++) {
            System.out.println("Introduce el nombre de usuario: ");
            String user = sc.nextLine();
            System.out.println("Introduce la contraseña: ");
            String pass = sc.nextLine();
            res = Login(user, pass);
            System.out.println("Intentos: " + i);


        }
            if(!res){
                System.out.println("Chao pescao");
            }
}

    static boolean Login(String user, String pass) {
        if (user.equals("usuario1") && pass.equals("asdfg")) {
            System.out.println("Bienvenido " + user);
            return true;
        }
        return false;
    }
}

