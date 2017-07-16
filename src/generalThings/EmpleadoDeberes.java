package generalThings;

import java.util.*; // Loads extra utilities


public class EmpleadoDeberes { // The class name must match the file name

	public static void main(String[] args) {

		//1- Escribe un programa que cree variables (con el tipo adecuado) para los datos de un empleado: nombre, edad, salario, indefinido (sí o no). Imprime estos datos uno a uno. Luego construye y muestra un texto usando todas las variables menos la última, de manera que diga algo así: "Pepito tiene 30 años y cobra 2000 euros".
		System.out.println("-------- 1 --------");


		String name = "Pepito";
		int age = 30;
		double salary = 2501;
		boolean indefinido = true;

		System.out.println("El nombre del empleado es: " + name);
		System.out.println("La edad del empleado es: " + age);
		System.out.println("El salario del empleado es: " + salary);
		System.out.println("Indefinico es: " + indefinido);

		System.out.println(name + " tiene " + age + " años y cobra " + salary + " euros");


		//2- Al empleado se le retiene un 20% de su sueldo. Haz que el programa ahora diga cuánto cobra realmente (sueldo neto).
		System.out.println("-------- 2 --------");

		int xcienRetencion = 20;
		double netSalary = salary * (100-xcienRetencion) / 100;

		double importeRetencion = salary - netSalary;

		System.out.println("El salario neto es de: " + netSalary + ", el porcentaje de retencion es de " + xcienRetencion + "%, se han quedado " + importeRetencion + " euros de retencion");


		//3- Supongamos ahora que si el empleado cobra más de 2500 la retención es del 30%. Haz que el programa calcule el sueldo neto teniendo esto en cuenta.
		System.out.println("-------- 3 --------");

		if (salary > 2500) {
			xcienRetencion = 30;
		}

		netSalary = netSalary(xcienRetencion, salary);

		System.out.println("El salario neto es de: " + netSalary + ", el porcentaje de retencion es de " + xcienRetencion + "%, se han quedado " + (salary - netSalary) + " euros de retencion");



		//4- Ahora supongamos que a partir de 3500 la retención sube al 40% (ahora hay 3 tramos: 20%, 30% y 40%).
		System.out.println("-------- 4 --------");

		if (salary > 3500) {
			xcienRetencion = 40;
		}else if (salary > 2500) {
			xcienRetencion = 30;
		}else{
			xcienRetencion = 20;
		}

		netSalary = netSalary(xcienRetencion, salary);

		System.out.println("El salario neto es de: " + netSalary + ", el porcentaje de retencion es de " + xcienRetencion + "%, se han quedado " + (salary - netSalary) + " euros de retencion");



		//5- Ahora construye la frase usando también la variable indefinido, de manera que el texto diga, por ejemplo, "Pepito tiene 30 años, cobra 2000 euros y es indefinido". El texto debería cambiar según el valor de la variable indefinido.
		System.out.println("-------- 5 --------");

		if (indefinido) {
			System.out.println(name + " tiene " + age + " años y cobra " + salary + " euros y es indefinido");
		}else{
			System.out.println(name + " tiene " + age + " años y cobra " + salary + " euros y NO es indefinido");
		}


		//6- Haz un bucle imprimiendo el sueldo que va ganando cada mes durante 12 meses (en cada línea mostrar el acumulado). Por ejemplo, si cobra 2000 al mes hay que mostrar: 2000, 4000, 6000, 8000, etc. Un número en cada línea.
		System.out.println("-------- 6 --------");

		int numeroMeses = 12;
		double totalGanado = 0;

		for(int i=1; i<=numeroMeses; i++){
              totalGanado += netSalary;

              System.out.println(totalGanado);
         }


        //7- El empleado va guardando un 30% de su sueldo neto en el banco, cada mes. El dinero que tiene en el banco le aporta un 2% de intereses cada mes. Haz un bucle que vaya mostrando, para cada mes, cuánto tiene acumulado en el banco y cuánto le dan de intereses ese mes. Tened en cuenta que cada mes va sumando más dinero de su sueldo y además se van acumulando los intereses mismos del banco.
        System.out.println("-------- 7 --------");

        double bankAccount = 0;
        int xcienIngreso = 30;
        int xcienInteres = 2;


        for(int i=1; i<=numeroMeses; i++){
            
              bankAccount += xcienValue(xcienIngreso, netSalary);
              double importeInteres = xcienValue(xcienInteres, bankAccount);
              bankAccount += importeInteres;

              System.out.println("El mes nº " + i + " hay " + bankAccount + " euros en la cuenta. Ha ganado " + importeInteres + " euros de interes.");
         }


	}

	public static double netSalary(int xcienRetencion, double salary){

		return salary * (100-xcienRetencion) / 100;

	}

	public static double xcienValue(int xcien, double salary){

		return salary * xcien / 100;

	}

}
