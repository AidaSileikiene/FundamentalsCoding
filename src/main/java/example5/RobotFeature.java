package example5;

public class RobotFeature {
    // Pvz. feature gali buti spotify, youtube, navigation, calculator..
    private String name;

    public RobotFeature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RobotFeature{" +
                "name='" + name + '\'' +
                '}';
    }
}
