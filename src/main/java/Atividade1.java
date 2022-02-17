public class Atividade1 {
    public static void main(String[] args){
        String n = "*";
        String saida = "" ;
        String espaco = "     ";

        for(int i = 6; i > 0; i--){
            saida = saida + n;

            if(i > 1) {
                System.out.println( espaco + saida);
                espaco = espaco.substring(0, espaco.length() - 1);
            }else{
                System.out.println(saida);
            }
        }
    }
}
