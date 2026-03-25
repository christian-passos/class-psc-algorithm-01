import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos amigos Riley fez na nova cidade? ");
        int amigos = scanner.nextInt(); 
        
        int pontosAlegria = 0; 
        int pontosTristeza = 0;
        int pontosExercicioTristeza = 10;
        int naoRealizados = 0;
        
        if (amigos >= 1) {
            pontosAlegria = amigos * 10;
        } else {
            pontosTristeza = 30;
        }
        System.out.println("Qual foi a nota da Riley na prova A1? ");
        int a1 = scanner.nextInt();

        System.out.println("Qual foi a nota da Riley na prova A2? ");
        int a2 = scanner.nextInt();

        System.out.println("Qual foi a nota da Riley na prova A3? ");
        int a3 = scanner.nextInt();

        double mediaProvas;
        mediaProvas = (a1 + a2 + a3) / 3.0;

        if(mediaProvas >= 7){
            pontosAlegria = pontosAlegria + 50;
        }else{
            pontosTristeza = pontosTristeza + 50;
        }
        System.out.println("Quantos exercícios de programação a Riley fez? ");
        int exercicios = scanner.nextInt();
        if(exercicios >= 1){
            pontosAlegria = pontosAlegria + (exercicios * 10);
        }else{
            naoRealizados = exercicios * pontosExercicioTristeza;
            pontosTristeza = pontosTristeza + naoRealizados;
        }
        if(pontosAlegria > pontosTristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        }else{
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }
        scanner.close();
}
}
