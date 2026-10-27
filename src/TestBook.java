public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author("Cristiano", "cr7@gmail.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 1000, 19.50);
        Book anotherBook = new Book("more Java for dummy", new Author("Georgina", "gio@gmail.com", 'f'), 888, 25.95);

        System.out.println("Name: " + aBook.getAuthor().getName() + " - Email: " + aBook.getAuthor().getEmail());

        Book[] array = new Book[5];

        array[0] = new Book("Pepo Grillo", new Author("Francisco", "isco@gmail.com", 'm'), 3, 27.50);
        array[1] = new Book("Nueva vida", new Author("Peter", "amigoyvecinospidy@gmail.com", 'm'), 10, 30);
        array[2] = new Book("La saga de los longevos #1", new Author("Gumball", "asgumb@gmail.com", 'm'), 4, 35.50);
        array[3] = new Book("La saga de los longevos #2", new Author("Gumball", "asgumb@gmail.com", 'm'), 4, 35.50);
        array[4] = new Book("24-07", new Author("Alba", "diaal@gmail.com", 'f'), 50, 45.99);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
