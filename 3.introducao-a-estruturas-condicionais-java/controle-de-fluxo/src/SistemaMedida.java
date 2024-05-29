public class SistemaMedida {
    public static void main(String[] args) {
        String siglaMedida = "G";

        //Resolvendo com Swich Case
        switch (siglaMedida) {
            case "P":{
                System.out.println("Pequeno");
                break; //Para cada caso é necessário utilizar um break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }        
            default:{
                System.out.println("Medida Inválida");
                break;
            }
                
        }
    }
}
