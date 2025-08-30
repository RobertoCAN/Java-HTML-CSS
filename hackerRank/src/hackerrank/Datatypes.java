package hackerrank;
// github.com/RodneyShag
/**
 * Java tem 8 tipos de dados primitivos; char, boolean, byte, short, int, long, float e double. 
 * Para este exerc�cio, trabalharemos com as primitivas usadas para armazenar valores 
 * inteiros (byte, short, int e long):
 * Um byte � um inteiro com sinal de 8 bits.
 * Um short � um inteiro com sinal de 16 bits.
 * Um int � um inteiro com sinal de 32 bits.
 * Um long � um inteiro com sinal de 64 bits.
 * Dado um inteiro de entrada, voc� deve determinar quais tipos de dados primitivos s�o capazes
 *  de armazenar adequadamente essa entrada.
 *Para come�ar, uma parte da solu��o � fornecida para voc� no editor.
 *
 *Formato de entrada
 *A primeira linha cont�m um inteiro, T, denotando o n�mero de casos de teste.
 *Cada caso de teste, T, � composto por uma �nica linha com um inteiro, n , que pode ser 
 *arbitrariamente grande ou pequeno.
 *Para cada vari�vel de entrada n e dataType primitiva apropriada, voc� deve determinar se as 
 *primitivas fornecidas s�o capazes de armazen�-la. Se sim, imprima:
 *
 *Formato de sa�da
 *Para cada vari�vel de entrada n e dataType primitiva apropriada, voc� deve determinar se as 
 *primitivas fornecidas s�o capazes de armazen�-la. Se sim, imprima:
 *
 *n pode ser encaixado em: tipo de dados
 *
 *Se houver mais de um tipo de dados apropriado, imprima cada um em sua pr�pria linha e ordene-os
 * por tamanho (ou seja: )byte < short <int <long.
 *Se o n�mero n�o puder ser armazenado em uma das quatro primitivas mencionadas, imprima a linha:
 *
 *n n�o pode ser instalado em nenhum lugar. 
 */
import java.util.Scanner;

class Datatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
