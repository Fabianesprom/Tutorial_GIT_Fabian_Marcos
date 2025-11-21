public static void ejercicio2() {
		double raiz=0;
		for(int n=10;n<=25;n++) {
			raiz=Math.sqrt(Math.pow(n+5,4));
			System.out.println("EL resultado de la raiz es: "+raiz);
		}
		
}
public static void ejercicio1() {
	Scanner teclado=new Scanner(System.in);
	System.out.println("Intoduce un numero");
	byte numero=teclado.nextByte();
	System.out.println("El numero introducido es "+numero);
}
public static void ejercicio5() {
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce el valor del radio de la circunferencia:");
	float radio=teclado.nextFloat();
	double longitud=2*Math.PI*radio;
	double area=Math.PI*Math.pow(radio,2);
	System.out.println("El area es "+area+" y la longitud es "+longitud);
}
public static void ejercicio2(){
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce dos numeros distintos: ");
	int num1=teclado.nextInt(), num2=teclado.nextInt();
	
	if(num1>num2) {
		System.out.println("El numero uno es mayor que el numero dos");
	}else {
		System.out.println("El numero dos es mayor que el numero uno");
	}
}
public static void ejercicio14() {
	for(int n=10;n<=30;n++) {
		double raiz=Math.sqrt(Math.pow(n, 3));
		System.out.println("La raiz de "+n+" elevado al cuadrado es: "+raiz);
	}
}
public static void ejercicio1(int num1, int num2) {
		//Definimos el rango 
		int menor=Math.min(num1, num2);
		int mayor=Math.max(num1, num2);
		
		for(int i=menor;i<=mayor;i++) {
			System.out.println(i);
		}
	}