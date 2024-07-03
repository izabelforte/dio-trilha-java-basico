public class ResultadoEscolar {
   public static void main(String[] args) {
      //condiciona encadeada
      // int nota = 10;

      // if (nota >= 7)
      // System.out.println("Aprovado");
      // else if (nota >= 5 && nota < 7)
      // System.out.println("Prova de recuperação");
      // else
      // System.out.println("Reprovado");

      //condicional ternária (composta)
      // int nota = 7;
      // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
      // System.out.println(resultado);

      //condicional ternaria (encadeada)
      int nota = 3;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

   }
}
