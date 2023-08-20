package controller;

public class RecursivaInversão {
	public RecursivaInversão(){
		super();
	}
/*Explicação: Recebe uma String, separa o primeiro caractere, envia o restante da string para a função a inverter e então retorna concatenando ela.
  Tem como condição de parada caso a variável str esteja vazia ou só tenha um caractere.
 */
				
	public String rin (String str) {
		        if (str.isEmpty() || str.length() == 1) {
		            return str;
		        } else {
		            char primeiroCaractere = str.charAt(0);
		            String restante = str.substring(1);
		            String stringInvertida = rin(restante);
		            return stringInvertida + primeiroCaractere;
		        }
		    }
		}
