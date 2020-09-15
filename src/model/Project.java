package model;

public class Project {
    private String projectName;

    private String projectLocation;
    private boolean isFavorite;

    public Project(){

    }

    public Project(String projectName, String projectLocation, boolean isFavorite) {
        this.projectName = projectName;
        this.projectLocation = projectLocation;
        this.isFavorite = isFavorite;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }
}
