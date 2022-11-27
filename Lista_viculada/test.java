package Lista_viculada;

import java.util.Comparator;

import comparadores.ComparadorApellido;
import comparadores.ComparadorCantidadAlumnos;
import comparadores.ComparadorDni;
import comparadores.ComparadorInt;
import comparadores.ComparadorInverso;
import comparadores.ComparadorMultiple;
import comparadores.ComparadorNombre;
import comparadores.ComparadorString;
public class test {

	public static void main(String[] args) {
		//Ejercicio 4 ejercicio a
		Comparator<Integer>comp2 = new ComparadorInt();
		//Comparator<Integer> compInversoInt = new ComparadorInverso<Integer>(comp2);
		Lista_vinculada<Integer> lsInt= new Lista_vinculada<Integer>(comp2);
		lsInt.insertarOrdenado(10);
		lsInt.insertarOrdenado(21);
		lsInt.insertarOrdenado(1);
		lsInt.insertarOrdenado(5);
		lsInt.insertarOrdenado(11);
		//Ejercicio 4 ejercicio b
		for(int i:lsInt) {
			System.out.println(i);
		}
	
		
		//Ejercicio 4 ejercicio c
		lsInt.eliminarNodo(0);
		lsInt.eliminarOcurrencias(5);
		lsInt.eliminarOcurrencias(11);

		System.out.println("Elementos eliminados");
		for(int i:lsInt) {
			System.out.println(i);
		}
		
				
		//Ejercicio 4 ejercicio d
		
		Comparator<String>compString = new ComparadorString();
		Comparator<String> compInversoString = new ComparadorInverso<String>(compString);
		Lista_vinculada<String> lsString= new Lista_vinculada<String>(compString);
		lsString.insertarOrdenado("Fácil");
		lsString.insertarOrdenado("Es");
		lsString.insertarOrdenado("Parcial");
		lsString.insertarOrdenado("Prog2");
		//Ejercicio 4 ejercicio e
		for(String i:lsString) {
			System.out.println(i);
		}
		//Ejercicio 4 ejercicio f
		System.out.println(lsString.obtenerPrimeraOcurrencia("Parcial"));
		//Ejercicio 4 ejercicio g
		System.out.println(lsString.obtenerPrimeraOcurrencia("Recuperatorio"));
		//Ejercicio 4 ejercicio h
		lsString.setComp(compInversoString);
		for(String i:lsString) {
			System.out.println(i);
		}

		//Ejercicio 4 ejercicio I
		//unicen
		Grupo unicen = new Grupo("Unicen");
		Grupo exactas = new Grupo("Exactas");
		Grupo humanas = new Grupo("Humanas");
		Alumno jonh = new Alumno("Jonh", "Doe", 1200000, 21);
		jonh.addInteres("intercambio");
		unicen.agregarElemento(exactas);
		unicen.agregarElemento(humanas);
		unicen.agregarElemento(jonh);
		Alumno fede = new Alumno("Federico", "Lopez", 35999888, 22);
		fede.addInteres("redes");
		fede.addInteres("php");
		fede.addInteres("java");
		fede.addInteres("Python");
		Alumno juana = new Alumno("Juana", "Garcia", 27123455, 22);
		juana.addInteres("programacion");
		juana.addInteres("php");
		juana.addInteres("java");
		exactas.agregarElemento(fede);
		exactas.agregarElemento(juana);
		Grupo historia = new Grupo("Historia");
		Alumno diaz = new Alumno("Mora", "Diaz", 37124425, 24);
		diaz.addInteres("psicologia");
		diaz.addInteres("Freud");
		humanas.agregarElemento(historia);
		humanas.agregarElemento(diaz);
		Alumno rivas = new Alumno("Flora", "Rivas", 34555111, 27);
		rivas.addInteres("historia");
		rivas.addInteres("antigua");
		Alumno martin = new Alumno("Martin", "Gómez", 34111222, 25);
		martin.addInteres("romanos");
		martin.addInteres("egipcios");
		martin.addInteres("griegos");
		Alumno roman = new Alumno("Román", "Bazán", 34111222, 25);
		roman.addInteres("argentina");
		//olimpiadas
		Grupo olimpiadas = new Grupo("Olimpiadas Matemáticas");
		Grupo matea2 = new Grupo("Matea2");
		Grupo losfibo = new Grupo("LosFibo");
		olimpiadas.agregarElemento(matea2);
		olimpiadas.agregarElemento(losfibo);
		Alumno juarez = new Alumno("Juan", "Juarez", 33222444, 23);
		juarez.addInteres("sucesiones");
		juarez.addInteres("algebra");
		Alumno julio = new Alumno("Julio", "Cesar", 33222111, 26);
		julio.addInteres("sucesiones");
		julio.addInteres("algebra");
		matea2.agregarElemento(juarez);
		matea2.agregarElemento(julio);
		Alumno bernardino = new Alumno("Bernardino", "Rivas", 30987654, 25);
		bernardino.addInteres("matematicas");
		Alumno paso = new Alumno("José", "Paso", 33322112, 22);
		paso.addInteres("problemas");
		Alumno isaac = new Alumno("Isaac", "Newton", 12343565, 25);
		isaac.addInteres("sucesiones");
		losfibo.agregarElemento(bernardino);
		losfibo.agregarElemento(paso);
		losfibo.agregarElemento(isaac);
		
		
		//agregados a la lista universidad
		Comparator<ElementoUniversidad> compCantA = new ComparadorCantidadAlumnos();
		
		Lista_vinculada<ElementoUniversidad> universidad = new Lista_vinculada<ElementoUniversidad>(compCantA);
		universidad.insertarOrdenado(olimpiadas);
		universidad.insertarOrdenado(unicen);
		for(ElementoUniversidad n:universidad) {
			System.out.println(n);
		}
		/*
		Comparator<Alumno> compDni = new ComparadorDni();
		Comparator<Alumno> compApellido = new ComparadorApellido();
		Comparator<Alumno> compNombre = new ComparadorNombre();
		Comparator<Alumno> compNombreApellido = new ComparadorMultiple<Alumno>(compNombre,compApellido);
		Comparator<Alumno> compInversoAlumno = new ComparadorInverso<Alumno>(compNombre);
		Comparator<Alumno> compMul = new ComparadorMultiple<Alumno>(compNombreApellido,compDni);
		Lista_vinculada<Alumno> lsAlumnos= new Lista_vinculada<Alumno>(compInversoAlumno);
		Alumno a2= new Alumno("Mateo", "Alabarez", 1234, 21);
		Alumno a3= new Alumno("Lorenzo", "Mendoza", 123, 21);
		Alumno a4= new Alumno("Alberto", "Calvo", 13, 21);
		Alumno a5= new Alumno("Ramiro", "Sergio", 11111, 21);
		lsAlumnos.insertarOrdenado(a4);
		lsAlumnos.insertarOrdenado(a3);
		lsAlumnos.insertarOrdenado(a2);
		lsAlumnos.insertarOrdenado(a5);
		lsAlumnos.setComp(compMul);
		//System.out.println("Nuevo comparador seteado");
		for(Alumno n:lsAlumnos) {
			System.out.println(n);
		}
		*/

		
		
		
		
		

	}

}
