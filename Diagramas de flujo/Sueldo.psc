Algoritmo Sueldo
	Definir base Como Real;
	Definir venta1 Como Real;
	Definir venta2 Como Real;
	Definir venta3 Como Real;
	Definir comision Como Real;
	Escribir "Ingrese el sueldo base";
	Leer base;
	Escribir "Ingrese el monto de la venta 1";
	Leer venta1;
	Escribir "Ingrese el monto de la venta 2";
	Leer venta2;
	Escribir "Ingrese el monto de la venta 3";
	Leer venta3;
	comision <- ( venta1 + venta2 + venta3 ) / 10; 
	Escribir "La comision por esas 3 ventas es de: $", comision;
	Escribir "El sueldo total del mes es de: $ ", base + comision;
FinAlgoritmo
