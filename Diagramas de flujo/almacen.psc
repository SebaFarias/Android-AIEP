Algoritmo calcularDescuento
	Escribir "Ingrese precio original"
	Leer precio
	Si precio > 250000 Entonces
		descuento <- precio * 0.15
	SiNo
		descuento <- precio * 0.08
	Fin Si
	precioFinal <- precio - descuento
	Escribir "Precio final: $", precioFinal
	Escribir "Descuento aplicado: $", descuento
FinAlgoritmo
