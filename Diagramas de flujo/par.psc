Algoritmo ParImpar
	Definir num Como Real;
	Definir esPar Como Logico;
	Escribir "Ingrese un número";
	Leer num;
	esPar <- num % 2 = 0;
	Si esPar Entonces
		Escribir "El numero ", num, " es par";
	SiNo
		Escribir "El numero ", num, " es impar";
	Fin Si
FinAlgoritmo
