import java.io.Console;

public class calculadora
{
    public void 2D() {
        System.out.println("Digite o número correspondente se quer trabalhar com:\n"+ 
        "1-quadrado\n"+
        "2-retângulo\n"+
        "3-triângulo\n"+
        "4-pentágono\n"+
        "5-hexágono\n")
        int num = Int.parseInt(csnl.readLine());

        if(num==1|num==4|num==5){
            num = msgLado(1);
        }
        else if(num==2 || num==3){
            num=msgLado(1);
            int num2=msgLado(2);
        }

        System.out.println("Digite o número correspondente se quer trabalhar com:\n"+ 
        "1-Área\n"+
        "2-Perímetro\n"+
        "3-Número de Lados\n"+
        "4-Ângulos Internos\n")
        int num = Int.parseInt(csnl.readLine());
    }
    public int msgLado(int contLado) {
        System.out.println("\nDigite o tamanho do lado " +contLado+"\n")
        int num = Int.parseInt(csnl.readLine()); 
    }
    public double msgLado(int contLado) {
        System.out.println("\nDigite o tamanho do lado " +contLado+"\n")
        int num = Int.parseInt(csnl.readLine()); 
    }

    public static void main(String[] args) {

        Console csnl = System.Console();
 
        System.out.println("Digite o número correspondente se quer trabalhar com 2 ou 3 dimensões:\n"+ 
        "1-2D\n"+
        "2-3D")
        int num = Int.parseInt(csnl.readLine());

        if(num==1){
            2D();

        }
        
    }
}