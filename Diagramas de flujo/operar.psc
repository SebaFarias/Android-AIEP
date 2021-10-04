Algoritmo Operar
	Definir num1 Como Real;
	Definir num2 Como Real;
	Definir operacion Como Real;
	Escribir "Ingrese un número";
	Leer num1;
	Escribir "Ingrese otro número";
	Leer num2;
	operacion <- -1;
	Mientras operacion < 1 | operacion > 4 Hacer
		Escribir "Escoje operacion ( (1)Suma (2)Resta (3)Multiplicacion (4)Division )";
		Leer operacion;
	Fin Mientras
	Segun operacion Hacer
		1:
			Escribir num1, " + ", num2, " = ", num1 + num2;
		2:
			Escribir num1, " - ", num2, " = ", num1 - num2;
		3:
			Escribir num1, " * ", num2, " = ", num1 * num2;
		4:
			Escribir num1, " / ", num2, " = ", num1 / num2;
		De Otro Modo:
			Escribir "Ha ocurrido un error, operación inválida"
	Fin Segun
FinAlgoritmo
