public class ExercicioOperadoresRelacionais {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597l;
        long l2 = 8997l;
        byte y1 = 1;
        short h1 = 25;
        // Operadores de Relação //
        // == Igual , != Diferente, > Maior que, < Menor que, >= Maior ou Igual, Menor ou Igual //

        System.out.println("i1 é igual a i2? " + (i1 == i2));
        System.out.println("i1 é diferente de i2? " + (i1 != i2));
        System.out.println("i1 é maior que i2? " + (i1 > i2));
        System.out.println("i1 é menor/igual a i2? " + (i1 <= i2));
        System.out.println("--------------------------------");

        System.out.println("f1 é igual a f2? " + (f1 == f2));
        System.out.println("f1 é diferente de f2? " + (f1 != f2));
        System.out.println("f1 é maior que f2? " + (f1 > f2));
        System.out.println("f1 é menor ou igual f2? " + (f1 <= f2));
        System.out.println("--------------------------------");

        System.out.println("c1 é igual a c2? " + (c1 == c2));
        System.out.println("c1 é diferente de c2? " + (c1 != c2));
        System.out.println("c1 é maior que c2? " + (c1 > c2));
        System.out.println("c1 é menor/igual a c2? " + (c1 <= c2));
        System.out.println("--------------------------------");

        System.out.println("s1 é igual a s2? " + (s1 == s2));
        System.out.println("s1 é diferente de s2? " + (s1 != s2));
        // System.out.println(s1 > s2); Não é possivel comparar por ser uma String
        //  System.out.println(s1 < s2); Não é possivel comparar se é menor por ser uma String
        System.out.println("--------------------------------");

        System.out.println("b1 é igual a b2? " + (b1 == b2));
        System.out.println("b1 é diferente de b2? " + (b1 != b2));
        //System.out.println(b1 > b2); Não é possivel comparar por ser um valor Booleano, que deve retornar se falsa ou verdadeiro
        //System.out.println(b1 <= b2); Não é possivel comparar por ser um valor Booleano, que deve retornar se falsa ou verdadeiro
        System.out.println("--------------------------------");

        System.out.println("i2 é maior que f1? " + (i2 > f1)); //Aqui por exemplo eu posso perguntar por serem tipos numéricos, diferente do s1 != c1//
        System.out.println("d1 é igual a h1? " + (d1 == h1));
        //System.out.println(s1 != c1); São tipos diferentes (String e Char) não é possivel comparar
        //System.out.println(s2 != i1); Não posso perguntar se uma String é diferente de um número
        System.out.println("--------------------------------");

        System.out.println("l1 é igual a i2? " + (l1 == i2));
        System.out.println("l2 é maior ou igual a i1? " + (l2 >= i1));
        System.out.println("y1 é diferente de h1? " + (y1 != h1));

    }
}