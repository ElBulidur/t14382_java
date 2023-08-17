package aula03.exemplo;

public class AppConsole {
    public static void main (String[] args){
        
        String meses[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL",
        "AGO", "SET", "OUT", "NOV", "DEZ"};

        double valores[] = new double[5];
        
        valores[0] = 1.5;
        valores[1] = 2.0;
        valores[2] = 2.5;
        valores[3] = 3.5;
        valores[4] = 4.5;

        for (String m: meses){
            //System.out.println("mes:"+ m);
        }

        for (double v: valores){
            //System.out.println("Valor:"+ v);
        }


        String s1 = "Curso";
        String s2 = "Java";

        String frase = s1 + s2;

        String fraseDois = new String("Curso Java");
        
        //System.out.println("Frase 01: "+ frase);
        //System.out.println("Frase 02: "+ fraseDois);
        
        StringBuilder fraseTres = new StringBuilder(s1)
        .append(" ")
        .append(s2);

        System.out.println("Frase 01: "+ fraseTres);

        //Funcionario julio = new Funcionario();

        //julio.setNome("Julio Pereira");
        //julio.setSalario(200.90);
        //julio.setSetor("Instrutor");

        //System.out.print(julio);


    }
}
