public class Main {
    public static void main(String[] args) {
        ShapeStorage storage = new ShapeStorage();

        storage.addShape("Polygon");
        storage.addShape("Hexagon");

        ShapeIterator iterator = new ShapeIterator(storage.getShapes());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Apply removing while iterating...");

        iterator = new ShapeIterator(storage.getShapes());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
