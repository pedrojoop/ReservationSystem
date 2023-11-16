public class Hotel {
    private String name;
    private String local;
    private int classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public void showTechnicalFiles() {
        System.out.println("Name: " + name);
        System.out.println("Local: " + local);
        System.out.println("Classification: " + classification);
    }
}
