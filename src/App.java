import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        String a = "";
        // Calcular("(45 + 45) + 2 - (44 * 34)");
        System.out.println(Contar("(45+45)+2-(83*2)"));

        // for (int indice = 0; indice < 6; indice++) {
        // System.out.println(a + indice);
        // a += " ";
        // }

        // ______________________________________________________________________________Tentativa#1__________________________________________________________________________

        // String b = "";
        // for(int indice = 0; indice <= 5; indice++) {
        // System.out.println(b + indice);
        // b = b.replaceAll("$", " ");
        // }

        // _________________________________________________________________________________Inverso____________________________________________________________________________

        // String b = " ";
        // for(int indice = 5; indice >= 0; indice--) {
        // b = b.replaceAll(" $", "");
        // System.out.println(b + indice);
        // }

        // ______________________________________________________________________Tentativa#2__________________________________________________________________________

        // String a = " ";
        // for (int indice = 0; indice < 6; indice++) {
        // System.out.println(a.repeat(indice) + indice);
        // }

        // ________________________________________________________________________________Inverso#3

        // ______________________________________________________________________Tentativa#3__________________________________________________________________________

        // ______________________________________________________________________Tentativa#4__________________________________________________________________________

        // StringBuilder sb = new StringBuilder(" ");
        // for (int i = 0; i < 6; i++) {
        // sb.setCharAt(i, (char) (48 + i));
        // System.out.println(sb);
        // sb.setCharAt(i, (char) 32);
        // }

        // ______________________________________________________________________Tentativa#5__________________________________________________________________________

        // for (int indice = 0; indice < 26; indice++) {
        // if (indice == 0) {
        // System.out.print(indice);
        // } else if (indice == 4) {
        // System.out.print("\n ");
        // } else if (indice == 5) {
        // System.out.print(1);
        // } else if (indice == 8) {
        // System.out.print("\n ");
        // } else if (indice == 10) {
        // System.out.print(2);
        // } else if (indice == 12) {
        // System.out.print("\n ");
        // } else if (indice == 15) {
        // System.out.print(3);
        // } else if (indice == 16) {
        // System.out.print("\n ");
        // } else if (indice == 20) {
        // System.out.print(4);
        // System.out.print("\n ");
        // } else if (indice == 25) {
        // System.out.print(5);
        // } else {
        // System.out.print(" ");
        // }

        // }

        // ______________________________________________________________________Tentativa#6_______________________________________________________________________

        // for (int indice = 0; indice < 26; indice++) {
        // switch (indice) {
        // case 0:
        // System.out.print(0);
        // break;
        // case 4:
        // System.out.print("\n ");
        // break;
        // case 5:
        // System.out.print(1);
        // break;
        // case 8:
        // System.out.print("\n ");
        // break;
        // case 10:
        // System.out.print(2);
        // break;
        // case 12:
        // System.out.print("\n ");
        // break;
        // case 15:
        // System.out.print(3);
        // break;
        // case 16:
        // System.out.print("\n ");
        // break;
        // case 20:
        // System.out.print(4);
        // System.out.print("\n ");
        // break;
        // case 25:
        // System.out.print(5 + "\n");
        // break;
        //
        // default:
        // System.out.print(" ");
        // break;
        // }
        // }

        // _____________________________________________________________________Tentativa#7____________________________________________________________________

        // for (int i = 0; i < 6; i++) {
        // StringBuilder sb = new StringBuilder(" ");
        // sb.setCharAt(i, (char) (48 + i));
        // System.out.println(sb);
        // }

        // ______________________________________________________________________Reverso#2____________________________________________________________________

        // for (int i = 5; i >= 0; i--) {
        // StringBuilder sb = new StringBuilder(" ");
        // sb.setCharAt(i, (char) (48 + i));
        // System.out.println(sb);
        // }

        // _____________________________________________________________________Tentativa#8____________________________________________________________________

        // for(int indice = 0; indice < 6; indice++) {
        // String a = " ".repeat(indice);
        // System.out.println(a + indice);
        // }
        //

        // __________________________________________________________________________EXERC-2___________________________________________________________________

        // System.out.println("x".repeat(3));
        // System.out.println("x".repeat(2).replace("", " ").trim());
        // System.out.println("x".repeat(3));
        // System.out.println("x".repeat(2).replace("", " ").trim());
        // System.out.println("x".repeat(2).replace("", " ").trim());
        //

        // ____________________________________________________________________Segundo
        // EXERC-2.1________________________________________________________________

        // System.out.println("x".repeat(3) + " " + "x".repeat(3));
        // System.out.println("x".repeat(2).replace("", " ").trim() + " " + "x" + "
        // ".repeat(2) + "x");
        // System.out.println("x".repeat(3) + " " + "x".repeat(3));
        // System.out.println("x".repeat(2).replace("", " ").trim() + " " + "x" + "
        // ".repeat(2) + "x");
        // System.out.println("x".repeat(2).replace("", " ").trim() + " " +
        // "x".repeat(3));

        // __________________________________________________________________Terceiro
        // EXERC - 2.2_______________________________________________________________

        // String l1 = (
        // "x".repeat(2).replace("", " ").trim() + " " +
        // " " + "x".repeat(2) + " ".repeat(2) +
        // "x".repeat(3) + " " +
        // "x".repeat(3) + " " +
        // "x".repeat(3) + " ");
        //
        // String l2 = (
        // "x".repeat(2).replace("", " ").trim() + " " +
        // " " + "x".repeat(2) + " ".repeat(2) +
        // " " + "x" + " ".repeat(2) +
        // "x".repeat(2).replace("", " ").trim() + " " +
        // "x".repeat(2) + " ".repeat(2));
        //
        // String l3 = (
        // " " + "x" + " ".repeat(2) +
        // " " + "x".repeat(2) + " ".repeat(2) +
        // " " + "x" + " ".repeat(2) +
        // "x".repeat(2).replace("", " ").trim() + " " +
        // "x".repeat(2).replace("", " ").trim());
        //
        // String l4 = (
        // " " + "x" + " ".repeat(2) +
        // " " + "x".repeat(2) + " ".repeat(2) +
        // " " + "x" + " ".repeat(2) +
        // "x".repeat(3) + " " +
        // "x".repeat(2).replace("", " ").trim());
        //
        // System.out.println(l1);
        // System.out.println(l2);
        // System.out.println(l3);
        // System.out.println(l4);

    }

    public static int Calcular(String expressao) {
        // Parenteses(expressao);
        expressao = expressao.replaceAll(" ", "");
        String expressaoAux = expressao;
        int contParenteses = 0;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                if (contParenteses == 0) {
                    resultado.append(c);
                }
                contParenteses++;
            } else if (c == ')') {
                contParenteses--;
                resultado.append(c);

                if (contParenteses == 0) {
                    expressaoAux = Contar(expressao);
                    System.out.println(expressaoAux);

                }
            } else if (contParenteses > 0) {

                resultado.append(c);
            }
        }
        System.out.println(expressao);
        // System.out.println(resultado);

        return 1;
    }

    public static String Contar(String expressao) {
        expressao = expressao.replaceAll("[()]", "");
        String[] numeros = expressao.split("\\+|\\*|\\/|\\-");
        String[] operadores = expressao.replaceAll("[0-9]", "").split("");

        StringBuilder resultado = new StringBuilder();
        int i = 0;

        while (i < numeros.length) {
            if (i < operadores.length && operadores[i].equals("*")) {

                int a = Integer.parseInt(numeros[i]) * Integer.parseInt(numeros[i + 1]);
                numeros[i] = String.valueOf(a);

                System.arraycopy(numeros, i + 2, numeros, i + 1, numeros.length - (i + 2));
                System.arraycopy(operadores, i + 1, operadores, i, operadores.length - (i + 1));

                numeros = java.util.Arrays.copyOf(numeros, numeros.length - 1);
                operadores = java.util.Arrays.copyOf(operadores, operadores.length - 1);
            } else {

                resultado.append(numeros[i]);
                if (i < operadores.length) {
                    resultado.append(operadores[i]);
                }
                i++;
            }
        }

        return resultado.toString();
    }

}
