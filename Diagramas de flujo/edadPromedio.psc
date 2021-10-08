Algoritmo edadPromedio
	Definir i, n, acc Como Entero;
	Escribir "Indique la cantidad de alumnos para calcular su edad Promedio"
	Leer n
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese la edad del " i + 1, "° alumno";
		Leer edad;
		acc <- acc + edad;
	Fin Para
	Escribir "El promedio de las edades de los ",n," alumnos es ",acc/n;
FinAlgoritmo
