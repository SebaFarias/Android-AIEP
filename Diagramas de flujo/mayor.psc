Algoritmo elMayor
	Definir num1 Como Real;
	Definir num2 Como Real;
	Definir max Como Real;
	Escribir "Ingrese un n�mero";
	Leer num1;
	max <- num1;
	Escribir "Ingrese otro n�mero";
	Leer num2;
	Si num2 > max Entonces
		max <- num2;
	Fin Si
	Escribir "El numero mayo entre ",num1," y ",num2, " es ", max;
FinAlgoritmo
