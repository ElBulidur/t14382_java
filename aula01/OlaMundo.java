package aula01;

public class OlaMundo{
    public static void main (String[] args){
        
        // TIPOS PRIMITIVOS
        byte um = 123; // 8bits
        Short dois = 1234; 
        int tres = 12345;
        long quatro = 123L;

        float quinto = 123.45f;
        double sexto = 123.45d;

        char setimo = '\u004a'; //, 'j';
        boolean oitavo = true;


        // OPERADORES

        // ATRIBUICAO =
        // ADICAO +
        // SUBTRACAO -
        // MULTIPLICACAO *
        // DIVISAO /
        // RESTO DE DIVISAO %
        // Incremento ++
        // Decremento --
        // Logica ? :
        
        // OPERADORES LOGICOS
        // MENOR QUE          <
        // MENOR OU IGUAL     <=
        // MAIOR QUE          >
        // MAIOR OU IGUAL     >=
        // IGUAL              ==
        // DIFERENTE          !=

        // && AND
        // || OR
        // ! NOT

        int hora = 19;

        // CONDICIONAL
        if (hora < 12){
            System.out.println(dois);
        } else if (hora < 18){
            System.out.println(dois);
        }else{
            System.out.println(dois);
        }

        char simbolo = '#';

        switch (simbolo) {
            case '$' : 
            System.out.println("Dola");
            break;
            case '#' : 
            System.out.println("Cerquilha");
            break;
            case '@' : 
            System.out.println("Arroba");
            break;
            default : System.out.println("Simbolo nao encontrado");
        }


        // LOOPS

        var i = 0;

        while (i < 100){
            i++;
            //System.out.println("I:"+ i);
        }

        // Do
        do{
            i++;
            System.out.println("I:"+ i);
        } while(i<100);


        // FOR
        for(int j=0, o=100; j<o; j+=2, o-=3){

            System.out.println("O:"+o);
            System.out.println("J:"+ j);

        }

        System.out.println(dois);
        //System.out.println("De novoo!");
    }
}