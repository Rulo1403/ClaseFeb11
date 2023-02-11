package org.Rulo;

public class Clase2 {
    public static void Paciente(String nombre,String genero,int edad,String correoelec,String
            numtele,String tiposangre){
        System.out.println(
                "El paciente se llama" + nombre+ "Es de genero"+ genero +
                        "Tiene "+ edad+ "años"+ "su correo eletronico es :"+correoelec +
                        "el numero telefonico es:"+ numtele + "Su tipo de sangre es:" + tiposangre
        );
    }
    public void registropaciente(){
        Paciente("\n Raul","\n masculino",18,
                "\nRulis@gmail.com","\n 2251105393","\n 0+");
    }
}
