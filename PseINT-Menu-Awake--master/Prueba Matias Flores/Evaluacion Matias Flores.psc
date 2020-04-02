//al inciciar el programa apretar enter para continuar 

SubProceso ArregloBidimencionales(n)
	escribir "ingrese cantidad de AWAKERS";
	leer x;
	definir arreglox como caracter;
	
	
	dimension arreglox[x,c];
	
	Para i<-0 Hasta x-1 Hacer
		Para j<-0 Hasta x-1  Hacer
			escribir "ingresa el nombre del AWAKER";
			
		FinPara
	
	FinPara

	
FinSubProceso


SubProceso ArregloSimple(n)	
	
	definir nombres, arreglo,nombre como caracter;
	definir x, i como entero;
	Escribir "ingrese cantidad de AWAKERS";
	leer x;
	Dimension  nombres[x];
	
	Para i<-0 Hasta x-1  Hacer
		Escribir "ingresa el nombre del AWAKER";
		leer nombres[i];
		arreglo <- nombres[i];
		
		escribir "los nombres son: ",nombres[i];
	FinPara
	
	
FinSubProceso


SubProceso RepetitivaPara(n)
	definir nombres,nombre como caracter;
	dimension nombres[10];
	definir i, sumatoria como entero;
	
	sumatoria<-0;
	
	Para i<-0 Hasta 10-1 Hacer
		escribir "ingrese nombres";
		leer nombres[i];
		
		Repetir
			si nombres[i] = nombres[i] Entonces
				sumatoria<- sumatoria +1;
				si sumatoria = 1 entonces 
					escribir "ningun nombre a sido repetido";	
				SiNo
					Escribir "repetido";
				FinSi				
			FinSi
		Hasta Que nombres[i] = nombres[i]; 
	FinPara
	
FinSubProceso


SubProceso RepetitivaRepetir(n)
	
	definir nombre,juanito como caracter;
	
	definir intentos como entero;
	juanito <- "Juan";
	intentos <-1;
	
	
	Repetir
		escribir "ingresa Nombre Con la letra J";
		leer nombre; 
		Si (nombre <> "juan") Entonces
			intentos<- intentos+1;
		SiNo
			Escribir "lo lograste Juan era un comodin en el intento ", intentos;
		FinSi
	Hasta Que nombre= juanito;
	
FinSubProceso


SubProceso RepetitivaMientras(n)
	definir dig Como Entero;
	definir cannum como entero;
	definir prome como real;	
	definir total Como Entero;	
	definir i como entero;
	
	escribir "cuantos digitos ingresara";
	leer cannum;
	total <- 0;
	Dimension dig[cannum];
	
	Para i <- 0 Hasta cannum-1 Con Paso 1 Hacer
		Escribir "escribir dato para la posicion :" ;
		leer dig[i];		
	FinPara
	Para i <- 0 Hasta cannum-1 Con Paso 1 Hacer
		total <- total 	+ dig[i];
	FinPara	
	prome<- total/cannum;
	escribir "El total es: ", total ," y el promedio es: ",prome;	
	esperar tecla;
	menu(n);
FinSubProceso


SubProceso CondicionalSegun(n)
	definir num como entero;
	escribir "ingresar digito (del 1 al 10)";
	leer num;
	
	Segun num Hacer
		1:
			escribir "Uno";
		2:
			escribir "Dos";
		3:
			escribir "Tres";
		4:
			escribir "Cuatro";
		5:
			escribir "Cinco";
		6:
			escribir "Seis";
		7:
			escribir "Siete";
		8:
			escribir "Ocho";
		9:
			escribir "Nueve";
		10:
			escribir "Dies";
		De Otro Modo:
			Escribir "ingreso un valor no valido";
			Esperar Tecla;			
			
	FinSegun
	menu(n);
FinSubProceso


SubProceso csianidada(n)
	definir wc como logico;	
	definir ducha como caracter;
	Escribir "decea ingresar Ducha? (Claro es si, Paso Es no)";
	leer ducha;
	Si ducha = "Claro"  Entonces
		Escribir "El valor de la ducha es $2500";
	SiNo
		Escribir "El valor del WC es $250";
	FinSi
	menu(n);
FinSubProceso

SubProceso condicionsi(n)
	definir nombre, genero como caracter;
	Escribir "Escribir nombre y genero del usuario(Masculino o Femenino)";
	
	leer nombre,genero;
	definir wc como logico;
	
	Si genero = "Masculino" Entonces
		
		Escribir "Ingresa al WC Hombres";
	SiNo
		Escribir "Ingresar al WC Mujeres";
	FinSi
	
	definir ducha Como caracter;
	Escribir "Desea Agregar Ducharse: (Claro es si, Paso Es no) ";
	leer ducha;
	Si ducha = "Claro" Entonces
		csianidada(n);
	SiNo
		menu(n);
	FinSi
	
	
	Esperar Tecla;
	menu(n);
FinSubProceso

SubProceso secuencial(n)
	
	definir num1,num2,num3,sum como entero;
	definir promedio como real;
	escribir "Ingrese 3 notas para promediar: ";
	leer num1,num2,num3;
	
	sum <- num1+num2+num3;
	promedio <- sum/3;
	escribir "El promedio de la suma de los digitos es: ", promedio;
	Esperar Tecla;
	
	menu(n);
	
FinSubProceso

SubProceso menu(n)
	//escribo el menu en pantalla 
	Limpiar Pantalla;
	Repetir
		Limpiar Pantalla;
		Escribir "..........Menu de Evaluacion..........";
		Escribir "......................................";
		Escribir "1.-Secuencial.........................";
		Escribir "2.-Condicional Si Entonces............";
		Escribir "3.-Condicional Si Entonces Anidado....";
		Escribir "4.-Condicional Segun..................";
		Escribir "5.-Repetitiva Mientras................";
		Escribir "6.-Repetitiva Repetir.................";
		Escribir "7.-Repetitiva Para....................";
		Escribir "8.-Arreglo Simple.....................";
		Escribir "9.-Arreglo Bidimencional..............";
		Escribir "10.-Salir.............................";
		definir opc como entero; 
		leer opc;
		//seleciono la opcion ingresa desde el teclado y muestro la funcion
		Segun opc Hacer
			1:
				escribir "Selecionaste la opcion 1 Secuencial";
				secuencial(n);
			2:
				Escribir "Selecionaste la opcion 2 Condicion Si";
				condicionsi(n);
				
			3:
				Escribir "Selecionaste la opcion 3 Condicion Si Anidada";
				csianidada(n);
			4:
				Escribir "Selecionaste la opcion 4 Condicional Segun";
				CondicionalSegun(n);
			5:
				Escribir "Selecionaste la opcion 5 Repetitiva Mientras";
				RepetitivaMientras(n);
			6:
				Escribir "Selecionaste la opcion 6 Repetitiva Repetir";
				RepetitivaRepetir(n);
			7:
				Escribir "Selecionaste la opcion 6 Repetitiva Para";
				RepetitivaPara(n);	
			8:
				Escribir "Selecionaste la opcion 8 Arreglo Simple";
				ArregloSimple(n);				
				
			9:
				Escribir "Selecionaste la opcion 9 Arreglo Bidimencionales";
				ArregloBidimencionales(n);				
				
				
			De Otro Modo:
				
		FinSegun
		Escribir "Presione enter para continuar";
        Esperar Tecla;	
		//termino el programa cuando se ingresa el numero 10
	Hasta Que opc =10;	
FinSubProceso


Proceso Evaluacion
	Limpiar Pantalla;
	definir n como entero; 		
	leer n;
	menu(n);
	
FinProceso
