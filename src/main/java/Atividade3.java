import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
            int nteste;
            Scanner in = new Scanner(System.in);
            do
            {
                nteste = in.nextInt();
            }while(nteste<1 || nteste>10);
            String strings[] = new String[nteste];
            int valpteste[] = new int[nteste];
            for(int c = 0; c<nteste;c++)
            {
                do
                {
                    strings[c] = in.next();
                }while(strings[c].length()<2 || strings[c].length()>100);
            }
            int somaLetra, multi,fatLetra[] = new int[100],denominador = 1,numerador=1, ValorFinal[] = new int[nteste];

            for(int c = 0; c<nteste;c++)//seleciona a palavra no vetor
            {
                for(int d = 0;d<strings[c].length();d++)//seleciona a letra que servirá como parâmetro
                {
                    somaLetra = 1;
                    multi = 1;
                    for(int e = d+1;e<strings[c].length();d++)//seleciona as outras letras para comparação
                    {
                        if(strings[c].charAt(d)==strings[c].charAt(e))//verifica se letra parâmetro == letra comparação
                        {
                            somaLetra+=1;
                        }
                    }
                    for(int f = somaLetra;f>1;f--)//faz a fatoração do valor SomaLetra
                    {
                        multi *= f;
                    }
                    fatLetra[d] = multi;//retorna o valor da fatoração para o vetor de fatoração
                }
                for(int g = 0;g<fatLetra.length;g++)//multiplica os valores da fatoração
                {
                    denominador *= fatLetra[g];
                }
                for(int h = strings[c].length();h>1;h--)////faz a fatoração da quantidade de letras
                {
                    numerador *= h;
                }
                ValorFinal[c] = numerador/(numerador/denominador);
            }
            for(int i = 0;i<ValorFinal.length;i++)
            {
                System.out.println(ValorFinal[i]);
            }
        }

    }


