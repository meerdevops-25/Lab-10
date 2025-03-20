class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
