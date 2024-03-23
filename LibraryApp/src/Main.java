public class Main {
    private Library library = new Library(); 
       
    public void showMenu(){
        var option = 0;
        do {
            Console.writeLine("Menu principal");
            Console.writeLine();
            Console.writeLine(" 1. Agregar  un libro a la biblioteca ");
            Console.writeLine(" 2. Eliminar un libro de la biblioteca");
            Console.writeLine(" 3. Prestar un libro.");
            Console.writeLine(" 4. Devolver un libro.");
            Console.writeLine(" 5. Libros disponibles.");
            Console.writeLine(" 6. Libros prestados.");
            Console.writeLine(" 7. Libros dañados ");
            Console.writeLine(" 8. Codigo del libro ");
            Console.writeLine();
            Console.writeLine(" 9. Salir del programa.");
            option = Integer.parseInt( Console.readLine());
        } while (option != 9);
    }
    public static void main (String [] args){
    new Main().showMenu();
    }
}
