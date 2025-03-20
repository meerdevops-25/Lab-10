public class ProxyPattern {
    /**
     * @author Abdul Moiz Meer
     */
    public static void main(String[] args) {
        Image image1 = new ProxyImage("Photo.jpg");
        System.out.println("Image object created, but not loaded yet.");

        image1.display();
        image1.display();
    }
}
