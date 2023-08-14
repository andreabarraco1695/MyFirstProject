public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double  my_float = 1.5;

        //Una classe wrapper che contiene una sua primitiva e nuove funzionalità
        Double my_float_wrapper = my_float; //Autoboxing convertire primitiva nella sua wrapper

        Integer my_int = 2; //Autoboxing

        String my_str = "ciao";

        System.out.println(my_str);
    
        Integer[] my_array; //array di interi non inizializzato
        my_array = new Integer[10]; //Ho istanziato un array di 10 elementi 

        my_array[0] = 56;

        //char[] my_char_array = new char[10]; //creo e istanzio un array di 10 caratteri
        char[] my_char_array = {'a', 'b', 'c'}; //ho creato e inizializzato con 3 valori un array

        // Controllo di flusso con IF

        if(my_int > 0){
            System.out.println("OK");
        }
        else{
            System.out.println("NO");
        }

        // Controllo di flusso con operatore ternario

        int result = my_int > 0 ? 1 : 0; //Se il valore di my_int è maggiore di 0 allora scrivi 1, altrimenti 0
        System.out.println(result);

        // Controllo di flusso con Switch

        switch(my_int){
            case 0:{
                System.out.println("0");
                break;
            }
            case 1:{
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            default:{
                System.out.println("DEFAULT");
            }
        }
    }

    //List non è una classe, ha bisogno di essere definito come ArrayList o Vector/stack
    List<Integer> arrayList = new ArrayList<Integer>();
}
