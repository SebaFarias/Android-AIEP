Algoritmo Por2ypor5
	Definir num Como Real;
	Definir esPor2ypor5 Como Logico;
	Escribir "Ingrese un número";
	Leer num;
	esPor2ypor5 <- num % 2 == 0 & num % 5 == 0 ;
	Si esPor2ypor5 Entonces
		Escribir "El numero ", num, " es divisible por 2 y por 5";
	SiNo
		Escribir "El numero ", num, "no es divisible por 2 y por 5";
	Fin Si
FinAlgoritmo
