import java.io.Console;
import java.util.ArrayList;

public class calculadora {
    private static Console csnl;

    public static void main(String[] args) {

        csnl = System.console();

        System.out.println(
                "Digite o número correspondente se quer trabalhar com 2 ou 3 dimensões:\n" + "1-2D\n" + "2-3D");
        int num = Integer.parseInt(csnl.readLine());

        if (num == 1) {
            method2d();
        }

    }

    public static void method2d() {
        Double resultado = (double) 0, num1 = (double) 0, num2 = (double) 0;
        ArrayList<Double> listaAngulos = new ArrayList<Double>();

        System.out.println("Digite o número correspondente se quer trabalhar com:\n" + "1-quadrado\n" + "2-retângulo\n"
                + "3-triângulo isósceles\n" + "4-pentágono REGULAR\n" + "5-hexágono REGULAR\n");
        int p1 = Integer.parseInt(csnl.readLine());

        if (p1 == 1 || p1 == 4 || p1 == 5 || p1 == 3) {
            num1 = msgLado(1);
        } else if (p1 == 2) {
            num1 = msgLado(1);
            num2 = msgLado(2);
        }

        System.out.println("Digite o número correspondente se quer trabalhar com:\n" + "1-Área\n" + "2-Perímetro\n"
                + "3-Número de Lados\n" + "4-Ângulos Internos\n");
        int p2 = Integer.parseInt(csnl.readLine());

        if (p1 == 1) {
            if (p2 == 1)
                resultado = num1 * num1;
            else if (p2 == 2)
                resultado = num1 * 4;
            else if (p2 == 3)
                resultado = (double) 4;
            else {
                listaAngulos.clear();
                listaAngulos.add((double) 90);
                listaAngulos.add((double) 90);
                listaAngulos.add((double) 90);
                listaAngulos.add((double) 90);

            }

        } else if (p1 == 2) {
            if (p2 == 1)
                resultado = num1 * num2;
            else if (p2 == 2)
                resultado = num1 * 2 + num2 * (double) 2;
            else if (p2 == 3)
                resultado = (double) 4;
            else {
                listaAngulos.clear();
                listaAngulos.add((double) 90);
                listaAngulos.add((double) 90);
                listaAngulos.add((double) 90);
                listaAngulos.add((double) 90);

            }

        } else if (p1 == 3) {
            if (p2 == 1)
                resultado = num1 * num2 / (double) 2;
            else if (p2 == 2)
                resultado = num1 * (double) 3;
            else if (p2 == 3)
                resultado = (double) 3;
            else {
                listaAngulos.clear();
                listaAngulos.add((double) 60);
                listaAngulos.add((double) 60);
                listaAngulos.add((double) 60);

            }
        } else if (p1 == 4) {
            if (p2 == 1) {
                resultado = num1 / 2;
                resultado = resultado / (0.726) * num1 * 5 / 2;
            } else if (p2 == 2)
                resultado = num1 * (double) 5;
            else if (p2 == 3)
                resultado = (double) 5;
            else {
                listaAngulos.clear();
                listaAngulos.add((double) 108);
                listaAngulos.add((double) 108);
                listaAngulos.add((double) 108);
                listaAngulos.add((double) 108);
                listaAngulos.add((double) 108);

            }
        } else {
            if (p2 == 1) {
                resultado = num1 / 2;
                resultado = Math.pow((Math.pow(num1, 2) - Math.pow(resultado, 2)), 0.5);
                resultado = resultado * num1 / 2;
            } else if (p2 == 2)
                resultado = num1 * 6.0;
            else if (p2 == 3)
                resultado = 6.0;
            else {
                listaAngulos.clear();
                listaAngulos.add(120.0);
                listaAngulos.add(120.0);
                listaAngulos.add(120.0);
                listaAngulos.add(120.0);
                listaAngulos.add(120.0);
                listaAngulos.add(120.0);

            }

        }
    }

    public static Double msgLado(int contLado) {
        System.out.println("\nDigite o tamanho do lado " + contLado + "\n");
        Double num = Double.parseDouble(csnl.readLine());
        return num;
    }

    // public double msgLado(int contLado) {
    // System.out.println("\nDigite o tamanho do lado " +contLado+"\n")
    // int num = Int.parseInt(csnl.readLine());
    // }
}