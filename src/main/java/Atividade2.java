public class Atividade2 {
    public static void main(String[] args) {
        String palavra = "ovo";
        imprimeAnagramas("", palavra);

    }

    public static void imprimeAnagramas(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                imprimeAnagramas(prefix + cur, before + after);
            }
        }
    }


}

