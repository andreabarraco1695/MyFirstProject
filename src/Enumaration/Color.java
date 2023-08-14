package Enumaration;

//Versione Semplice
/*
public enum Color{
    RED, GREEN, BLUE;
}
 */

 //Versione più complessa
public enum Color{
    RED("red"), GREEN("green"), BLUE("blue");
    
    private String value;
    
    Color(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
