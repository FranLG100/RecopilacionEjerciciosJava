package ejercicio11;

import java.io.IOException;
import java.util.Arrays;

import utilesFran.Amadeus;

public class Triangulo {
	
	private Amadeus amadeus=new Amadeus();
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	/**
	 * Constructor de la clase Triangulo con tres par�metros
	 * @param long_lado1 Longitud del primer lado del tr�angulo
	 * @param long_lado2 Longitud del segundo lado del tr�angulo
	 * @param long_lado3 Longitud del tercer lado del tr�angulo
	 * @throws IOException 
	 * */
	public Triangulo(double long_lado1, double long_lado2, double long_lado3) throws IOException {
		if(long_lado1<0) {
			System.out.println("El lado uno no puede ser negativo. Reintroduzca dato");
			long_lado1=amadeus.controlaDoublePositivo();
		}
		this.long_lado1 = long_lado1;
		if(long_lado2<0) {
			System.out.println("El lado dos no puede ser negativo. Reintroduzca dato");
			long_lado2=amadeus.controlaDoublePositivo();
		}
		this.long_lado2 = long_lado2;
		if(long_lado3<0) {
			System.out.println("El lado tres no puede ser negativo. Reintroduzca dato");
			long_lado3=amadeus.controlaDoublePositivo();
		}
		this.long_lado3 = long_lado3;
	}
	
	
	
	public double getLong_lado1(){
		return long_lado1;
	}



	public void setLong_lado1(double long_lado1) throws IOException {
		if(long_lado1<0) {
			System.out.println("El lado uno no puede ser negativo. Reintroduzca dato");
			long_lado1=amadeus.controlaDoublePositivo();
		}
		this.long_lado1 = long_lado1;
	}



	public double getLong_lado2() {
		return long_lado2;
	}



	public void setLong_lado2(double long_lado2) throws IOException {
		if(long_lado2<0) {
			System.out.println("El lado dos no puede ser negativo. Reintroduzca dato");
			long_lado2=amadeus.controlaDoublePositivo();
		}
		this.long_lado2 = long_lado2;
	}



	public double getLong_lado3() {
		return long_lado3;
	}



	public void setLong_lado3(double long_lado3) throws IOException {
		if(long_lado3<0) {
			System.out.println("El lado tres no puede ser negativo. Reintroduzca dato");
			long_lado3=amadeus.controlaDoublePositivo();
		}
		this.long_lado3 = long_lado3;
	}


	/**
	 * M�todo que compara dos tri�ngulos
	 * @return <ul>
	 * 			<li>true Si los tres lados de ambos tri�ngulos son iguales (no importa el orden)
	 * 			<li>false Si los dos tri�ngulos no tienen los tres lados iguales entre ellos
	 * 			</ul>
	 * */
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		double[] t1= {a.getLong_lado1(), a.getLong_lado2(), a.getLong_lado3()};
		double[] t2= {b.getLong_lado1(), b.getLong_lado2(), b.getLong_lado3()};
		//Todos los lados de cada tri�ngulo son introducidos en arrays, ordenados, y comparados
		Arrays.sort(t1);
		Arrays.sort(t2);
		
		return (t1[0]==t2[0] && t1[1]==t2[1] && t1[2]==t2[2]);
		
	}
	
	
	/**
	 * M�todo que compara un arreglo de tri�ngulos
	 * @return <ul>
	 * 			<li>true Si los tres lados de todos los tri�ngulos son iguales (no importa el orden)
	 * 			<li>false Si todos los tri�ngulos no tienen los tres lados iguales entre ellos
	 * 			</ul>
	 * */
	public boolean compareTo_VTriangulos(Triangulo v[]) {
		//Parecido al anterior. Pero ejecutando el m�todo de comparar con el primer tri�ngulo
		//hacia el resto.
		boolean comprobador=true;
		for (int i = 0; i < v.length; i++) {
				comprobador=v[0].compareTo_Triangulos(v[0], v[i]);
				if(!comprobador)
					break;
		}
		return comprobador;
	}
	
	/**
	 * 
	 * M�todo que retorna el tipo de triangulo ante el cual nos encontramos
	 * @return <ul>
	 * 			<li>1 Tri�ngulo Equil�tero
	 * 			<li>2 Tri�ngulo Is�sceles
	 * 			<li>3 Tri�ngulo Escaleno
	 * 			</ul>
	 * */
	public int tipo_Triangulo() {
		if(long_lado1==long_lado2 && long_lado1==long_lado3)
			return 1;
		else if(long_lado2==long_lado3 || long_lado1==long_lado3 || long_lado2==long_lado1)
			return 2;
		else
			return 3;
	}


}
