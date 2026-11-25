package aula_2.exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        boolean resultadoAnd = cond1 && cond3;
        boolean resultadoAndFalso = cond1 && cond2;
        boolean resultadoOr = cond1 || cond2;
        boolean resultadoCombinado = (cond1 || cond2) && cond3;

        System.out.println("cond1 = " + cond1 + ", cond2 = " + cond2 + ", cond3 = " + cond3);
        System.out.println("----------------------------------------");
        System.out.println("cond1 && cond3 (AND): " + resultadoAnd);
        System.out.println("cond1 && cond2 (AND): " + resultadoAndFalso);
        System.out.println("cond1 || cond2 (OR): " + resultadoOr);
        System.out.println("(cond1 || cond2) && cond3: " + resultadoCombinado);
    }
}