public static void ejercicio1 (int num1, int num2) {
		for(int i=num1;i<=num2;i++) {
			System.out.print(i+" ");
		}
	}
	public static void ejercicio2(int num1, int num2, int num3) {
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		for(int b=num2;b<=num3;b++) {
			if(b%3==0) {
				System.out.println(b);
			}
		}
	}
	public static double ejercicio3 (double altura, double radio) {
		
		double solucion=Math.PI*Math.pow(radio, 2)*altura;
			
		return solucion;
	}
	public static int ejercicio4 (int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static boolean ejercicio5(char letra1) {
		boolean respuesta;
		if (letra1=='A'|| letra1=='E'|| letra1=='I'||letra1=='O'||letra1=='U') {
			respuesta=true;
		}else if(letra1=='a'|| letra1=='e'|| letra1=='i'||letra1=='o'||letra1=='u') {
			respuesta=true;
		}else {
			respuesta=false;
		}
		return respuesta;
	}