package Programa;


	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Random;

	public class Vendedores {
	
	

	    public static void main(String[] args) {
	    	// Integrantes
	    	//Nelson Hernando Guarin Benitez	    	
	    	//Politecnico Gran Colombiano
	    	//Desarollo
	        // Generar los archivos planos pseudoaleatorios necesarios
	        generateSalesMenFiles(5); // Generar 5 archivos de ventas de vendedores
	        generateProductsFile(5); // Generar información de 5 productos
	        generateSalesManInfoFile(12); // Generar información de 12 vendedores
	    }

	    public static void generateSalesMenFiles(int numFiles) {
	        for (int i = 1; i <= numFiles; i++) {
	            String fileName = "Vendedores_" + i + ".txt";
	            generateSalesMenFile(fileName);
	        }
	    }

	    public static void generateSalesMenFile(String fileName) {
	        try (FileWriter writer = new FileWriter(fileName)) {
	            Random random = new Random();
	            // Escribir ventas pseudoaleatorias en el archivo
	            writer.write("TipoDocumentoVendedor;NúmeroDocumentoVendedor\n");
	            for (int j = 1; j <= random.nextInt(10); j++) {
	                writer.write("Tipo" + random.nextInt(3) + ";" + random.nextInt(1000) + "\n");
	                writer.write("IDProducto" + random.nextInt(10) + ";" + random.nextInt(10) + "\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void generateProductsFile(int numProducts) {
	        String fileName = "productos.txt";
	        try (FileWriter writer = new FileWriter(fileName)) {
	            Random random = new Random();
	            // Escribir información pseudoaleatoria de productos en el archivo
	            for (int i = 1; i <= numProducts; i++) {
	                writer.write("IDProducto" + i + ";NombreProducto" + i + ";" + (random.nextDouble() * 100) + "\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void generateSalesManInfoFile(int numSalesmenCount) {
	        String fileName = "Vendedor.txt";
	        try (FileWriter writer = new FileWriter(fileName)) {
	            Random random = new Random();
	            // Escribir información pseudoaleatoria de vendedores en el archivo
	            for (int i = 1; i <= numSalesmenCount; i++) {
	                writer.write("TipoDocumento" + i + ";" + random.nextInt(1000) + ";NombresVendedor" + i + ";ApellidosVendedor" + i + "\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
