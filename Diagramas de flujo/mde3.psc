Algoritmo mde3
	Definir num Como Real;
	Definir esMulti Como Logico;
	Escribir "Ingrese un número";
	Leer num;
	esPar <- num % 3 = 0;
	Si esPar Entonces
		Escribir "El numero ", num, " es multiplo de 3";
	SiNo
		Escribir "El numero ", num, " no es multiplo de 3";
	Fin Si
FinAlgoritmo
