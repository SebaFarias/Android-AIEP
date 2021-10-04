Algoritmo presupuestoBanquete
	Escribir "Ingrese cantidad de asistentes"
	Leer cantidad
	platillo <- 9500
	Si cantidad > 300 Entonces
		platillo <- 7500
	Fin Si	
	Si (cantidad > 200  y cantidad <= 300) 
		platillo <- 8500
	Fin Si
	precioFinal <- precio - descuento
	Escribir "Precio por platillo: $", platillo
	Escribir "Costo total: $", cantidad * platillo
FinAlgoritmo
